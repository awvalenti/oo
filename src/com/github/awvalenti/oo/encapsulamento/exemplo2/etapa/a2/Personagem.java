package com.github.awvalenti.oo.encapsulamento.exemplo2.etapa.a2;

public class Personagem {

	private int contagemDeCaquis = 0;
	private boolean invencivel = false;
	private int pontosDeVida = 10;

	public int getContagemDeCaquis() {
		return contagemDeCaquis;
	}

	public void setContagemDeCaquis(int contagemDeCaquis) {
		this.contagemDeCaquis = contagemDeCaquis;
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

}
