package Labs.test3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Conference implements Registration {
    //Lista przechowująca uczestników
    static ArrayList<Participant> participantList = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        Scanner usrInput = new Scanner(System.in);

        //Menu
        System.out.println("=== Witamy w programie do planowania konferencji! ===");

        boolean programRunTime = true;
        while (programRunTime){

            System.out.println("Wybierz interesującą cię opcję:");
            System.out.println("1 - dodaj uczestnika");
            System.out.println("2 - usuń uczestnika");
            System.out.println("3 - wyświetl listę uczestników");
            System.out.println("4 - wyświetl pomoc");
            System.out.println("5 - zapisz listę uczestników do pliku");
            System.out.println("6 - wyświetl listę uczestników z pliku");
            System.out.println("9 - wyjdź");

            int usrChoice = usrInput.nextInt();
            usrInput.nextLine();

            switch (usrChoice){
                case 1:
                    System.out.println("Podaj dane użytkownika w osobnych liniach: ");
                    System.out.println(" - imię");
                    String usrName = usrInput.nextLine();
                    System.out.println(" - nazwisko");
                    String usrSurname = usrInput.nextLine();
                    System.out.println(" - mail");
                    String usrMail = usrInput.nextLine();
                    System.out.println(" - status (student, wykładowca, prowadzący)");
                    String usrStatus = usrInput.nextLine();
                    try {
                        participantCategory status = participantCategory.valueOf(usrStatus.toUpperCase());
                        Participant usrParticipant = new Participant(usrName, usrSurname, usrMail, status);
                        addParticipant(usrParticipant);
                    }catch (Exception e){
                        System.out.println("Wpisałeś niepoprawny status uczestnika! (do wyboru: STUDENT,  PROWADZĄCY, WYKŁADOWCA)");
                        System.out.println("Spróbuj ostatni raz");
                        participantCategory status = participantCategory.valueOf(usrStatus.toUpperCase());
                    }
                    break;
                case 2:
                    System.out.println("Podaj imię użytkownika, którego chcesz usunąć ze spotkania: ");
                    String usrRemoveName = usrInput.nextLine();
                    if (searchparticipant(usrRemoveName) == null){
                        System.out.println("Nie ma takiego użytkownika na liście. Nie mogę go usunąć!");
                    }else {
//                      *od środka* z podanego imienia, znajdź uczestnika (trzeba to zmienić na coś wydajniejszego) i usuń go
                        removeParticipant(searchparticipant(usrRemoveName));
                    }
                    break;
                case 3:
                    viewParticipants();
                    break;
                case 4:
                    viewHelp();
                    break;
                case 5:
                    System.out.println("Podaj nazwę dla pliku: ");
                    String path = usrInput.nextLine();
                    saveParticipantListToFile(participantList, path);

                    break;
                case 6:
                    System.out.println("Podaj nazwę pliku zawierajacego listę: ");
                    path = usrInput.nextLine();
                    readParticipantListFromFile(path);
                    break;
                case 9:
                    System.out.println("Adios!");
                    programRunTime = false;
                    break;
            }
        }
    }


    public static void saveParticipantListToFile (ArrayList participantList, String fileName) throws IOException {
//        Jest w tym miejscu, by finally i inne bloki kodu widziały to jaką zmienną globalną w funkcji
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        dla każdego obiektu (nie powinno się tak, ale nie działa inaczej) w liście uczestników, zapisz info uczestnika
        for (Object participant : participantList) {
            String participantInfo = participant.toString();
            writer.write(participantInfo);
        }
        System.out.println("Zapisano listę!");
        writer.close();
    }
    public static void readParticipantListFromFile (String path) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();
        }
    }
    // szukasz osoby(uczestnika), więc przekaż jego imię
    public static Person searchparticipant(String searchedParticipantName){
        //Przeszukaj swoją listę uczestników — dla każdej osoby weź jej imię i porównaj do szukanego imienia
        for (Person participant : participantList) {
            if (participant.getName().equals(searchedParticipantName)){
//                System.out.println("Ten uczestnik już jest dodany do listy!");
                return participant;
            }
        }
        return null;
    }
    public static void addParticipant(Participant participant) {
        participantList.add(participant);
        System.out.println("Dodano uczestnika!");
    }

    public static void removeParticipant(Person participant) {
        participantList.remove(participant);
        System.out.println("Usunięto uczestnika!");
    }

    public static void viewParticipants() {
        System.out.println("Lista uczestników: ");
        System.out.println(participantList);
    }
    public static void viewHelp(){
        System.out.println("1 - dodaj uczestnika");
        System.out.println("2 - usuń uczestnika");
        System.out.println("3 - wyświetl listę uczestników");
        System.out.println("4 - wyświetl pomoc");
        System.out.println("5 - zapisz listę uczestników do pliku");
        System.out.println("6 - wyświetl listę uczestników z pliku");
        System.out.println("9 - wyjdź");
    }
}
