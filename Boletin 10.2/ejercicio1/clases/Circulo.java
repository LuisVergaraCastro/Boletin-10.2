package clases;

import interfaces.InterfaceFigura;

public class Circulo implements InterfaceFigura {

	//Atributos
	private double radio;
	
	//Constructor
	public Circulo(double radio) {
		super();
		this.setRadio(radio);
	}

	@Override
	public double getArea() {
		
		return radio * radio * PI;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
