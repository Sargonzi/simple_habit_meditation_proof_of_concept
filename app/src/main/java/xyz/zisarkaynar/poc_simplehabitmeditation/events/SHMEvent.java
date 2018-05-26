package xyz.zisarkaynar.poc_simplehabitmeditation.events;

import java.util.List;

import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CategoriesProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;

public class SHMEvent {

    public static class TopicsLoadedEvent {
        private List<TopicVO> topics;

        public TopicsLoadedEvent(List<TopicVO> topics) {
            this.topics = topics;
        }

        public List<TopicVO> getTopics() {
            return topics;
        }
    }

    public static class CategoriesLoadedEvent {
        private List<CategoriesProgramVO> categoriesProgramVOS;

        public CategoriesLoadedEvent(List<CategoriesProgramVO> categoriesProgramVOS) {
            this.categoriesProgramVOS = categoriesProgramVOS;
        }

        public List<CategoriesProgramVO> getCategoriesProgramVOS() {
            return categoriesProgramVOS;
        }
    }

    public static class CurrentProgramLoadedEvnet {
        private List<CurrentProgramVO> currentProgramVOS;

        public CurrentProgramLoadedEvnet(List<CurrentProgramVO> currentProgramVOS) {
            this.currentProgramVOS = currentProgramVOS;
        }

        public List<CurrentProgramVO> getCurrentProgramVOS() {
            return currentProgramVOS;
        }
    }

    public static class ErrorInvokingAPIEvent {
        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }
}
