package xyz.zisarkaynar.poc_simplehabitmeditation.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProgramVO {
    @SerializedName("program-id")
    private String programId;

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private String image;

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

    public String getImage() {
        return image;
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
