package org.lessons.java.christmas.comparator;

import java.util.Random;

public class Regalo implements Comparable<Regalo>{
	private String nome;
	private float prezzo;
	
	public Regalo(String nome) {
		super();
		Random r = new Random();
		this.nome = nome;
		this.prezzo = r.nextFloat()*50+10;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public String toString() {
		return nome + " " +  prezzo;
	}

	@Override
	public int compareTo(Regalo o) {
		return Float.compare(this.prezzo, o.prezzo);
	}
}
