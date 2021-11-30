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

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>{
    ArrayList<ShopDomain> shopDomains;

    public ShopAdapter(ArrayList<ShopDomain> shopDomains) {
        this.shopDomains = shopDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_shop,parent,false);
        return new ShopAdapter.ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.shopName.setText(shopDomains.get(position).getName());
        holder.shopAddress.setText(shopDomains.get(position).getAddress());
        holder.shopScore.setText(shopDomains.get(position).getAddress());
        holder.shopRatings.setText(shopDomains.get(position).getRatings());
        String picUrl="";
        switch (position){
            case 0:{
                picUrl="shop1";
                break;
            }
            case 1:{
                picUrl="shop2";
                break;
            }
            case 2:{
                picUrl="shop3";
                break;
            }
            case 3:{
                picUrl="shop4";
                break;
            }
            case 4:{
                picUrl="shop5";
                break;
            }
        }
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.shopPic);
    }

    @Override
    public int getItemCount() {
        return shopDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView shopName;
        TextView shopAddress;
        TextView shopScore;
        TextView shopRatings;
        ImageView shopPic;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            shopName = itemView.findViewById(R.id.shopName);
            shopAddress = itemView.findViewById(R.id.shopAddress);
            shopScore = itemView.findViewById(R.id.shopScore);
            shopRatings = itemView.findViewById(R.id.shopRatings);
            shopPic = itemView.findViewById(R.id.shopPic);
        }
    }
}
