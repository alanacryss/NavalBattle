package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;


public class PlayerImpl extends UnicastRemoteObject implements Player {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	protected PlayerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void attack(int column, int row) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void positionShips(List<Ship> ships) throws RemoteException {
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
	@Override
	public void receiveMsg(String msg) throws RemoteException {
		
		System.out.println("::" + msg);		
	}
	
	@Override
	public void implementsTray(int opc, int col, int row) throws RemoteException {
		Tray tray = new TrayImpl();
		tray.generateTray(opc, col, row);
	}
}
