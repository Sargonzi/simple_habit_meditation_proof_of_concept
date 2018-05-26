package xyz.zisarkaynar.poc_simplehabitmeditation.network;

import com.google.gson.Gson;

import org.greenrobot.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CategoriesProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.CurrentProgramVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.data.vo.TopicVO;
import xyz.zisarkaynar.poc_simplehabitmeditation.events.SHMEvent;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.responses.CategoriesProgramResponse;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.responses.CurrentProgramResponse;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.responses.TopicsResponse;
import xyz.zisarkaynar.poc_simplehabitmeditation.utils.SHMConstants;

public class SimpleHabitDataAgentImpl implements SimpleHabitDataAgent {


    private SimpleHabitAPI mSimpleHabitAPI;
    private static SimpleHabitDataAgentImpl sObjInstance;
    private Retrofit retrofit;

    public SimpleHabitDataAgentImpl() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(SHMConstants.SHM_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .client(okHttpClient)
                .build();

        mSimpleHabitAPI = retrofit.create(SimpleHabitAPI.class);

    }

    public static SimpleHabitDataAgentImpl getInstance() {
        if (sObjInstance == null) {
            sObjInstance = new SimpleHabitDataAgentImpl();
        }
        return sObjInstance;
    }


    @Override
    public void loadTopics(int pageNo, String accessToken) {
        Call<TopicsResponse> topicsResponseCall = mSimpleHabitAPI.loadTopics(pageNo, accessToken);
        topicsResponseCall.enqueue(new Callback<TopicsResponse>() {
            @Override
            public void onResponse(Call<TopicsResponse> call, Response<TopicsResponse> response) {
                TopicsResponse topicsResponse = response.body();
                List<TopicVO> topicVOList = topicsResponse.getTopics();
                SHMEvent.TopicsLoadedEvent event = new SHMEvent.TopicsLoadedEvent(topicVOList);
                EventBus.getDefault().post(event);
            }

            @Override
            public void onFailure(Call<TopicsResponse> call, Throwable t) {

            }
        });

    }

    @Override
    public void loadCurrentProgram(int pageNo, String accessToken) {
        Call<CurrentProgramResponse> currentProgramResponseCall = mSimpleHabitAPI.loadCurrentProgram(pageNo, accessToken);
        currentProgramResponseCall.enqueue(new Callback<CurrentProgramResponse>() {
            @Override
            public void onResponse(Call<CurrentProgramResponse> call, Response<CurrentProgramResponse> response) {
                CurrentProgramResponse currentProgramResponse = response.body();
                List<CurrentProgramVO> currentProgramVOS = currentProgramResponse.getCurrentProgramVOS();
                SHMEvent.CurrentProgramLoadedEvnet event = new SHMEvent.CurrentProgramLoadedEvnet(currentProgramVOS);
                EventBus.getDefault().post(event);
            }

            @Override
            public void onFailure(Call<CurrentProgramResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadCategoriesProgram(int pageNo, String accessToken) {
        Call<CategoriesProgramResponse> categoriesProgramResponseCall = mSimpleHabitAPI.loadCategoriesProgram(pageNo, accessToken);
        categoriesProgramResponseCall.enqueue(new Callback<CategoriesProgramResponse>() {
            @Override
            public void onResponse(Call<CategoriesProgramResponse> call, Response<CategoriesProgramResponse> response) {
                CategoriesProgramResponse categoriesProgramResponse = response.body();
                List<CategoriesProgramVO> categoriesProgramVOS = categoriesProgramResponse.getCategoriesProgramVOS();
                SHMEvent.CategoriesLoadedEvent event = new SHMEvent.CategoriesLoadedEvent(categoriesProgramVOS);
                EventBus.getDefault().post(event);
            }

            @Override
            public void onFailure(Call<CategoriesProgramResponse> call, Throwable t) {

            }
        });
    }
}
