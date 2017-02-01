package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Player extends Remote {

	public void attack(int column, int row) throws RemoteException;	
	public void positionShips(List<Ship> ships) throws RemoteException;					//Posicionar navios
	public boolean attackEnemy(int column, int row) throws RemoteException;
	public void updatePuntuation() throws RemoteException;
	public void receiveMsg(String msg) throws RemoteException;
	public void setIdPlayer(int id) throws RemoteException;
	public int getIdPlayer() throws RemoteException;
	public void imlementsTray(int opc, int col, int row) throws RemoteException;
}
