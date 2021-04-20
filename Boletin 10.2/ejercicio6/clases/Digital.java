package clases;

import java.time.LocalDateTime;

public class Digital extends Reloj {

	@Override
	public void mostrarHora() {
		LocalDateTime locaDate = LocalDateTime.now();
		int horas  = locaDate.getHour();
		int minutos = locaDate.getMinute();
		int segundos = locaDate.getSecond();
		System.out.println("Hora actual : " + horas  + ":"+ minutos +":"+segundos); 
		
	}
}
