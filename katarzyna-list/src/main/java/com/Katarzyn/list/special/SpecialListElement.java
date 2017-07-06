package com.Katarzyn.list.special;

/**
 * Created by Iga on 01.07.2017.
 */
public class SpecialListElement {
    String value;
    SpecialListElement next;
    SpecialListElement prev;
    SpecialListElement current;

    public SpecialListElement(String value){
        this.value = value;
    }
    public void setNext(SpecialListElement current ) {
        this.next = next;
    }
    public String getNext(){
        return next;
    }
    public void setPrev(){
        this.prev = prev;
    }
    public String getPrev(){
        return prev;
    }


}
