package src.ASD.DataStructures.BasicStructures.DynamicArray;

import java.util.Arrays;

public class DynamicArray {
    private Object[] table;
    private int numberOfElements; // current count of elements in table

    public DynamicArray(int maxSize) {
        table = new Object[maxSize];
        numberOfElements = 0; // no elements so we have 0 elements
    }
    public void add(Object value){ // adding new elements
        if (numberOfElements >= table.length){ // check if element can fit into array
            Object[] tmpTable = new Object[table.length+2];
            System.arraycopy(table, 0, tmpTable, 0, table.length); // copy to new bigger array
            table = tmpTable;
        }


        table[numberOfElements] = value; //now we have place for new element - so add it
        numberOfElements++; // count num of elements
    }
    public Object get(int index){ // get Object from index
        return table[index];
    }
    public int size(){ // get count of our elements
        return numberOfElements;
    }
    public boolean remove(int index){ // remove element
        if (numberOfElements == 0 || index > numberOfElements || index < 0) return false; // if we dont have elements || index exeeds range || index on -
        for (int j = index; j < numberOfElements - 1; j++){
            table[j] = table[j + 1];
        }
        numberOfElements--;
        return true;
    }
    public int find(Object searchElem){  // search for element
        for (int j = 0; j < numberOfElements; j++)
        {
            if (table[j].equals(searchElem)) // check if we have object (linear search)
                return j; // if found return its index
        }
        return -1; // if not found
    }
    public void print() { // iterate over array and print contents one by one
        for (int i = 0; i < numberOfElements; i++)
            System.out.print(get(i).toString()+" ");
        System.out.println();

    }
//    public void print2(){
//        System.out.println(Arrays.toString(table));
//    } // it returns whole table to its a bit wrong
    public static void main(String[] args) {
        DynamicArray testArray = new DynamicArray(5);

        testArray.add(5);

        testArray.get(3);

        testArray.add(4);
        testArray.add(5);
        testArray.add(7);

        System.out.println(testArray.find(7));

        testArray.remove(2);

        System.out.println(testArray.find(7));

        testArray.print();

        System.out.println(testArray.size());
    }
}