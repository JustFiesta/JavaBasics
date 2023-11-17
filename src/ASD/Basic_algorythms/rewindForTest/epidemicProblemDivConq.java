package src.ASD.Basic_algorythms.rewindForTest;

public class epidemicProblemDivConq {
    static int overallPeople = 10000;
    static int sickPeople = 10;
    static int healthyPeople = overallPeople - sickPeople;
    static int daysPassed = 1;
    public static void main(String[] args) {
        epidemic(sickPeople);
    }
    public static int epidemic(int sickPeople){
        if (healthyPeople <= 0) {
            System.out.println("Dzień: " + daysPassed + " | Pandemia wygasła. Nie ma już zdrowych osób");
            return 0;
        }else {
            System.out.println("Dzień: " + daysPassed + " | Chorzy: " + sickPeople + " | Zdrowi: " + healthyPeople);

            daysPassed++;
            sickPeople += sickPeople * 2;
            healthyPeople = overallPeople - sickPeople;

            return epidemic(sickPeople);
        }
    }
}
