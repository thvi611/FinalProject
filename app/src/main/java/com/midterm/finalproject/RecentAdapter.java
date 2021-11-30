package com.midterm.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.ViewHolder> {
    ArrayList<RecentDomain> recentDomains;

    public RecentAdapter(ArrayList<RecentDomain> recentDomains) {
        this.recentDomains = recentDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_recent,parent,false);
        return new RecentAdapter.ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recentName.setText(recentDomains.get(position).getTitle());
        holder.recentAddress.setText(recentDomains.get(position).getAddress());
        String picUrl="";
        switch (position){
            case 0:{
                picUrl="recent1";
                break;
            }
            case 1:{
                picUrl="recent2";
                break;
            }
            case 2:{
                picUrl="recent3";
                break;
            }
            case 3:{
                picUrl="recent4";
                break;
            }
        }
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.recentPic);
    }

    @Override
    public int getItemCount() {
        return recentDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView recentName;
        TextView recentAddress;
        ImageView recentPic;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            recentName = itemView.findViewById(R.id.recentName);
            recentAddress = itemView.findViewById(R.id.recentAddress);
            recentPic = itemView.findViewById(R.id.recentPic);
        }
    }
}
