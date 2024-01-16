package src.SecondYear.Labs.no1;

import SecondYear.Labs.no1.Student1;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Students1 implements Serializable {
    private LinkedList<Student1> studentList = new LinkedList<>();

    public void addExistingStudent1(Student1 student){
        for (Student1 studentFromList:studentList) {
            if (studentFromList.getAlbumNumber().equals(student.getAlbumNumber())){
                throw new RuntimeException("Taki student już istnieje");
            }
        }
        this.studentList.add(student);
        System.out.println("Dodano studenta!");
    }
    public void addNewStudent1() {
        Student1 student = new Student1(
            inputString(), inputString(), (long) Integer.parseInt(inputString())
        );
        for (Student1 studentFromList:studentList) {
            if (studentFromList.getAlbumNumber().equals(student.getAlbumNumber())){
                throw new RuntimeException("Taki student już istnieje");
            }
        }
        this.studentList.add(student);
        System.out.println("Dodano studenta!");
    }
    public void removeStudent1(Long albumNumber) {
        for (Student1 student:studentList) {
            student.toString();
            if (albumNumber.equals(student.getAlbumNumber())) {
                studentList.remove(student);
                System.out.println("Usunięto studenta!");
                break;
            }else {
                throw new RuntimeException("Student1 o takim numerze albumu nie istnieje!");
            }
        }
    }
    public void showStudent1(Long albumNumber){
        for (Student1 student:studentList) {
            if (albumNumber.equals(student.getAlbumNumber())){
                System.out.println(student.toString());
                break;
            }
        }
    }
    public LinkedList showStudent1sAboveCertainAlbum(Long albumNumber){
        LinkedList<Student1> studentListAboveAlbumNumber = new LinkedList<>();
        for (Student1 student:studentList) {
            if (albumNumber >= student.getAlbumNumber()){
                studentListAboveAlbumNumber.add(student);
            }
            break;
        }
        return studentListAboveAlbumNumber;

    }
    public void changeStudent1Names(Long albumNumber){
        for (Student1 student:studentList) {
            if (albumNumber == student.getAlbumNumber()){
                System.out.println("Podaj nowe imie studenta");
                student.setName(inputString());
                System.out.println("Podaj nowe nazwisko studenta");
                student.setLastname(inputString());
                break;
            }
        }
    }
    public static String inputString() {
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public static String inputWithPrompt(String prompt){
        System.out.println("Podaj " + prompt + ":");
        return inputString();
    }
}

