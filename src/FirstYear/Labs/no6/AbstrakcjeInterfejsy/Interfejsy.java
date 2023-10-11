package FirstYear.Labs.no6.AbstrakcjeInterfejsy;

//Klasa w pełni abstrakcyjna do sztucznego "wielodziedziczenia"
//To szablon. Klasy mogą dziedziczyć po kilka interfejsów a tylko po jednej klasie
public interface Interfejsy {
    double Pole();
    double Obwod();
    public String LABEL = "Moje figury geometryczne";
    default String getFullName(){
        return "Interfejs Figura geometryczna";
    }
}
