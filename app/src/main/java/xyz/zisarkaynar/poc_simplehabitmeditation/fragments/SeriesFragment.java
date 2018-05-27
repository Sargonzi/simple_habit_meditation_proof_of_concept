package xyz.zisarkaynar.poc_simplehabitmeditation.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.MeditateScreenAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.ProgramsAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.TopicsAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.events.SHMEvent;

public class SeriesFragment extends Fragment {

    @BindView(R.id.rvMain)
    RecyclerView rvMain;

    private MeditateScreenAdapter meditateScreenAdapter;

    private void SeriesFragment() {
    }

    public static SeriesFragment newInstance() {
        SeriesFragment seriesFragment = new SeriesFragment();
        return seriesFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_series, container, false);
        ButterKnife.bind(this, view);
        rvMain.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        meditateScreenAdapter = new MeditateScreenAdapter(getContext());
        rvMain.setAdapter(meditateScreenAdapter);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMainScreenLoaded(SHMEvent.MainScreenLoadedEvent event) {
        meditateScreenAdapter.setNewData(event.getMainScreenVOS());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onErrorInvoked(SHMEvent.ErrorInvokingAPIEvent event) {
        Toast.makeText(getContext(), event.getErrorMsg(), Toast.LENGTH_LONG).show();
    }
}
