package com.example.bahasapemrogaman;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBahasaAdapter extends RecyclerView.Adapter<ListBahasaAdapter.ListviewHolder> {

    private ArrayList<Bahasa> listBahasa;

    public ListBahasaAdapter(ArrayList<Bahasa> list){
        this.listBahasa = list;
    }
    @NonNull
    @Override
    public ListviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_bahasa, viewGroup, false);
        return new ListviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListviewHolder holder, int position) {
        Bahasa bahasa = listBahasa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(bahasa.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(bahasa.getName());
        holder.tvDetail.setText(bahasa.getDetail());

    }

    @Override
    public int getItemCount() {
        return listBahasa.size();
    }

    class ListviewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListviewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvDetail =itemView.findViewById(R.id.tv_item_detail);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
