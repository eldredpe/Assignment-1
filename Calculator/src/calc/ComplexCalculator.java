package calc;

public class ComplexCalculator {
	
	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	}
	
	public void multiply(double d) {
		currentNumber = currentNumber*d;
	}
	
	public void divide(double d){
		currentNumber = currentNumber/d;
	}
	
	public void clear() {
		currentNumber = 0;
	}
	
	public void power(double d){
		currentNumber = Math.pow(currentNumber, d);
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	public boolean isEven(){
		if (currentNumber%2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isPrime(){
		boolean prime = true;
		for(double i = 2; i < currentNumber; i++ ){
			if (currentNumber%i == 0){
				prime = false;
			}
		}
		return prime;
	}
	
}
