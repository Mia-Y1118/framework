package example.abe.com.framework.network;


import com.google.gson.JsonElement;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by abe on 16/5/22.
 */
public interface ABService {
        @GET("mobileAppServlet")
        Call<JsonElement> getData(@QueryMap HashMap<String, String> options);
}