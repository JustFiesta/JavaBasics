package Labs.no6.Zadanie3;

class Trojkat extends Figura{
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	public String opis(){
		return "Trojkat o wymairach: "+wys+"  "+podst;
	}

	@Override
	public String Opis() {
		return "To jest " +getClass().getSimpleName()+ " o wys: " + wys + " i podst: "+podst;
	}
}