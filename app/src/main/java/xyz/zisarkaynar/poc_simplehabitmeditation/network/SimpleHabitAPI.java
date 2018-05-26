package xyz.zisarkaynar.poc_simplehabitmeditation.network;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.responses.CategoriesProgramResponse;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.responses.CurrentProgramResponse;
import xyz.zisarkaynar.poc_simplehabitmeditation.network.responses.TopicsResponse;

public interface SimpleHabitAPI {

    @FormUrlEncoded
    @POST("getTopics.php")
    Call<TopicsResponse> loadTopics(@Field("page") int pageIndex, @Field("access_token") String accessToken);

    @FormUrlEncoded
    @POST("getCategoriesPrograms.php")
    Call<CategoriesProgramResponse> loadCategoriesProgram(@Field("page") int pageIndex, @Field("access_token") String accessToken);


    @FormUrlEncoded
    @POST("getCurrentProgram.php")
    Call<CurrentProgramResponse> loadCurrentProgram(@Field("page") int pageIndex, @Field("access_token") String accessToken);
}
