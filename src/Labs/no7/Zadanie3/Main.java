package Labs.no7.Zadanie3;

public class Main {
    public static void main(String[] args) {
        try{
            Adres rejtana = new Adres("Rejtana", "35-002", "Rzeszów", 122);
        }
        catch (adresException e){
            System.out.println("Błąd wpisanego adresu. "+e.getMessage());
        }
        try{
            Adres dabrowskiego = new Adres("dabrowskiego", "35-002", "Rzeszów", 123);
        }
        catch (adresException e){
            System.out.println("Błąd wpisanego adresu. "+e.getMessage());
        }
        try{
            Adres lisaKuli = new Adres("Lisa-Kuli", "35-002", "Rzeszów", 124);
        }
        catch (adresException e){
            System.out.println("Błąd wpisanego adresu. "+e.getMessage());
        }
        try{
            Adres zaleska = new Adres("Załęska", "35-002", "Rzeszów", 76);
        }
        catch (adresException e){
            System.out.println("Błąd wpisanego adresu. "+e.getMessage());
        }
    }
}
class adresException extends Exception{
    public adresException(String message){
        super(message);
    }
}
