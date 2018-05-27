package xyz.zisarkaynar.poc_simplehabitmeditation.data.model;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.MainScreenVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.events.SHMEvent;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.SimpleHabitDataAgentImpl;
import xyz.zisarkaynar.poc_simplehabitmeditation.utils.SHMConstants;

public class SHMModel {

    public static SHMModel sObjectInstance;
    private List<MainScreenVO> mainScreenVOS;
    private MeditateScreenAdapter meditateScreenAdapter;

    private SHMModel() {
        EventBus.getDefault().register(this);
        mainScreenVOS = new ArrayList<>();
    }

    public static SHMModel getInstance() {
        if (sObjectInstance == null) {
            sObjectInstance = new SHMModel();
        }
        return sObjectInstance;
    }

    public List<MainScreenVO> getMainScreenVOS() {
        return mainScreenVOS;
    }

    public void loadData() {
        SimpleHabitDataAgentImpl.getInstance().loadCurrentProgram(SHMConstants.PAGE, SHMConstants.ACCESS_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onCurrentProgramLoaded(SHMEvent.CurrentProgramLoadedEvent event) {
        mainScreenVOS.add(event.getCurrentProgramVOS());
        SimpleHabitDataAgentImpl.getInstance().loadCategoriesProgram(SHMConstants.PAGE, SHMConstants.ACCESS_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onCategoriesProgramLoaded(SHMEvent.CategoriesLoadedEvent event) {
        mainScreenVOS.addAll(event.getCategoriesProgramVOS());
        SimpleHabitDataAgentImpl.getInstance().loadTopics(SHMConstants.PAGE, SHMConstants.ACCESS_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onTopicsLoaded(SHMEvent.TopicsLoadedEvent event) {
        mainScreenVOS.addAll(event.getTopics());
        SHMEvent.MainScreenLoadedEvent mainEvent = new SHMEvent.MainScreenLoadedEvent(mainScreenVOS);
        EventBus.getDefault().post(mainEvent);
    }


}
