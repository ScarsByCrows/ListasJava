package com.mycompany.javaarraylists;

import java.util.ArrayList;

public class JavaArrayLists {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<>();
        
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        
        arrayList.add("Wola");
        arrayList.add("Volví");
        arrayList.add("Tonotos");
        
        ArrayList<String> total = new ArrayList<>();
        total.add("Nuevo");
        
        total.addAll(arrayList);
        arrayList.set(2, "Dick");
        
        arrayList.remove(0);
        
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        
        
    }
}
