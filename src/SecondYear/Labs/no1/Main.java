package SecondYear.Labs.no1;

import static SecondYear.Labs.no1.Students.inputString;

public class Main {
    public static void main(String[] args) {
        Students studentsList = new Students();
        Student fifonz = new Student("Fifonż", "Nowakowski", 125104L);
        Student fifonz2 = fifonz;
        Student alfons = new Student("Alfons", "Kowalski", 125105L);
        Student franek = new Student("Franek", "Szprycha", 125106L);

        studentsList.addExistingStudent(fifonz);
        studentsList.addExistingStudent(alfons);
        studentsList.addExistingStudent(franek);

//        System.out.println("usuwam studenta którego nie ma na liscie");
//        studentsList.removeStudent(126108L);
//        System.out.println("usuwam studenta ktory jest na liscie");
//        studentsList.removeStudent(125104L);
//        System.out.println("");

        System.out.println("Sprawdzenie poprawnosci 'programu'");
        System.out.println("zad.1 Usuń studenta którego nie ma na liście (1)");
        System.out.println("zad.2 Usuń studenta który jest na liście");
        System.out.println("zad.3 dodaj studenta z tym samym numerem albumu");
        System.out.println("zad.4 zmodyfikuj dane studenta");
        System.out.println("zad.5 wyswietl dane studenta");
        System.out.println("zad.6 sprawdz działanie metody zwracającej studentów o numerach albumu większych od podanego");

        boolean runTime = true;
        while(runTime)
        switch (Integer.parseInt(inputString())){
            case 1:
                studentsList.removeStudent(126104L);
                break;
            case 2:
                studentsList.removeStudent(125104L);
                break;
            case 3:
                System.out.println("Dodaj studenta z numerem albumu = 125110");
                studentsList.addNewStudent();
                break;
            case 4:
                studentsList.addExistingStudent(fifonz);
                studentsList.changeStudentNames(125104L);
                break;
            case 5:
                studentsList.showStudent(125106L);
                break;
            case 6:
                studentsList.showStudentsAboveCertainAlbum(125105L);
                break;
            case 7:
                if (inputString().equals("q")){
                    runTime = false;
                    break;
                }
        }
    }
}
