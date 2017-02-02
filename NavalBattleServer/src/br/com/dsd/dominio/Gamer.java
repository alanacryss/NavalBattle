package br.com.dsd.dominio;

import java.io.Serializable;

import br.com.dsd.project.Player;

public class Gamer implements Serializable {

	private String name;
	private int id;
	private Player player;
	private Tabuleiro tab;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Tabuleiro getTab() {
		return tab;
	}
	public void setTab(Tabuleiro tab) {
		this.tab = tab;
	}
}
