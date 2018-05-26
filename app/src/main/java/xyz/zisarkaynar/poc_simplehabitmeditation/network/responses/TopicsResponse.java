package xyz.zisarkaynar.poc_simplehabitmeditation.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;

public class TopicsResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private String page;

    @SerializedName("topics")
    private List<TopicVO> topics;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<TopicVO> getTopics() {
        return topics;
    }
}
