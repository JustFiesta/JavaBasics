package FirstYear.Labs.no5.Zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float liczba = Inputfloat();
        PersonalCar fiat = new PersonalCar(4,1.8F,1.2F,"Fiat","Coupe", "coupe", "czerwony", 1998,273000);
        fiat.CheckDisplacement(); fiat.CheckWeight(); fiat.CheckMileage();
        System.out.println(fiat.toString());

        Car uno = new Car("Fiat", "Uno", "hatchback", "srebrny", 2000,42000);
        uno.CheckMileage();
        System.out.println(uno.toString());

        Car panda = new Car("Fiat", "Panda", "hatchback", "niebieski", 2005,147000);
        panda.CheckMileage();
        System.out.println(panda.toString());
    }
    public static float Inputfloat(){
        Scanner UserInput = new Scanner(System.in);
        float input = UserInput.nextFloat();
        return input;
    }
    public static String InputString(){
        Scanner UserText = new Scanner(System.in);
        return UserText.next();
    }
}
