package com.example.fall_fest_ecozen_;

public class ItemList {
    String name;
    int index;

    public ItemList(String name,int index) {
        this.name = name;
        this.index=index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
