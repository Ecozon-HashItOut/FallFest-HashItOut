package com.example.fall_fest_ecozen_;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.holder1> {
    ArrayList<ItemList> list;
    public ItemAdapter(ArrayList<ItemList> lists){
        this.list=lists;
    }
    @NonNull
    @Override
    public holder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wish_card, parent, false);
        ItemAdapter.holder1 vH = new ItemAdapter.holder1(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull final holder1 holder, int position) {
        ItemList list1=list.get(position);
        holder.text.setText(list1.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class holder1 extends RecyclerView.ViewHolder {
        TextView text;
        public holder1(@NonNull View itemView) {
            super(itemView);

            text=itemView.findViewById(R.id.number1);
        }
    }
}
