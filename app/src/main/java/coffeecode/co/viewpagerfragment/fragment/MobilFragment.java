package coffeecode.co.viewpagerfragment.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import coffeecode.co.viewpagerfragment.R;
import coffeecode.co.viewpagerfragment.adapter.DaftarKendaraanAdapter;
import coffeecode.co.viewpagerfragment.model.DaftarKendaraanModel;

public class MobilFragment extends Fragment {

    RecyclerView rvMobil;
    DaftarKendaraanAdapter daftarKendaraanAdapter;

    String[] dataTitle = new String[]{
            "Wrangler",
            "Chrysler",
            "4D Sedan",
            "Lake Vallet",
            "Chevrolet"
    };

    String[] dataDescription = new String[]{
            "The new Wrangler JL generation satisfies everything a Jeep lover loves, while making this hardcore off-roader more comfortable and livable for those with softer core requirements. - Autotrader",
            "Ultimately, the 300's core appeal is that there's nothing else quite like it on the road today. - Edmunds",
            "***BLUETOOTH WIRELESS / HANDS FREE***, ***MOONROOF / SUNROOF***, ***NAVIGATION / GPS***, ***PREMIUM SOUND***, ***BACK UP CAMERA***, ***NON-SMOKER***, ***LEATHER AND LOADED***, ***LOW MILES***, ***CLEAN CARFAX***, ***ONE OWNER CARFAX***, *** MUST FINANCE WITH DEALER FOR INTERNET PRICE ***.\n" +
                    "\n" +
                    "Odometer is 16556 miles below market average!\n" +
                    "19/30 City/Highway MPG\n" +
                    "\n" +
                    "\n" +
                    "CARFAX One-Owner.\n" +
                    "Clean CARFAX.\n" +
                    "\n" +
                    "\n" +
                    "To see more quality vehicles like this one http://www.SLVBUICKGMC.com/ or dial 801-265-1511.. Sales Tax, Title, Registration, License Fee's and Dealer Documentary Fee's are additional to the advertised price. Any purchase negotiated with someone other than the Internet Sales Department will NOT be renegotiated after the sale.",
            "*Sales price includes $500-1,000 finance discount. You must finance with Ally Bank, Chrysler Capital or one of our Credit Unions to obtain the $500-1000 finance discount. Factory subsidized interest rate loans are not eligible. If you do not finance or lease, then you are not eligible for the $1000 finance discount and your sale price will increase by $500-1000. Internet price and payments subject to change at Dealer discretion. Check with dealer for most updated information.",
            "SALT LAKE VALLEY Chevrolet Grand Opening Celebration! .\n" +
                    "\n" +
                    "2019 Chevrolet Equinox LT 1LT\n" +
                    "\n" +
                    "Odometer is 9478 miles below market average!\n" +
                    "25/30 City/Highway MPG\n" +
                    "***BACK UP CAMERA***, ***POWER DRIVER SEAT***, ***NON-SMOKER***, ***KEYLESS ENTRY***, ***CLEAN CARFAX***, ***ONE OWNER CARFAX***, ***CERTIFIED***, NEW CAR TRADE IN, 17\" Aluminum Wheels, 3.87 Final Drive Axle Ratio, 4-Wheel Disc Brakes, 8-Way Power Driver Seat Adjuster, ABS brakes, Air Conditioning, Automatic temperature control, Bluetooth® For Phone, Brake assist, Compass, Delay-off headlights, Driver door bin, Driver vanity mirror, Dual front impact airbags, Dual front side impact airbags, Electronic Stability Control, Four wheel independent suspension, Front Bucket Seats, Front Passenger 4-Way Manual Seat Adjuster, Front reading lights, Fully automatic headlights, Heated door mirrors, High-Intensity Discharge Headlights, Illuminated entry, Low tire pressure warning, Occupant sensing airbag, Outside temperature display, Overhead console, Panic alarm, Passenger door bin, Passenger vanity mirror, Power door mirrors, Power driver seat, Power steering, Power windows, Premium Cloth Seat Trim, Rear reading lights, Rear window defroster, Rear window wiper, Remote keyless entry, Security system, Speed control, Speed-sensing steering, Split folding rear seat, Steering wheel mounted audio controls, Tachometer, Telescoping steering wheel, Tilt steering wheel, Traction control, Trip computer, Variably intermittent wipers.\n" +
                    "Certified.\n" +
                    "Chevrolet Certified Pre-Owned Details:\n" +
                    "\n" +
                    "* Powertrain Limited Warranty: 72 Month/100,000 Mile (whichever comes first) from original in-service date\n" +
                    "* 172 Point Inspection\n" +
                    "* 24 months/24,000 miles (whichever comes first) CPO Scheduled Maintenance Plan and 3 days/150 miles (whichever comes first) Vehicle Exchange Program\n" +
                    "* Warranty Deductible: $0\n" +
                    "* Limited Warranty: 12 Month/12,000 Mile (whichever comes first) from certified purchase date\n" +
                    "* Roadside Assistance\n" +
                    "* Transferable Warranty\n" +
                    "* Vehicle History\n" +
                    "\n" +
                    "\n" +
                    "CARFAX One-Owner.\n" +
                    "Clean CARFAX.\n" +
                    "To see more quality vehicles like this one right here just click www.slvchevrolet.com or dial 801-969-8221."
    };

    int[] dataPrice = new int[]{
        55,
        27 ,
        21,
        22,
        25
    };

    String[] dataImageString = new String[]{
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/1C4HJXFN2KW522656/7f5c690efc2b77676ce458d8d763d9fc.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2C3CCARG2KH565296/7faed2403cec7ebd2c83312335a65b39.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2C3CCAEG8JH324511/45025f6766d7cfa7507870d6a5f4d188.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/1C4PJMCX5JD507207/7f30d7d60eb9ad0d586723def9fdef2d.jpg",
            "https://b6078f735493592bba5c-635338419ddfe71f69f5e1dbcbf2b86e.ssl.cf1.rackcdn.com/2GNAXUEV3K6162590/1e5e547f4ef824c0f69340e88f289966.jpg"
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
        showDaftarMobil(getListData());
        return view;
    }

    private void showDaftarMobil(List<DaftarKendaraanModel> body) {
        daftarKendaraanAdapter = new DaftarKendaraanAdapter(
                getActivity(),
                (ArrayList<DaftarKendaraanModel>) body);
        daftarKendaraanAdapter.notifyDataSetChanged();

        rvMobil.setAdapter(daftarKendaraanAdapter);
    }

    public ArrayList<DaftarKendaraanModel> getListData(){
        ArrayList<DaftarKendaraanModel> daftarMobil = new ArrayList<>();

        for (int i = 0; i < dataTitle.length; i++){
            daftarMobil.add(new DaftarKendaraanModel(
                    i,
                    dataImageString[i],
                    dataTitle[i],
                    dataDescription[i],
                    dataPrice[i]
            ));
        }
        return daftarMobil;
    }
}
