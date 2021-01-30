

import java.text.NumberFormat;
import java.util.Locale;

public class CarLot {
	
	public CarLot() {}
	
	public void play() {
		Vehicle sedan = new Sedan();
		sedan = new Paint(sedan);
		sedan = new Rims(sedan);
		
		Vehicle sportsCar = new SportsCar();
		sportsCar = new SoundSystem(sportsCar);
		sportsCar = new Paint(sportsCar);
		
		Vehicle compact = new Compact();
		compact = new Rims(compact);
		
		System.out.println("***** Cars ******");
		System.out.println(sedan.getDescription() + " costs " + getCurrency(sedan.getCost()));
		System.out.println(sportsCar.getDescription() + " costs " + getCurrency(sportsCar.getCost()));
		System.out.println(compact.getDescription() + " costs " + getCurrency(compact.getCost()));
	}
	
	public String getCurrency(double amount) {
		return NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(amount);
	}

	public static void main(String[] args) {
		CarLot carLot = new CarLot();
		carLot.play();
	}
}