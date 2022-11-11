package br.com.dell.beans;

public class Computador {
	
	private String cor;
	private double peso;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String mostrarAtributos() 
	{   
		return"COR: " + getCor()+ "\nPESO: " + getPeso();
        
	}
}
