package com.example.fall_fest_ecozen_;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapt extends RecyclerView.Adapter<Adapt.holder> {
    ArrayList<List> list;
    public Adapt(ArrayList<List> lists){
        this.list=lists;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card, parent, false);
        Adapt.holder vH = new Adapt.holder(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull final holder holder, int position) {
        List list1=list.get(position);
        holder.text.setText(list1.getName());
        holder.text1.setText(list1.getNumber());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    /*public class holder extends RecyclerView.ViewHolder{
        TextView text,text1;

        public holder(@NonNull View itemView) {
            super(itemView);

            text=itemView.findViewById(R.id.number);
            text1=itemView.findViewById(R.id.items);
        }
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_card, parent, false);
        Adapt.holder vH = new Adapt.holder(view);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull final holder holder, int position) {
        List list1=list.get(position);
        holder.text.setText(list1.getName());
        holder.text1.setText(list1.getNumber());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }*/

public class holder extends RecyclerView.ViewHolder{
TextView text;
    TextView text1;
    public holder(@NonNull View itemView) {
        super(itemView);

        text=itemView.findViewById(R.id.number);
        text1=itemView.findViewById(R.id.items);
    }
}


}
