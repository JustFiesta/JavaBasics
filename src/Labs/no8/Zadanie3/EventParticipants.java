package Labs.no8.Zadanie3;

import java.util.LinkedList;
import java.util.Scanner;

//Klasa przechowująca listę uczestników
public class EventParticipants {
    //lista obiektów klasy Participants
    private LinkedList<Participants> participants;

    //Konstruktor klasy EventParticipants - tworzy nową listę praticipants
    public EventParticipants(){
        participants = new LinkedList<>();
    }

    //metoda do dodawania uczestników
    public void addParticipant(Participants participant){
        participants.add(participant);
    }
    //metoda do dodawania usuwania
    public void removeParticipant(Participants participant){
        participants.remove(participant);
    }
    //getter dla całej listy
    public LinkedList<Participants> getParticipants() {
        return participants;
    }
    public void filterMinors(){
        System.out.println("Filtruję uczestników poniżej 18 r. ż.");
        LinkedList<Participants> filteredList = new LinkedList<>();
        //Przechodzi przez obiekt participants \/
        for (Participants participant : participants) {
            if (participant.getAge() >= 18){
                filteredList.add(participant);
            }
        }
        System.out.println("Zaaktualizować listę na osoby TYLKO pełnoletnie? (T/N)");
        Scanner input = new Scanner(System.in);
        if (input.next().equals("T")){
            participants = filteredList;
        }
    }

    //lekkie dymy - co tu sie dzieje
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //pojedyńczy uczestnik \/ z obiektu Participants \/
        for (Participants participant : participants) {
                // tutaj toString odwołuje się do klasy Participants
            sb.append(participant.toString()).append("\n");
        }
        return sb.toString();
    }
}
