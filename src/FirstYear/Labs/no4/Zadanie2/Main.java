package FirstYear.Labs.no4.Zadanie2;

public class Main {
    public static void main(String[] args) {
        Building flat = new Building("Blok mieszkalny", 1970, 10);
        Building school = new Building("Szkoła", 1870, 2);
        Building building2 = new Building("Kamienica", 1920, 4);

        System.out.print("Dane budynku "+flat.getName()+flat);
        System.out.println(" Wiek budynku: "+flat.Age(flat.year));
        System.out.print("Dane budynku "+school.getName()+school);
        System.out.println(" Wiek budynku: "+school.Age(school.year));
        System.out.print("Dane budynku "+building2.getName()+building2);
        System.out.println(" Wiek budynku: "+building2.Age(building2.year));
    }
}
