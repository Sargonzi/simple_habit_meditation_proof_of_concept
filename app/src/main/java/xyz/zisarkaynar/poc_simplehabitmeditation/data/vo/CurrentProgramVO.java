package xyz.zisarkaynar.poc_simplehabitmeditation.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.zisarkaynar.poc_simplehabitmeditation.viewholders.BaseViewHolder;

public class CurrentProgramVO implements MainScreenVO{

    @SerializedName("program-id")
    private String programId;

    @SerializedName("title")
    private String title;

    @SerializedName("current-period")
    private String currentPeriod;

    @SerializedName("background")
    private String background;

    @SerializedName("average-lengths")
    private List<Integer> averageLengths;

    @SerializedName("description")
    private String description;

    @SerializedName("sessions")
    private List<SessionsVO> sessionsVOS;

    public String getProgramId() {
        return programId;
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentPeriod() {
        return currentPeriod;
    }

    public String getBackground() {
        return background;
    }

    public List<Integer> getAverageLengths() {
        return averageLengths;
    }

    public String getDescription() {
        return description;
    }

    public List<SessionsVO> getSessionsVOS() {
        return sessionsVOS;
    }
}
