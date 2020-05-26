package com.nullbugs.everyDay;

import java.util.LinkedHashMap;

public class LRUCache {

    private int capacity;
    private LinkedHashMap<String,Integer> map=new LinkedHashMap();

    public LRUCache(int capacity) {
        this.capacity= capacity;
    }

    public int get(int key) {
        return map.get(key)==null?1:map.get(key);
    }

    public void put(int key, int value) {
        if(map.size()>=capacity){
            //map.put
        }
        map.put(String.valueOf(key),value);
    }


    public static void main(String[] args) {

    }
}
