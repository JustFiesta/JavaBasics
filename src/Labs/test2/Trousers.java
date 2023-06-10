package Labs.test2;

public class Trousers extends Product{
    public Trousers(String details, int price){
        setDetails(details);
        setPrice(price);
        setAvailable(true);
    }
    @Override
    void Opis() {
        System.out.println("Porządne koszulki waraicie");
        System.out.println("Twoja modyfikacja: "+ getDetails() + '\'' +
                ", cena: " + getPrice() +
                ", dostępność: " + isAvailable());
    }
}
