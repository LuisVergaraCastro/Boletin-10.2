package clases;

public abstract class Reloj {

	private int  horas ;
	private int minutos ;
	private int segundos ;
	
	
	
	public Reloj(int horas, int minutos, int segundos) {
		
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public Reloj() {
		
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	abstract public void mostrarHora();
	
	public void alarma (int horas, int minutos) {
		if (horas > 24 || horas < 0) {
			System.out.println("La hora introducida no es correcta");
		} else setHoras(horas);
		
		if (minutos > 60 || minutos < 0) {
			System.out.println("Los minutos introducidos no son correctos");
		} else setMinutos(minutos);
	}
}
