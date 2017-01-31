package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class TrayImpl extends UnicastRemoteObject implements Tray {

	/**
	 * 
	 */
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
	public void positionShips(List<Ship> ships) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void attack(int column, int row) throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean attackEnemy(int column, int row) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void updatePuntuation() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
