package Labs.no6.Zadanie4;

public interface Speakable {
    public static int QUIET = 0;
    public static final int LOUD = 1;

    default String getVoice(){
        return getVoice(LOUD); //domyślna wartość -> loud
    }
    String getVoice(int voice);
}
