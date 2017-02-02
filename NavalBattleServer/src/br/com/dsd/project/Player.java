package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.dsd.dominio.Gamer;
import br.com.dsd.dominio.Tabuleiro;

public interface Player extends Remote {

	public void attack(int column, int row) throws RemoteException;	
	public void positionShips(List<Ship> ships) throws RemoteException;					//Posicionar navios
	public boolean attackEnemy(int column, int row) throws RemoteException;
	public void updatePuntuation() throws RemoteException;
	public void receiveMsg(String msg) throws RemoteException;
	public void implementsTray(int opc, int col, int row, int[][] tray) throws RemoteException;
	public void showTray(Gamer g) throws RemoteException;
	public void onGetTab(Gamer g) throws RemoteException;
}
