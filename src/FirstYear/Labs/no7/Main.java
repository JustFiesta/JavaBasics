package FirstYear.Labs.no7;

public class Main {

    public static void main(String[] args) {
//        po rzuceniu wyjątku można go obsługiwać: try catch finally
        try{
            int wynik  =5/0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException =>" + e.getMessage());
        }
        //Zawsze się wykonuje
        finally {
            System.out.println("Działam zawsze");
        }
    }
    public static int getNumber(int hour){
        if (hour < 0)
            //Rzucenie nowego wyjątku
            throw new IllegalArgumentException("Podana godzina nie może być ujemna");
        return hour*60*60;
    }
}
