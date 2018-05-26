package xyz.zisarkaynar.poc_simplehabitmeditation.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesProgramVO {

    @SerializedName("category-id")
    private String categoryId;

    @SerializedName("title")
    private String title;

    @SerializedName("programs")
    private List<ProgramVO> programVOS;

    public String getCategoryId() {
        return categoryId;
    }

    public String getTitle() {
        return title;
    }

    public List<ProgramVO> getProgramVOS() {
        return programVOS;
    }
}
