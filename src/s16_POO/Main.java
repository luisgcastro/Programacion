package s16_POO;
import java.math.*;

import java.util.Scanner;

import org.joda.time.DateTime;

public class Main {

	public static void main(String[] args) {
		Math.abs(22);
		
		Scanner entradaEscaner = new Scanner (System.in);
		
		DateTime dt = new DateTime();
		int month = dt.getMonthOfYear();
		int year = dt.getYear();
		
		System.out.println(month);
		System.out.println(year);
		
		System.out.println(dt.getDayOfMonth());
		
		

	}

}
