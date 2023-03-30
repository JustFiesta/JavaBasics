package Labs.no4.Zadanie3;

public class Main {
                                            //Umożliwienie klonowania cz2
    public static void main(String[] args) throws CloneNotSupportedException{
        Species whiteSheep = new Species("Owca", "Owca biała", "Pospolita owca chowna", 24);
        Species corriedaleSheep = new Species("Owca", "Corriedale", "Owca duża, dobrze owełniona o głębokim tułowiu wspartym na stosunkowo krótkich i szeroko rozstawionych nogach", 24);
        Species dorsetScheep = new Species("Owca", "Dorset Horn", "Owce średnio duże rogate. Owca o dobrze zaznaczonych cechach mięsnych.", 24);

        whiteSheep.SpeciesData();
        corriedaleSheep.SpeciesData();
        dorsetScheep.SpeciesData();

        //Kopiowanie obiektu klasy
        Species copy = (Species) dorsetScheep.clone();
        copy.SpeciesData();
    }
}
