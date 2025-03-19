package kalkulator;

public class Calculator {
	private double state = 0;
	private double memory = 0;

	public double getState() {
		return state;
	}
	
	public double getMemory() {
		return memory;
	}

	public void setState(double state) {
		this.state = state;
	}

	public void add(double value){
		state += value;
	}

	public void mult(double value){
		state *= value;
	}
	
	public void sub(double value) {
		state -= value;
	}
	
	public void div(double value) {
		if (value == 0) {
			System.out.println("Nie dziel przez 0!!!!!");
			state = Double.NaN;
		}
		state /= value;
	}
	
	public void saveToMemory() {
        memory = state;
    }
	
	public double recallMemory() {
        return memory;
    }
	
	public void addMemory() {
        state += memory;
    }
	
	public void subMemory() {
        state -= memory;
    }
	
	public void multMemory() {
        state *= memory;
    }
	
	public void divMemory() {
        if (memory == 0) {
            System.out.println("Nie dziel przez 0!!!!!");
            state = Double.NaN;
        }
        state /= memory;
    }
}