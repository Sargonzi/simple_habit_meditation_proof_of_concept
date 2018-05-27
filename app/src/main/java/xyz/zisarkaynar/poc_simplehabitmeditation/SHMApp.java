package xyz.zisarkaynar.poc_simplehabitmeditation;

import android.app.Application;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.model.SHMModel;

public class SHMApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SHMModel.getInstance().loadData();
    }
}
