package com.Katarzyna.list;

/**
 * Created by Iga on 01.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        SpecialList myList = new SpecialList();
        myList.add("pierwszy element");
        myList.add("drugi element");
        myList.add("trzeci element");
        myList.add("czwarty element");
        System.out.println(myList);
    }
}
