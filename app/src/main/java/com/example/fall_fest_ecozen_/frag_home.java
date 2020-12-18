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

public class frag_home extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayList<List> lists=new ArrayList<>();
        lists.add(new List("List 1","8"));
        lists.add(new List("List 2","2"));
        lists.add(new List("List 3","2"));
        lists.add(new List("List 4","2"));
        lists.add(new List("List 5","2"));
        lists.add(new List("List 6","2"));
        lists.add(new List("List 7","2"));
        lists.add(new List("List 8","2"));

        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(getContext());
        adapter=new Adapt(lists);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
