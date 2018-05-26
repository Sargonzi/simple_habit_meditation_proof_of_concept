package xyz.zisarkaynar.poc_simplehabitmeditation.network;

public interface SimpleHabitDataAgent {
    void loadTopics(int pageNo, String accessToken);

    void loadCurrentProgram(int pageNo, String accessToken);

    void loadCategoriesProgram(int pageNo, String accessToken);

}
