package src.ASD.DataStructures.BasicStructures.OrderedDynamicArray;

import src.ASD.DataStructures.Person2;

public class OrderedDynamicArray {
    private Person2[] table;
    private int numberOfElements; // current count of elements in table

    public OrderedDynamicArray(int maxSize) {
        table = new Person2[maxSize];
        numberOfElements = 0; // no elements so we have 0 elements
    }
    public void add(Person2 value){ // adding new elements
        if (numberOfElements >= table.length){ // check if element can fit into array
            Person2[] tmpTable = new Person2[table.length+2];
            System.arraycopy(table, 0, tmpTable, 0, table.length); // copy to new bigger array
            table = tmpTable;
        }
        int j;
        for (j = 0; j < numberOfElements; j++){ //iterate over our array
            //should implement Comperable<Object> interface to get .compareTo on custom class
            if (table[j].compareTo(value) > 0){ //find place for new element
                break;
            }
        }
        for (int k = numberOfElements; k > j; k--) {    // move bigger elements to the right
            table[k] = table[k - 1];
        }

        table[numberOfElements] = value; //now we have place for new element - so add it
        numberOfElements++; // count num of elements
    }
    public Person2 get(int index){ // get Object from index
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
    public int find(Person2 searchElem){  // search for element
        for (int j = 0; j < numberOfElements; j++) {
            if (table[j].compareTo(searchElem) == 0) // check if we have object (linear search)
            {
                return j; // if found return its index
            }
        }
        return -1; // if not found
    }
    public void print() { // iterate over array and print contents one by one
        for (int i = 0; i < numberOfElements; i++)
            System.out.print(get(i).toString()+" ");
        System.out.println();

    }




    public static void main(String[] args) {
        int maxSize = 3;
        OrderedDynamicArray array = new OrderedDynamicArray(maxSize);

        array.add(new Person2("Ola", "Ząb", 58)); // 15
        array.add(new Person2("Ola", "Olczyk", 58)); // 14
        array.add(new Person2("Ala", "Olczyk", 58)); // 13
        array.add(new Person2("Ola", "Ząb", 18)); // 5
        array.add(new Person2("Ola", "Olczyk", 18)); // 4
        array.add(new Person2("Ala", "Olczyk", 18)); // 3
        array.add(new Person2("Olek", "Olczyk", 19)); // 9
        array.add(new Person2("Alex", "Olczyk", 19)); // 7
        array.add(new Person2("Igor", "Olczyk", 19)); // 8
        array.add(new Person2("Ala", "Alowska", 18)); // 2
        array.add(new Person2("Ala", "Alowiak", 18)); // 1
        array.add(new Person2("Ola", "Ząbek", 28)); // 11
        array.add(new Person2("Olek", "Olczykiewicz", 19)); // 10
        array.add(new Person2("Olek", "Alowski", 19)); // 6
        array.add(new Person2("Zygfryd", "Ząb", 32)); // 12
        array.print();

        array.remove(1);
        array.print();

        array.add(new Person2("Lolek", "Las", 18));
        Person2 p2 = new Person2("Ala", "Alowska", 44);
        array.add(p2);
        Person2 p3 = new Person2("Ala", "Alowiak", 44);
        array.add(p3);
        array.print();


        int find = array.find(p2);
        System.out.println(""+find);

        int find2 = array.find(new Person2("Ula", "Alowska", 44));
        System.out.println(""+find2);

        int find3 = array.find(new Person2("Lolek", "Las", 18));
        System.out.println(""+find3);


        int findx = array.find(p2);
        System.out.println(""+findx);

        int find2x = array.find(new Person2("Ula", "Alowska", 44));
        System.out.println(""+find2x);

        int find3x = array.find(new Person2("Lolek", "Las", 18));
        System.out.println(""+find3x);

    }
}