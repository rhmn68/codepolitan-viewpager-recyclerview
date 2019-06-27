package coffeecode.co.viewpagerfragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import coffeecode.co.viewpagerfragment.R;
import coffeecode.co.viewpagerfragment.adapter.DaftarKendaraanAdapter;
import coffeecode.co.viewpagerfragment.model.DaftarKendaraanModel;
import coffeecode.co.viewpagerfragment.networking.DaftarKendaraanConnector;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class MotorFragment extends Fragment {

    RecyclerView rvMotor;
    DaftarKendaraanAdapter daftarKendaraanAdapter;

    public MotorFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_motor, container, false);
        rvMotor = view.findViewById(R.id.rvMotor);
        rvMotor.setLayoutManager(new LinearLayoutManager(getActivity()));

        getDataMobilApi();

        return view;
    }

    private void getDataMobilApi() {
        DaftarKendaraanConnector.getClient().getDaftarMotor().enqueue(new Callback<ArrayList<DaftarKendaraanModel>>() {
            @Override
            public void onResponse(Call<ArrayList<DaftarKendaraanModel>> call, Response<ArrayList<DaftarKendaraanModel>> response) {
                daftarKendaraanAdapter = new DaftarKendaraanAdapter(getActivity(), response.body());
                daftarKendaraanAdapter.notifyDataSetChanged();

                rvMotor.setAdapter(daftarKendaraanAdapter);
            }

            @Override
            public void onFailure(Call<ArrayList<DaftarKendaraanModel>> call, Throwable t) {
                t.printStackTrace();
                Log.e("codepolitan", "networking error");
            }
        });
    }

}
