package com.javaee.ws.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public class User {

	@POST
	@Path("/clock")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public static Clock validarRelogio(Clock clock) {

		String stringHora = "3";
		int hora = Integer.parseInt(stringHora);
		String stringMinuto = "44";
		int minuto = Integer.parseInt(stringMinuto);
		
		clock.setHoras(hora);
		clock.setMinutos(minuto);

		clock.setPonteiroUm(clock.getHoras() * 30);
		clock.setPonteiroDois(clock.getMinutos() * 6);
		
		if (clock.getPonteiroUm() > clock.getPonteiroDois()) {
			clock.setAnguloUm((360 - clock.getPonteiroUm())
					+ clock.getPonteiroDois());
			clock.setAnguloDois(clock.getPonteiroUm() - clock.getPonteiroDois());
		}

		if (clock.getPonteiroUm() < clock.getPonteiroDois()) {
			clock.setAnguloUm(360 - clock.getPonteiroDois()
					+ clock.getPonteiroUm());
			clock.setAnguloDois(clock.getPonteiroDois() - clock.getPonteiroUm());
		}

		if (clock.getAnguloUm() < clock.getAnguloDois()) {
			clock.setAngle(clock.getAnguloUm());
		}

		if (clock.getAnguloDois() < clock.getAnguloUm()) {
			clock.setAngle(clock.getAnguloDois());
		}		

		return clock;
	}	

}
