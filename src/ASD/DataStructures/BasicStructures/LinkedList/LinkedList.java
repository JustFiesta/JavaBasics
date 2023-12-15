package src.ASD.DataStructures.BasicStructures.LinkedList;

import java.util.List;

public class LinkedList {
    ListElement head; // first element (default null bcs we have no elements)
    int size = 0;

    public LinkedList() {
    }

    static class ListElement{ // atomic element (data and pointer to next element (on default null))
        private int data;
        private ListElement nextElement;

        public ListElement(int data) {
            this.data = data;
            this.nextElement = null;
        }
    }
    public int addLast(int data){ // adds data as last element and returns it if added correctly
        ListElement last;

        if (head == null){ // if list is empty set new element as head
            last  = new ListElement(data);
            head = last;
            size++;
            return data; // return - as adding was successful
        }

        last = head; // if we have first element, check next elements
        while (last.nextElement != null){
            last = last.nextElement;
        }

        // when while stops the next element will be null, so we place data there
        last.nextElement = new ListElement(data);
        size++;
        return data;
    }
    public int getLast(){ // fetches data from last element
        ListElement last = head;

        if (last == null) return 0; // if list is empty return 0

        while (last.nextElement != null){
            last = last.nextElement;
        }
        return last.data;
    }
    public boolean removeLast(){ // removes last element
        ListElement last = head;
        ListElement previous = null; // one element behind last - it will be switched as final last element

        if (last == null) return false; // if list is empty return 0

        while (last.nextElement != null){
            previous = last;
            last = last.nextElement;
        }

        size--;
        previous.nextElement = null;
        return true;
    }
    public int size(){
        return size;
    }
    public boolean contains(int data){ // check if we have element with data
        ListElement last = head;
        int elementsLeft = size; // num of elements left to check

        while (elementsLeft >= 0){
            if (last.data == data){ // return first element found
                return true;
            }else {
                last = last.nextElement; // otherwise switch to next element
                elementsLeft--;
            }
        }
        return false; // nothing was found
    }
    public void print(){ // print whole list
        ListElement last = head;

        System.out.print("{ ");
        while (last != null){
            System.out.print(last.data + " ");
            last = last.nextElement;
        }
        System.out.println("}");
    }


    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        System.out.println(myList.addLast(5));
        myList.addLast(2);
        myList.addLast(6);
        myList.addLast(8);
        myList.addLast(10);

        myList.print();

        System.out.println(myList.getLast());

        myList.removeLast();
        myList.print();

        System.out.println(myList.size());

        System.out.println(myList.contains(5));

    }
}
