package Labs.no6.Zadanie3;

class Prostokat extends Figura {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	public String Opis() {
		return "To jest " +getClass().getSimpleName()+ " o wys: " + wys + " i szer: "+szer;
	}
}