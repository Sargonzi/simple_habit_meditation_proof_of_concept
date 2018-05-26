package xyz.zisarkaynar.poc_simplehabitmeditation.data.vo;

import com.google.gson.annotations.SerializedName;

public class SessionsVO {
    @SerializedName("session-id")
    private String sessiongId;

    @SerializedName("title")
    private String title;

    @SerializedName("length-in-seconds")
    private int lengthInSeconds;

    @SerializedName("file-path")
    private String filePath;

    public String getSessiongId() {
        return sessiongId;
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public String getFilePath() {
        return filePath;
    }
}
