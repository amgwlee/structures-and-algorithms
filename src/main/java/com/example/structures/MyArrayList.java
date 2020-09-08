package com.example.structures;


//custom implementation of a Vector or ArrayList
//dynamically resizes by adding half of current size if overflow is reached
public class MyArrayList {

    //default size
    //initial size factor to resize by
    private final int initialSize = 16;

    private Object[] data;

    private int arrayIndex;

    private int arrayLength;

    public MyArrayList() {
        this.data = new Object[initialSize];
        this.arrayLength = initialSize;
        this.arrayIndex = 0;
    }


    //add half of current size
    private void increaseSizeAndReallocate() {
        arrayLength = arrayLength + (arrayLength / 2);
        Object newData[] = new Object[arrayLength];
        for (int i=0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    //cut current size in half
    private void decreaseSizeAndReallocate() {
        arrayLength = arrayLength / 2;
        Object newData[] = new Object[arrayLength];
        for (int i=0; i < data.length; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    //number of items
    public int size() {
        return arrayIndex;
    }

    //number of items it can hold
    public int capacity() {
        return arrayLength;
    }

    //checks if array is empty
    public boolean is_empty() {
        for (int i = 0; i < arrayLength; i++) {
            if (data[i] != null) {
                return false;
            }
        }
        return true;
    }

    //get item at index, throw index oob error
    public Object get(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= arrayLength) {
            throw new IndexOutOfBoundsException(index + " is not a valid index");
        }
        return data[index];
    }

    //add item to end
    public void push(Object o) {
        if(arrayIndex == arrayLength - 1){
            //we need to increase the size of data[]
            increaseSizeAndReallocate();
        }
        data[arrayIndex] = o;
        arrayIndex++;
    }

    //insert item at index, move all values down
    public void insert(int index, Object o) {
        //check to make sure array can handle moving all elements down
        if(arrayIndex == arrayLength - 1){
            //we need to increase the size of data[]
            increaseSizeAndReallocate();
        }
        //shift all elements down one until given index
        for (int i = arrayIndex; i >= index; i--) {
            data[i+1] = data[i];
        }
        //add new element
        data[index] = o;
        arrayIndex++;
    }

    //remove from end, returning value
    //if size is at 1/4 capacity, resize to half current size
    public Object pop() {
        Object o = data[arrayIndex];
        data[arrayIndex] = null;
        arrayIndex--;

        //check to see if array is small enough to size down
        if(arrayIndex <= arrayLength / 4){
            //we need to decrease the size of data[]
            decreaseSizeAndReallocate();
        }

        return o;
    }

    //delete item at index, move all values up
    public void delete(int index) {
        //shift all elements up one until given index
        for (int i = index; i < arrayIndex; i++) {
            data[i] = data[i+1];
        }
        arrayIndex--;
    }

    //looks for value and removes index with that value, in every instance
    public void remove(Object o) {
        for (int i = 0; i < arrayLength; i++) {
            if (data[i].equals(o)) {
                delete(i);
            }
        }
    }

    //searches for value and returns first index with that value, -1 if not found
    public int find(Object o) {
        for (int i = 0; i < arrayLength; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }
}
