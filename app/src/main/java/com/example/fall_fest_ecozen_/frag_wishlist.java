package com.example.fall_fest_ecozen_;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class frag_wishlist extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_wishlist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<ItemList> lists=new ArrayList<>();
        lists.add(new ItemList("Item 1",100));
        lists.add(new ItemList("Item 2",35));
        lists.add(new ItemList("Item 3",54));
        lists.add(new ItemList("Item 4",110));
        lists.add(new ItemList("Item 5",90));
        lists.add(new ItemList("Item 6",20));
        lists.add(new ItemList("Item 7",10));
        lists.add(new ItemList("Item 8",30));
        lists.add(new ItemList("Item 9",150));
        lists.add(new ItemList("Item 10",160));

        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        adapter=new ItemAdapter(lists);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
