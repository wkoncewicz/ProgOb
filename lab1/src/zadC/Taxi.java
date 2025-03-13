package zadC;
import java.util.Random;

public class Taxi extends Auto {
	private float[] zarobki;
	
	public Taxi() {
        super();
        zarobki = new float[12];
        Random rand = new Random();

        for (int i = 0; i < 12; i++) {
            zarobki[i] = 2000 + rand.nextFloat() * 6000;
        }
    }
	
	public float srZarobki() {
        float suma = 0;
        for (float zarobek : zarobki) {
            suma += zarobek;
        }
        return suma / zarobki.length;
    }
	
	public static void main(String[] args) {
        Taxi taxi = new Taxi();
        System.out.printf("Średni przebieg: %.2f km\n", taxi.srPrzebieg());
        System.out.printf("Średnie zarobki: %.2f zł\n", taxi.srZarobki());
    }
}
