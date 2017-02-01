package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class TrayImpl extends UnicastRemoteObject implements Tray {

	/**
	 * 
	 */
	private static final int COLUNM = 10;
	private static final int ROW = 10;
	private static final long serialVersionUID = 1L;
	
	private int column;
	private int row;
	private List<Ship> ships;
	private Player player;
	private int puntuation;

	protected TrayImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generateTray(int opc, int col, int row) throws RemoteException {
		
		int[][] tray = {{0},{0}};
		
		switch (opc) {
		case 1:
			for (int i = 0; i < COLUNM; i++) {
				for (int j = 0; j < ROW; j++) {
					tray[i][j] = 0;				//gera tabuleiro e inicializa com 0
				}
			}
			
			for (int i = 0; i < COLUNM; i++) {
				for (int j = 0; j < ROW; j++) {
					System.out.println("[" + j + "]");
				}
				System.out.println("[" + i + "]");
			}
			break;
			
		case 2:
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					tray[i][j] = 0;
				}
			}
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}



}
