package basicact1;

import java.util.Scanner;

public class BasicAct1 {

	public static void main(String[] args) {
		System.out.print("Introduzca un número al azar: ");
			Scanner read =new Scanner (System.in);
			int num;
			num = read.nextInt();
		System.out.print("El número introducido es " + num);
	}

}
