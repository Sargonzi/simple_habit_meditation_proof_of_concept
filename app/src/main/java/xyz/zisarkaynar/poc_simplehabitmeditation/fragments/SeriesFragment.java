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

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.zisarkaynar.poc_simplehabitmeditation.R;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.OneAdapter;
import xyz.zisarkaynar.poc_simplehabitmeditation.adapters.TwoAdapter;

public class SeriesFragment extends Fragment {

    @BindView(R.id.rvOne)
    RecyclerView mRecyclerViewOne;

    @BindView(R.id.rvTwo)
    RecyclerView mRecyclerViewTwo;

    @BindView(R.id.rvThree)
    RecyclerView mRecyclerViewThree;

    @BindView(R.id.rvFour)
    RecyclerView mRecyclerViewFour;

    @BindView(R.id.rvFive)
    RecyclerView mRecyclerViewFive;

    private OneAdapter mOneAdapter;
    private TwoAdapter mTwoAdapter;

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

        mOneAdapter = new OneAdapter(getContext());
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerViewOne.setAdapter(mOneAdapter);
        mRecyclerViewOne.setLayoutManager(linearLayoutManager1);

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerViewTwo.setAdapter(mOneAdapter);
        mRecyclerViewTwo.setLayoutManager(linearLayoutManager2);

        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerViewThree.setAdapter(mOneAdapter);
        mRecyclerViewThree.setLayoutManager(linearLayoutManager3);

        LinearLayoutManager linearLayoutManager4 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mRecyclerViewFour.setAdapter(mOneAdapter);
        mRecyclerViewFour.setLayoutManager(linearLayoutManager4);

        mTwoAdapter = new TwoAdapter(getContext());
        LinearLayoutManager linearLayoutManager5 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewFive.setAdapter(mTwoAdapter);
        mRecyclerViewFive.setLayoutManager(linearLayoutManager5);

        return view;
    }
}
