package zadC;
import java.util.Random;

public class Auto {
	protected float[] przebieg;
	
	public Auto(){
		przebieg = new float[12];
		Random rand = new Random();
		for (int i = 0; i < 12; i++) {
	        przebieg[i] = 500 + rand.nextFloat() * 2500;
	    }
	}
	
	 public float srPrzebieg() {
	        float suma = 0;
	        for (float km : przebieg) {
	            suma += km;
	        }
	        return suma / przebieg.length;
	    }
}
