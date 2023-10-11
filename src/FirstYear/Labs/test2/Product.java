package FirstYear.Labs.test2;

//klasa abstrakcyjna dla produktów
public abstract class Product {
    private String details;
    private Colors color;
    private int price;
    private boolean available;

    //metoda abstrakcyjna
    abstract void Opis();

    public String getDetails() {
        return details;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
