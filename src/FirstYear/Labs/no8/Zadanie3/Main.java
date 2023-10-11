package FirstYear.Labs.no8.Zadanie3;

public class Main {
    public static void main(String[] args) {
        //Tworzy event do którego można dodawać uczestników
        EventParticipants melanż = new EventParticipants();

        //Dodanie uczestników
        Participants fifonz = new Participants(1, "Fifonż", 20);
        Participants alfons = new Participants(2, "Alfons", 21);
        Participants grzegorz = new Participants(3, "Grzegorz", 22);

        melanż.addParticipant(fifonz);
        melanż.addParticipant(alfons);
        melanż.addParticipant(grzegorz);

        //Drugi sposób
        melanż.addParticipant(new Participants(4, "Gerwazy", 23));
        melanż.addParticipant(new Participants(5, "Żaneta", 17));
        melanż.addParticipant(new Participants(6, "Stanisław", 16));

        // Wyświetlenie informacji o uczestnikach
        System.out.println("Lista uczestników:");
        System.out.println(melanż.toString());

        melanż.filterMinors();

    }
}
