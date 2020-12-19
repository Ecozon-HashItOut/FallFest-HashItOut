package com.example.fall_fest_ecozen_;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.holder1> {
    ArrayList<ItemList> list;
    private OnItemClickListener listener;
    /*private boolean hasLoadButton = true;

    public boolean isHasLoadButton() {
        return hasLoadButton;
    }

    public void setHasLoadButton(boolean hasLoadButton) {
        this.hasLoadButton = hasLoadButton;
        notifyDataSetChanged();
    }*/


    public ItemAdapter(ArrayList<ItemList> lists,OnItemClickListener listener){
        this.list=lists;this.listener=listener;
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
        holder.text1.setText(String.valueOf(list1.getIndex()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public interface OnItemClickListener{
        void onItemClick(View v, int position);
    }

    public class holder1 extends RecyclerView.ViewHolder {
        TextView text,text1;
        Button extfab;
        public holder1(@NonNull View itemView) {
            super(itemView);
            text=itemView.findViewById(R.id.number1);
            text1=itemView.findViewById(R.id.index);
            extfab=itemView.findViewById(R.id.extFab);
            extfab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(view,getAbsoluteAdapterPosition());
                }
            });
        }
    }
}
