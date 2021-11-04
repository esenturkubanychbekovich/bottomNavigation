package com.esenkubanychbekov.lesson_7.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.esenkubanychbekov.lesson_7.databinding.ItemListBinding;
import com.esenkubanychbekov.lesson_7.model.Home;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {
    private Context mContext;
    private ArrayList<Home> list = new ArrayList<>();

    public HomeAdapter(Context context, ArrayList<Home> list) {
        mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new HomeViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
            holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{
        private ItemListBinding binding;

        public HomeViewHolder(@NonNull ItemListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Home home){
            binding.icon.setImageResource(home.getImage());
            binding.iconName.setText(home.getName());
        }
    }
}
