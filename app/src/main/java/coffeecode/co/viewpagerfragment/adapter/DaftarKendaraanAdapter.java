package coffeecode.co.viewpagerfragment.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import coffeecode.co.viewpagerfragment.activity.DetailActivity;
import coffeecode.co.viewpagerfragment.model.DaftarKendaraanModel;
import coffeecode.co.viewpagerfragment.R;

public class DaftarKendaraanAdapter extends
    RecyclerView.Adapter<DaftarKendaraanAdapter.ViewHolder>{

    private Context context;
    private ArrayList<DaftarKendaraanModel> dataMobil;

    public DaftarKendaraanAdapter(Context context, ArrayList<DaftarKendaraanModel> dataMobil) {
        this.context = context;
        this.dataMobil = dataMobil;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_daftar_mobil, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.setData( dataMobil.get(i));
    }

    @Override
    public int getItemCount() {
        return dataMobil.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMobil;
        TextView tvTitle, tvDesc, tvPrice;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMobil = itemView.findViewById(R.id.ivMobil);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }

        void setData(final DaftarKendaraanModel data){
            tvTitle.setText(data.getTitle());
            tvDesc.setText(data.getDescription());
            tvPrice.setText("Rp."+data.getPrice());
            Glide.with(itemView).load(data.getImage()).into(ivMobil);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, DetailActivity.class);

                    Bundle bundle = new Bundle();
                    bundle.putParcelable(DetailActivity.KEY_KENDARAAN, data);

                    intent.putExtras(bundle);

                    context.startActivity(intent);
                }
            });
        }
    }
}
