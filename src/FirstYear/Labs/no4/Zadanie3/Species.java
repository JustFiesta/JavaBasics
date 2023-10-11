package FirstYear.Labs.no4.Zadanie3;
                                //Umożliwienie klonowania cz1
public class Species implements Cloneable{
    public String scpeciesType, speciesName, description;
    int chromosomes2N;
    //Konstruktor Klasy


    public Species(String scpeciesType, String speciesName, String description, int chromosomes2N) {
        this.scpeciesType = scpeciesType;
        this.speciesName = speciesName;
        this.description = description;
        this.chromosomes2N = chromosomes2N;
    }

    public static String FullName(String scpeciesType, String speciesName){
//        System.out.println("Pełna nazwa zwierzęcia: "+scpeciesType+" "+speciesName);
        return "Nazwa zwierzęcia: "+scpeciesType+" "+speciesName;
    }
    public static int HapioidalChromosomes(int chromosomes2N){
        int chromosomesN = chromosomes2N / 2;
//        System.out.println("Liczba chromosomów hapioidalnych: "+ chromosomesN);
        return chromosomesN;
    }
    public void SpeciesData(){
        System.out.println("Dane gatunku: \n"+"Pełna nazwa: "+FullName(this.scpeciesType, this.speciesName)+"\nOpis gatunku: "+this.description+"\nLiczba chromosomów: "+this.chromosomes2N+"\nLiczba hapioidalnych chromosomów: "+HapioidalChromosomes(this.chromosomes2N)+"\n\n");
    }

    //metoda do kopiowania (+ implements w klasie)
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
