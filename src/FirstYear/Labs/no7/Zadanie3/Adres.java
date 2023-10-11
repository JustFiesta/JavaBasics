package FirstYear.Labs.no7.Zadanie3;

public class Adres {
    private String ulica, kodPocztowy, miasto;
    private int nrDomu;
    public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) throws adresException {
        String error = "";
        if (ulica == null) error +="Ulica nie może być null";
        if (kodPocztowy == null) error +=" kod pocztowy nie może być null";
        if (miasto == null) error +=" miasto nie może być null";
        if (nrDomu <= 0) error +=" ulica nie może być null";
        if (!error.equals("")) throw new adresException(error);

        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.nrDomu = nrDomu;
    }
}
