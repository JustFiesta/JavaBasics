package Labs.no4.Zadanie2;

import java.time.LocalDate;

public class Building {
    String name;
    int year, floors;


    public Building(String name, int year, int floors){
        this.name = name;
        this.year = year;
        this.floors = floors;
    }
    public int Age(int year){
        LocalDate currentYear = LocalDate.now();
        int age = currentYear.getYear() - year;
        return age;
    }
    @Override // Co to dokładnie robi?
    public String toString() {
        return ", nazwa budynku: " + name + ", rok budowy=" + year + ", piętra: " + floors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getFloors() {
        return floors;
    }
}
