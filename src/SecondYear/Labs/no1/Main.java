package src.SecondYear.Labs.no1;

import java.io.*;

import static src.SecondYear.Labs.no1.Students.inputString;

public class Main {
    public static void main(String[] args) {

        Students studentsList = deserializeStudentsList();

        Student fifonz = new Student("Fifonż", "Nowakowski", 125104L);
        Student alfons = new Student("Alfons", "Kowalski", 125105L);
        Student franek = new Student("Franek", "Szprycha", 125106L);

        studentsList.addExistingStudent(fifonz);
        studentsList.addExistingStudent(alfons);
        studentsList.addExistingStudent(franek);

        //Excercises
        System.out.println("Sprawdzenie poprawnosci 'programu'");
        System.out.println("zad.1 Usuń studenta którego nie ma na liście (1)");
        System.out.println("zad.2 Usuń studenta który jest na liście");
        System.out.println("zad.3 dodaj studenta z tym samym numerem albumu");
        System.out.println("zad.4 zmodyfikuj dane studenta");
        System.out.println("zad.5 wyswietl dane studenta");
        System.out.println("zad.6 sprawdz działanie metody zwracającej studentów o numerach albumu większych od podanego");
        System.out.println("zad.7 zapisz liste studentów do pliku students.bin");
        System.out.println("zad.8 wczytaj liste studentów na starcie programu");

        //Run time var
        boolean runTime = true;

        //Basic Options loop
        while(runTime)
        switch (inputString()){
            case "1":
                studentsList.removeStudent(126104L);
                break;
            case "2":
                studentsList.removeStudent(125104L);
                break;
            case "3":
                System.out.println("Dodaj studenta z numerem albumu = 125110");
                studentsList.addNewStudent();
                break;
            case "4":
                studentsList.addExistingStudent(fifonz);
                studentsList.changeStudentNames(125104L);
                break;
            case "5":
                studentsList.showStudent(125106L);
                break;
            case "6":
                studentsList.showStudentsAboveCertainAlbum(125105L);
                break;
            case "7":
                serializeStudentsList(studentsList);
                break;
            case "q":
                runTime = false;
                break;
        }
    }
    //method for object serialization
    private static void serializeStudentsList(Students studentsList){
        try {
            FileOutputStream outputFile = new FileOutputStream(".\\students.bin");
            ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);
            //write object to .bin
            outputStream.writeObject(studentsList);

            outputStream.close();
            outputFile.close();

            System.out.println("Zapisano listę!");

        } catch (IOException e) {
            System.out.println("Ups! Coś poszło nie tak przy zapisie list, spróbuj ponownie");
        }
    }
    //same but for deserialization
    private static Students deserializeStudentsList(){

        File studentList = new File(".\\students.bin");
        if (studentList.exists()){
            Students studentsList = null;
            try {
                FileInputStream inputFile = new FileInputStream(".\\students.bin");
                ObjectInputStream inputStream = new ObjectInputStream(inputFile);

                //load students list from .bin file into variable
                studentsList = (Students) inputStream.readObject();

                inputStream.close();
                inputFile.close();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ups! Coś poszło nie tak przy odczytaniu listy, spróbuj ponownie");
            }
            return studentsList;
        }else {
            System.out.println("Nie znaleziono pliku students.bin");
            return new Students();
        }
    }
}
