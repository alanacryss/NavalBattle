package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Tray extends Remote {

	public void generateTray(int opc, int col, int row, int[][] tray) throws RemoteException;
	public void printTray(int col, int row, int[][] tray) throws RemoteException;
//	public void attack(int column, int row) throws RemoteException;	
//	public void positionShips(List<Ship> ships) throws RemoteException;					//Posicionar navios
//	public boolean attackEnemy(int column, int row) throws RemoteException;
//	public void updatePuntuation() throws RemoteException;
//	public void receiveMsg(String msg) throws RemoteException;
}
