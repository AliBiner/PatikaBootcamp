package com.alibiner.Week5.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
    private static final Object[] EMPTY_ARRAY = {};
    private static final int DEFAULT_INITIAL = 10;

    private Object[] elementArray;
    private int size = 0;

    public MyArrayList() {
        this.elementArray = new Object[DEFAULT_INITIAL];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity>0)
            this.elementArray = new Object[initialCapacity];
        else if (initialCapacity==0) {
            this.elementArray = EMPTY_ARRAY;
        }
        else {
            throw new IllegalArgumentException("Geçerli bir initial capacity değeri giriniz!");
        }
    }

    public void add(E e){
        if (size==getCapacity())
            grow();
        elementArray[size] = e;
        size++;
    }

    public void add(int index,E e){
        if (index>=getCapacity())
            throw new IndexOutOfBoundsException("array capacity: " + getCapacity());
        else {
            if (size==getCapacity())
                grow();
            elementArray[index] = e;
            size++;
        }
    }

    public void remove(int index){
        if (index>= getCapacity()){
            throw new IndexOutOfBoundsException("array capacity: " + getCapacity());
        }
        elementArray[index] = null;
        size--;
        for (; index< elementArray.length; index++){
            if (index!= elementArray.length-1)
                elementArray[index] = elementArray[index+1];
        }
    }

    public int indexOf(E e){
        for (int i = 0; i < elementArray.length; i++) {
            if (elementArray[i] == null)
                continue;
            if (elementArray[i].equals(e))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(E e){
        for (int i = elementArray.length -1; i >= 0; i--) {
            if (elementArray[i] == null)
                continue;
            if (elementArray[i].equals(e))
                return i;
        }
        return -1;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void clear(){
        elementArray = EMPTY_ARRAY;
        size=0;
    }

    public boolean contains(E e){
        for (Object obj : elementArray){
            if (obj==null)
                continue;
            if (obj.equals(e))
                return true;
        }
        return false;
    }

    public  Object[] toArray(){
        Object[] newArray = new Object[size];
        int newArrayIndex = 0;
        for (int i = 0; i < elementArray.length; i++) {
            if (elementArray[i] == null)
                continue;
            newArray[newArrayIndex] = elementArray[i];
            newArrayIndex++;
        }
        return newArray;
    }

    public MyArrayList<E> sublist(int start,int finish){
        if (start<0 || start>getCapacity()-1)
            throw new IndexOutOfBoundsException();
        if (finish<0 || finish>getCapacity()-1)
            throw new IndexOutOfBoundsException();
        if (finish<start)
            throw new IllegalArgumentException();

        MyArrayList<E> newArray = new MyArrayList<>();
        for (; start < finish ; start++) {
            newArray.add((E) elementArray[start]);
        }
        return newArray;
    }

    public int size(){
        return size;
    }

    public int getCapacity(){
        return elementArray.length;
    }

    private void grow(){
        int oldCapacity = elementArray.length;
        if (oldCapacity>0 || elementArray!=EMPTY_ARRAY){
            int newCapacity = oldCapacity*2;
            elementArray = Arrays.copyOf(elementArray,newCapacity);
        }
    }

    public void print(){
        int i = 0;
        for (Object obj : elementArray)
            System.out.println(obj + " " + i++);
    }

    public Object get(int index){
        if (index>getCapacity())
            return null;
        return elementArray[index];
    }

    @Override
    public String toString() {
        StringBuilder array = new StringBuilder();
        array.append("[ ");
        for (int i = 0; i < elementArray.length; i++){
            if (elementArray[i] == null)
                continue;
            array.append(elementArray[i]);
            if (i== elementArray.length -1) {
                 array.append(" ]");
                 break;
            }
            if (elementArray[i+1] == null){
                continue;
            }
            else {
                array.append(", ");
            }
        }
        array.append(" ]");
        return array.toString();
    }
}
