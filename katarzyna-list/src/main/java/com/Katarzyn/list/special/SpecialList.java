package com.Katarzyn.list.special;

/**
 * Created by Iga on 01.07.2017.
 */
public class SpecialList {
    SpecialListElement listHead;

    public void add(String s){
        SpecialListElement object = new SpecialListElement(s); //tworzy obiekt typu SpecialListELement, czy to s to String value?
            if (listHead == null){
                listHead = object;
            }else{
                SpecialListElement currentObject = listHead; // ustawiamy list head jako cuurentObject??
                while (currentObject.getNext()!= null){
                    currentObject = currentObject.getNext();
                }
                currentObject.setNext(object);
            }
    }

    public boolean remove(String s){

    }
    public String get(int index){

    }
    public int size(){

    }



}
