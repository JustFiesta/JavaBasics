package FirstYear.Labs.no5.Zadanie2;

import static FirstYear.Labs.no5.Zadanie2.Main.Inputfloat;

public class Car{
    String make, model, chasis, color;
    double mileage;
    int productionYear;

    public Car(String make, String model, String chasis, String color, int productionYear, double mileage) {
        setMake(make);
        setModel(model);
        setChasis(chasis);
        setColor(color);
        setProductionYear(productionYear);
        setMileage(mileage);
    }
    @Override
    public String toString() {
        return "Informacje o samochodzie: " +
                "marka='" + make + '\'' +
                ", model='" + model + '\'' +
                ", nadwozie='" + chasis + '\'' +
                ", kolor='" + color + '\'' +
                ", rok produkcji=" + productionYear +
                ", przebieg=" + mileage;
    }

    public void CheckMileage(){
        if(this.mileage < 0) {
            System.out.println("Ujemny przebieg! Proszę wprowadzić go ponownie");
            this.mileage = (int) Inputfloat();
        }else{}
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public double getProductionYear() {
        return productionYear;
    }

    public double getMileage() {
        return mileage;
    }
}
