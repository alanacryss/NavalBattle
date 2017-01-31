package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Tray extends Remote {

	public void attack(int column, int row) throws RemoteException;	
	public void positionShips(List<Ship> ships) throws RemoteException;					//Posicionar navios
	public boolean attackEnemy(int column, int row) throws RemoteException;
	public void updatePuntuation() throws RemoteException;
}