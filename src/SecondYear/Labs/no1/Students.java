package src.SecondYear.Labs.no1;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

public class Students implements Serializable {
    private LinkedList<Student> studentList = new LinkedList<>();

    public void addExistingStudent(Student student){
        for (Student studentFromList:studentList) {
            if (studentFromList.getAlbumNumber().equals(student.getAlbumNumber())){
                throw new RuntimeException("Taki student już istnieje");
            }
        }
        this.studentList.add(student);
        System.out.println("Dodano studenta!");
    }
    public void addNewStudent() {
        Student student = new Student(
            inputString(), inputString(), (long) Integer.parseInt(inputString())
        );
        for (Student studentFromList:studentList) {
            if (studentFromList.getAlbumNumber().equals(student.getAlbumNumber())){
                throw new RuntimeException("Taki student już istnieje");
            }
        }
        this.studentList.add(student);
        System.out.println("Dodano studenta!");
    }
    public void removeStudent(Long albumNumber) {
        for (Student student:studentList) {
            student.toString();
            if (albumNumber.equals(student.getAlbumNumber())) {
                studentList.remove(student);
                System.out.println("Usunięto studenta!");
                break;
            }else {
                throw new RuntimeException("Student o takim numerze albumu nie istnieje!");
            }
        }
    }
    public void showStudent(Long albumNumber){
        for (Student student:studentList) {
            if (albumNumber.equals(student.getAlbumNumber())){
                System.out.println(student.toString());
                break;
            }
        }
    }
    public LinkedList showStudentsAboveCertainAlbum(Long albumNumber){
        LinkedList<Student> studentListAboveAlbumNumber = new LinkedList<>();
        for (Student student:studentList) {
            if (albumNumber >= student.getAlbumNumber()){
                studentListAboveAlbumNumber.add(student);
            }
            break;
        }
        return studentListAboveAlbumNumber;

    }
    public void changeStudentNames(Long albumNumber){
        for (Student student:studentList) {
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
}

