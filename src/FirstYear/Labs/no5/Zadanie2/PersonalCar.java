package FirstYear.Labs.no5.Zadanie2;

import static FirstYear.Labs.no5.Zadanie2.Main.Inputfloat;

public class PersonalCar extends Car{
    int peopleCapacity;
    float displacement, weight;

    public PersonalCar(int peopleCapacity, float displacement, float weight, String make, String model, String chasis, String color, int productionYear, double mileage) {
        super(make, model, chasis, color, productionYear, mileage);
        this.peopleCapacity = peopleCapacity;
        this.displacement = displacement;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Dane twojego pojazdu osobowego: " +
                "maksymalna ilość osób=" + this.peopleCapacity +
                ", pojemność silnika=" + this.displacement +
                ", waga=" + this.weight + "t"+
                ", marka='" + this.make + '\'' +
                ", model='" + this.model + '\'' +
                ", nadwozie='" + this.chasis + '\'' +
                ", kolor='" + this.color + '\'' +
                ", rok produkcji=" + this.productionYear +
                ", przebieg=" + this.mileage;
    }

    public void CheckWeight(){
        if(this.weight > 4.5 || this.weight < 2){
            System.out.println("Niepoprawna waga auta! Proszę sprawdzić i wprowadzić poprawne dane (przedział 2t do 4.5t)");
            this.weight = Inputfloat();
        }
    }
    public void CheckDisplacement(){
        if(this.displacement > 3.0 || this.displacement < 0.8){
            System.out.println("Niepoprawna pojemność silnika! Proszę sprawdzić i wprowadzić poprawne dane (przedział 0.8l do 3.0l)");
            this.weight = Inputfloat();
        }
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public float getDisplacement() {
        return displacement;
    }

    public float getWeight() {
        return weight;
    }
}
