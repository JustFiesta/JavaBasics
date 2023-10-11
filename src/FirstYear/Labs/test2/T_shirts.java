package FirstYear.Labs.test2;

public class T_shirts extends Product{
    public T_shirts(String details, int price){
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
