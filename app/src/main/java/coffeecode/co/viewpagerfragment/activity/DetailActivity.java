package coffeecode.co.viewpagerfragment.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import coffeecode.co.viewpagerfragment.R;
import coffeecode.co.viewpagerfragment.model.DaftarKendaraanModel;

public class DetailActivity extends AppCompatActivity {

    TextView tvTitle, tvDesc, tvPrice;
    ImageView ivKendaraan;

    DaftarKendaraanModel daftarKendaraanModel = new DaftarKendaraanModel();
    String title, price, desc, image;

    public final static String KEY_KENDARAAN = "KEY_KENDARAAN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);
        tvPrice = findViewById(R.id.tvPrice);
        ivKendaraan = findViewById(R.id.ivKendaraan);

        Bundle bundle = getIntent().getExtras();
        daftarKendaraanModel = bundle.getParcelable(KEY_KENDARAAN);

        if (daftarKendaraanModel != null) {
            title = daftarKendaraanModel.getTitle();
            price = "Rp."+daftarKendaraanModel.getPrice();
            desc = daftarKendaraanModel.getDescription();
            image = daftarKendaraanModel.getImage();

            tvTitle.setText(title);
            tvPrice.setText(price);
            tvDesc.setText(desc);
            Glide.with(this).load(image).into(ivKendaraan);
        }
    }
}
