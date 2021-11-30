package com.midterm.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.midterm.finalproject.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View viewRoot = binding.getRoot();
        setContentView(viewRoot);

        ArrayList<SlideModel> images = new ArrayList<>();
        images.add(new SlideModel(R.drawable.collection1, ScaleTypes.CENTER_CROP));
        images.add(new SlideModel(R.drawable.collection2, ScaleTypes.CENTER_CROP));

        binding.imageSlider.setImageList(images);

        recyclerViewCollection();
        recyclerViewRecent();
        recyclerViewShop();
    }

    private void recyclerViewCollection(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.collectionList.setLayoutManager(linearLayoutManager);

        ArrayList<CollectionDomain> collectionDomains=new ArrayList<>();
        collectionDomains.add(new CollectionDomain("Something", "collection1"));
        collectionDomains.add(new CollectionDomain("Something", "collection2"));
        collectionDomains.add(new CollectionDomain("Something", "collection3"));
        collectionDomains.add(new CollectionDomain("Something", "collection4"));

        adapter = new CollectionAdapter(collectionDomains);
        binding.collectionList.setAdapter(adapter);
    }

    private void recyclerViewRecent(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        binding.recentList.setLayoutManager(linearLayoutManager);

        ArrayList<RecentDomain> recentDomains=new ArrayList<>();
        recentDomains.add(new RecentDomain("Pizza Hut", "recent1", "10 Street, City"));
        recentDomains.add(new RecentDomain("Nusret Et", "recent2", "10 Street, City"));
        recentDomains.add(new RecentDomain("BurgerKing", "recent3", "10 Street, City"));
        recentDomains.add(new RecentDomain("Develi", "recent4", "10 Street, City"));

        adapter = new RecentAdapter(recentDomains);
        binding.recentList.setAdapter(adapter);
    }

    private void recyclerViewShop(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        binding.shopList.setLayoutManager(linearLayoutManager);

        ArrayList<ShopDomain> shopDomains=new ArrayList<>();
        shopDomains.add(new ShopDomain("Pumpkin Hummus", "shop1", "Beyti Restaurant, Taksim", "4.8","(233 ratings)"));
        shopDomains.add(new ShopDomain("Sweets Baklava with Nuts", "shop2", "Karaköy Güllüoğlu, Beyoğlu", "4.8","(233 ratings)"));
        shopDomains.add(new ShopDomain("Fish", "shop3", "Mercan, Kadıköy", "4.8","(233 ratings)"));
        shopDomains.add(new ShopDomain("Meat Pizza With Chicken..", "shop4", "Karaköy Güllüoğlu, Beyoğlu", "4.8","(233 ratings)"));
        shopDomains.add(new ShopDomain("Wood Fired Pizza", "shop5", "Beyti Restaurant, Taksim", "4.8","(233 ratings)"));

        adapter = new ShopAdapter(shopDomains);
        binding.shopList.setAdapter(adapter);
    }
}