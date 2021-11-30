package com.midterm.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CollectionAdapter extends RecyclerView.Adapter<CollectionAdapter.ViewHolder> {
    ArrayList<CollectionDomain> collectionDomains;

    public CollectionAdapter(ArrayList<CollectionDomain> collectionDomains) {
        this.collectionDomains = collectionDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_collection,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.collectionName.setText(collectionDomains.get(position).getTitle());
        String picUrl="";
        switch (position){
            case 0:{
                picUrl="collection1";
                break;
            }
            case 1:{
                picUrl="collection2";
                break;
            }
            case 2:{
                picUrl="collection3";
                break;
            }
            case 3:{
                picUrl="collection4";
                break;
            }
        }
        int drawableResourceId = holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.collectionPic);
    }

    @Override
    public int getItemCount() {
        return collectionDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView collectionName;
        ImageView collectionPic;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            collectionName = itemView.findViewById(R.id.collectionName);
            collectionPic = itemView.findViewById(R.id.collectionPic);
        }
    }
}
