package oo.encapsulamento.exemplo2.etapa2.incorreto;

public class Personagem {

	private int pontosDeVida = 10;
	private int contagemDeCaquis = 0;
	private boolean invencivel = false;

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

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

}
