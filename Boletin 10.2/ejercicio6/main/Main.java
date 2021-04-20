package main;

import clases.Digital;
import clases.Reloj;

public class Main {

	public static void main(String[] args) {
		Reloj digital = new Digital();
		digital.alarma(25,70);
		digital.alarma(24,00);
		digital.mostrarHora();

	}

}
