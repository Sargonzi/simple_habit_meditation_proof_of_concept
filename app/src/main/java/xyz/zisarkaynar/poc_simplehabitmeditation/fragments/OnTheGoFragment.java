package xyz.zisarkaynar.poc_simplehabitmeditation.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.zisarkaynar.poc_simplehabitmeditation.R;

public class OnTheGoFragment extends Fragment {

    private void OnTheGoFragment() {

    }

    public static OnTheGoFragment newInstance() {
        OnTheGoFragment onTheGoFragment = new OnTheGoFragment();
        return  onTheGoFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onthego, container, false);
        return view;
    }
}
