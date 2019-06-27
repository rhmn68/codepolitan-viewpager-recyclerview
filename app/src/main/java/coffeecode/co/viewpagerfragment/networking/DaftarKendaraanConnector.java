package coffeecode.co.viewpagerfragment.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DaftarKendaraanConnector {

    /**
     * @BaseUrl = https://api.myjson.com/bins/
     * */
    private static final String BASE_URL = "https://api.myjson.com/bins/";

    public static DaftarKendaraanService getClient(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DaftarKendaraanService.class);
    }
}
