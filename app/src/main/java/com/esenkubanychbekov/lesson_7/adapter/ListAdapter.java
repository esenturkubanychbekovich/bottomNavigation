package com.esenkubanychbekov.lesson_7.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.esenkubanychbekov.lesson_7.databinding.ItemList2Binding;
import com.esenkubanychbekov.lesson_7.databinding.ItemListBinding;
import com.esenkubanychbekov.lesson_7.model.Home;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.HomeViewHolder> {
    private Context mContext;
    private ArrayList<Home> list = new ArrayList<>();

    public ListAdapter(Context context, ArrayList<Home> list) {
        mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemList2Binding binding = ItemList2Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
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
        private ItemList2Binding binding;

        public HomeViewHolder(@NonNull ItemList2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Home home){
            binding.listImg.setImageResource(home.getImage());
            binding.listTxt.setText(home.getName());
        }
    }
}
