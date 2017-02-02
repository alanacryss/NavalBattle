package br.com.dsd.dominio;

import java.io.Serializable;
import java.util.List;

import br.com.dsd.project.Ship;

public class Tabuleiro implements Serializable{

	private static final int COLUNM = 10;
	private static final int ROW = 10;
	
	private int[][] tab;
	private List<Ship> ships;


	public void onShips(){
		if(ships != null){
			for(Ship s : ships){
				for(int i = 0; i < s.getDimension().length; i+=2){
					tab[s.getDimension()[i]][s.getDimension()[i+1]] = 1;
				}
			}
		}
	}
	
	public void iniciarTabuleiro(){
		tab = new int[COLUNM][ROW];
		for (int i = 0; i < COLUNM; i++) {
			for (int j = 0; j < ROW; j++)
				tab[i][j] = 0;				
		}
	}
	
	public void mostrarTabuleiro(){
		System.out.println("Y");
		for (int i = COLUNM - 1; i >= 0; i--) {
			System.out.print(i);
			for (int j = 0; j < ROW; j++) {
				if(tab[i][j] != 0)
					System.out.print(" ø ");
				else
					System.out.print("»» ");
			}
			System.out.println();
		}
	}
	
	public int[][] getTab() {
		return tab;
	}

	public void setTab(int[][] tab) {
		this.tab = tab;
	}

	public List<Ship> getShips() {
		return ships;
	}

	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}
	
	
}
