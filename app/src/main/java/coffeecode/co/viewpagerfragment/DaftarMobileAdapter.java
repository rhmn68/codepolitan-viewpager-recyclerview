package coffeecode.co.viewpagerfragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class DaftarMobileAdapter extends
    RecyclerView.Adapter<DaftarMobileAdapter.ViewHolder>{

    Context context;
    ArrayList<DaftarMobilModel> dataMobil;

    public DaftarMobileAdapter(Context context, ArrayList<DaftarMobilModel> dataMobil) {
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
        viewHolder.setData(dataMobil.get(i));
    }

    @Override
    public int getItemCount() {
        return dataMobil.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivMobil;
        TextView tvTitle, tvDesc, tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMobil = itemView.findViewById(R.id.ivMobil);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }

        public void setData(DaftarMobilModel data){
            tvTitle.setText(data.getTitle());
            tvDesc.setText(data.getDescription());
            tvPrice.setText("Rp."+data.getPrice());
            //Cara Pertama
//            ivMobil.setImageResource(data.getImage());
            //Cara Kedua (Glide)
            Glide.with(itemView).load(data.getImage()).into(ivMobil);
        }
    }
}
