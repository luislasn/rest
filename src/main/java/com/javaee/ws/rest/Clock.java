package com.javaee.ws.rest;

public class Clock {

	private int horas;
	private int minutos;
	private int ponteiroUm;
	private int ponteiroDois;
	private int anguloUm;
	private int anguloDois;	
	private int angle;		

	public Clock(int horas, int minutos, int ponteiroUm, int ponteiroDois,
			int anguloUm, int anguloDois) {
		this.horas = horas;
		this.minutos = minutos;
		this.ponteiroUm = ponteiroUm;
		this.ponteiroDois = ponteiroDois;
		this.anguloUm = anguloUm;
		this.anguloDois = anguloDois;
	}	
	
	public Clock() { }

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
	
	public int getPonteiroUm() {
		return ponteiroUm;
	}
	
	public void setPonteiroUm(int ponteiroUm) {
		this.ponteiroUm = ponteiroUm;
	}
	
	public int getPonteiroDois() {
		return ponteiroDois;
	}
	
	public void setPonteiroDois(int ponteiroDois) {
		this.ponteiroDois = ponteiroDois;
	}
	
	public int getAnguloUm() {
		return anguloUm;
	}
	
	public void setAnguloUm(int anguloUm) {
		this.anguloUm = anguloUm;
	}
	
	public int getAnguloDois() {
		return anguloDois;
	}
	
	public void setAnguloDois(int anguloDois) {
		this.anguloDois = anguloDois;
	}	
	
	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}
	
}
