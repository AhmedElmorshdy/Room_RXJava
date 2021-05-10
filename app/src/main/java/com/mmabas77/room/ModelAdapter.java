package com.mmabas77.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.viewHolderDat> {
    List<Model>models;
    Context context;

    public ModelAdapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolderDat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.design,parent,false);

        return new viewHolderDat(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderDat holder, int position) {
      Model current = models.get(position);
      holder.textView.setText(current.getTitle());
      holder.textView2.setText(current.getBody());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public static class viewHolderDat extends RecyclerView.ViewHolder{
        TextView textView;
        TextView textView2;

        public viewHolderDat(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
