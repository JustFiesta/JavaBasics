package src.ASD.DataStructures.BasicStructures.DynamicArray;

import java.util.Arrays;
import java.util.Comparator;

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
                return j; // if found return its index
        }
        return -1; // if not found
    }
    public void print() { // iterate over array and print contents one by one
        for (int i = 0; i < numberOfElements; i++)
            System.out.print(get(i).toString()+" ");
        System.out.println();

    }


    class Person2 implements Comparable<Person2>{
        private String imie, nazwisko;
        private int wiek;

        public Person2()
        {
            imie = "";
            nazwisko = "";
            wiek = 0;
        }

        public Person2(String imie, String nazwisko, int wiek)
        {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wiek = wiek;
        }

        @Override
        public String toString() {
            return "Person{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + '}';
        }

        public String getImie() {
            return imie;
        }

        public String getNazwisko() {
            return nazwisko;
        }

        public int getWiek() {
            return wiek;
        }

        public void setImie(String imie) {
            this.imie = imie;
        }

        public void setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
        }

        public void setWiek(int wiek) {
            this.wiek = wiek;
        }

        @Override
        public int compareTo(Person2 p) {
            // kolejnosc kryteriow:
            // wiek (od najmlodszej osoby)
            // nazwisko (alfabetycznie od A do Z)
            // imie (alfabetycznie od A do Z)

            //osoba.compareTo(osoba2)

            if(this.getWiek() < p.getWiek())
                return -1;
            if(this.getWiek() > p.getWiek())
                return 1;
            if(this.getWiek() == p.getWiek() && this.getNazwisko().compareTo(p.getNazwisko()) != 0) // ten sam wiek, rozne nazwiska
                return this.getNazwisko().compareTo(p.getNazwisko());
            if(this.getWiek() == p.getWiek() && this.getNazwisko().compareTo(p.getNazwisko()) == 0) // ten sam wiek, takie same nazwiska
                return this.getImie().compareTo(p.getImie());
            return 0;
        }
    }
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