package xyz.zisarkaynar.poc_simplehabitmeditation.data.model;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CategoriesProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.events.SHMEvent;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.SimpleHabitDataAgentImpl;
import xyz.zisarkaynar.poc_simplehabitmeditation.utils.SHMConstants;

public class SHMModel {
    public static SHMModel sObjectInstance;
    private List<TopicVO> topicVOS;
    private List<CurrentProgramVO> currentProgramVOS;
    private List<CategoriesProgramVO> categoriesProgramVOS;


    private SHMModel() {
        EventBus.getDefault().register(this);
        topicVOS = new ArrayList<>();
        currentProgramVOS = new ArrayList<>();
        categoriesProgramVOS = new ArrayList<>();
    }

    public static SHMModel getInstance() {
        if (sObjectInstance == null) {
            sObjectInstance = new SHMModel();
        }
        return sObjectInstance;
    }

    public List<TopicVO> getTopicVOS() {
        return topicVOS;
    }


    public List<CurrentProgramVO> getCurrentProgramVOS() {
        return currentProgramVOS;
    }

    public List<CategoriesProgramVO> getCategoriesProgramVOS() {
        return categoriesProgramVOS;
    }

    public void loadTopics() {
        SimpleHabitDataAgentImpl.getInstance().loadTopics(SHMConstants.PAGE, SHMConstants.ACCESS_TOKEN);
    }

    public void loadCurrentProgram() {
        SimpleHabitDataAgentImpl.getInstance().loadCurrentProgram(SHMConstants.PAGE, SHMConstants.ACCESS_TOKEN);
    }

    public void loadCategoriesProgram() {
        SimpleHabitDataAgentImpl.getInstance().loadCategoriesProgram(SHMConstants.PAGE, SHMConstants.ACCESS_TOKEN);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onTopicsLoaded(SHMEvent.TopicsLoadedEvent event) {
        topicVOS.addAll(event.getTopics());
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onCurrentProgramLoaded(SHMEvent.CurrentProgramLoadedEvnet evnet) {
        currentProgramVOS.addAll(evnet.getCurrentProgramVOS());
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void onCategoriesProgramLoaded(SHMEvent.CategoriesLoadedEvent event) {
        categoriesProgramVOS.addAll(event.getCategoriesProgramVOS());
    }
}
