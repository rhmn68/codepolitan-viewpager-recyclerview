package coffeecode.co.viewpagerfragment.networking;

import java.util.ArrayList;

import coffeecode.co.viewpagerfragment.model.DaftarKendaraanModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface DaftarKendaraanService {

    /**
     * @Link : https://api.myjson.com/bins/pnnk7 == Buat Motor
     * @Link : https://api.myjson.com/bins/nxhwn == Buat Pesawat
     * */

    @GET("pnnk7")
    Call<ArrayList<DaftarKendaraanModel>> getDaftarMotor();

    @GET("nxhwn")
    Call<ArrayList<DaftarKendaraanModel>> getDaftarPesawat();
}
