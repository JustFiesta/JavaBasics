package FirstYear.Labs.no7.Zadanie2;

public class Main {
    public static void main(String[] args) {

        //gdy jest try, musi byc catch
        try{
            System.out.println("5! = " + silnia(5));
            System.out.println("2! = " + silnia(2));
            System.out.println("30! = " + silnia(30));
            System.out.println("-21! = " + silnia(-21));
        }
        catch (silniaException e){
            System.out.println("error " + e.getMessage());
        }
    }

    //metoda musi być rzucona na silniaException tak żeby się dostać do jej metody błędu
    public static int silnia (int n) throws silniaException{
        if (n < 0) throw new silniaException("silnie liczymy z wartości > 0 ");
        int wynik = 1;
        for (int i = 2; i <= n; i++){
            wynik *=i;
        }
        return wynik;
    }
}
class silniaException extends Exception{
    public silniaException(String message){
        super(message);
    }
}
