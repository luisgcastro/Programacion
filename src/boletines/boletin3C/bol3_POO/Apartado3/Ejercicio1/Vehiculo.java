package boletines.boletin3C.bol3_POO.Apartado3.Ejercicio1;

public class Vehiculo {
	
	private int speed;
	private double regularPrice;
	private String color;
	
	
	public Vehiculo(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	public double getSalePrice() {
		return this.regularPrice;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + "]";
	}


}
