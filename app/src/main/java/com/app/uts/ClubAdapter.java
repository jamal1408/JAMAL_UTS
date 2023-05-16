package com.app.uts;

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

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ListViewHolder> {
    private static RecyclerViewClickListener listener;
    private ArrayList<Club> listClub;


    public ClubAdapter(ArrayList<Club> list, RecyclerViewClickListener listener) {
        this.listClub = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_club_row, parent, false );
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Club club = listClub.get(position);
        Glide.with(holder.itemView.getContext())
                .load(club.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into (holder.imgPhoto);
        holder.tvName.setText(club.getName());
        holder.tvDetail.setText(club.getDetail());
    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

    public void setListClub (ArrayList<Club> listClub) {
        this.listClub = listClub;
    }

    static class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(@NonNull View view) {
            super(view);
            imgPhoto = itemView.findViewById(R.id.img_item_club);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }
    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
}
