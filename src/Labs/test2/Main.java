package Labs.test2;

import java.util.Scanner;

import static Labs.test2.Checkout.viewBasket;

public class Main {
    public static void main(String[] args) {

        boolean programRunTime = true;
        while (programRunTime){
            Checkout userBasket = new Checkout();
            OrderStatus status = OrderStatus.NEW;

            Scanner input = new Scanner(System.in);

            System.out.println("Jaki produkt cię interesuje?");
            System.out.println("1 - koszulki");
            System.out.println("2 - spodnie");
            System.out.println("3 - bluzy z kapturem");
            System.out.println("4 - wyświetl koszyk");
            System.out.println("5 - wyjdź ze sklepu");

            try {
                int userChoice = input.nextInt();
                if (userChoice > 4) throw new Exception();
                input.nextLine();

                switch (userChoice){
                    case 1:
                        System.out.println("Jaki chcesz napis na koszulce?");
                        String userInscription = input.next();
                        input.nextLine();

                        T_shirts userShirt = new T_shirts(userInscription, 30);
                        userBasket.addProduct(userShirt);

                        status = OrderStatus.IN_PROGRESS;
                        break;
                    case 2:
                        System.out.println("Z jakiego materiału chcesz spodnie?");
                        String fabric = input.next();
                        input.nextLine();

                        Trousers userTrouser = new Trousers(fabric, 100);
                        userBasket.addProduct(userTrouser);

                        status = OrderStatus.IN_PROGRESS;
                        break;
                    case 3:
                        System.out.println("Jaka bluza wariacie?");
                        String hoodieDetails = input.next();
                        input.nextLine();

                        Hoodies userHoodie = new Hoodies(hoodieDetails, 150);
                        userBasket.addProduct(userHoodie);

                        status = OrderStatus.IN_PROGRESS;
                        break;
                    case 4:
                        viewBasket(); // do poprawy
                        break;
                    case 5:
                        System.out.println("Adios!");
                        sendOrder(status);
                        programRunTime = false;
                        break;
                }
            }catch (Exception e){
                System.out.println("Podaj prawodiłową liczbę!");
            }
        }
    }
    public static void sendOrder(OrderStatus status){
        status = OrderStatus.SENT;
        System.out.println("Zamówienie wysłane!");
    }
}
