package coffeecode.co.viewpagerfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MobilFragment extends Fragment {

    RecyclerView rvMobil;
    DaftarMobileAdapter daftarMobileAdapter;

    String[] dataTitle = new String[]{
            "Rubicon",
            "Jeep",
            "Rubicon",
            "Jeep",
            "Rubicon"
    };

    String[] dataDescription = new String[]{
            "Ini mobil Rubicon tahun 2019, eh 2018 ketang!",
            "Ini mobil Jeep tahun 2017, eh 2018 ketang!",
            "Ini mobil Rubicon tahun 2019, eh 2018 ketang!",
            "Ini mobil Jeep tahun 2017, eh 2018 ketang!",
            "Ini mobil Rubicon tahun 2019, eh 2018 ketang!"
    };

    int[] dataPrice = new int[]{
        20000,
        50000,
        20000,
        50000,
        20000
    };

    int[] dataImage = new int[]{
        R.drawable.mobil_1,
        R.drawable.mobil_2,
        R.drawable.mobil_1,
        R.drawable.mobil_2,
        R.drawable.mobil_1
    };

    public MobilFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mobil, container, false);
        rvMobil = view.findViewById(R.id.rvMobil);
        rvMobil.setLayoutManager(new LinearLayoutManager(getActivity()));

        daftarMobileAdapter = new DaftarMobileAdapter(
                getActivity(),
                getListData());
        daftarMobileAdapter.notifyDataSetChanged();

        rvMobil.setAdapter(daftarMobileAdapter);
        return view;
    }


    public ArrayList<DaftarMobilModel> getListData(){
        ArrayList<DaftarMobilModel> daftarMobil = new ArrayList<>();

        for (int i = 0; i < dataTitle.length; i++){
            daftarMobil.add(new DaftarMobilModel(
                    dataImage[i],
                    dataTitle[i],
                    dataDescription[i],
                    dataPrice[i]
            ));
        }
        return daftarMobil;
    }
}
