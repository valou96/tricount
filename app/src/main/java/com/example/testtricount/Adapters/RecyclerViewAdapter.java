package com.example.testtricount.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.example.testtricount.Models.Tricount;
import com.example.testtricount.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<Tricount> dataModelList;

    public RecyclerViewAdapter(List<Tricount> dataModelList) {
        this.dataModelList = dataModelList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_item, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.nameTricount.setText(String.valueOf(dataModelList.get(position).getTitre()));
        holder.messageTricount.setText(String.valueOf(dataModelList.get(position).get_description()));
    }

    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView nameTricount;
        TextView messageTricount;

        public RecyclerViewHolder(@NonNull View itemView){
            super(itemView);
            nameTricount = itemView.findViewById(R.id.nameTricount);
            messageTricount = itemView.findViewById(R.id.messageTricount);
        }
    }


}
