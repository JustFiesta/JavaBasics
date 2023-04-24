package Labs.no6.Zadanie3;
//deklaracja klasy abstrakcyjnej

public abstract class Figura{

	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";

	public abstract String Opis();

	Figura(){
		punkt = new Punkt(0,0);
	}

	Figura(String kolor){
		this.kolor=kolor;
	}

	Figura(Punkt punkt){
		this.punkt=punkt;
	}

	String getKolor(){
		return kolor;
	}
	//metody abstrakcyjne


}
