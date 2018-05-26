package xyz.zisarkaynar.poc_simplehabitmeditation.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;

public class CurrentProgramResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("currentProgram")
    private List<CurrentProgramVO> currentProgramVOS;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public List<CurrentProgramVO> getCurrentProgramVOS() {
        return currentProgramVOS;
    }
}
