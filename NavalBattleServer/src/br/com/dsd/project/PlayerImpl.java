package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import br.com.dsd.dominio.Gamer;

public class PlayerImpl extends UnicastRemoteObject implements Player {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	
	
	
	protected PlayerImpl() throws RemoteException {
		super();
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
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void implementsTray(int opc, int col, int row, int[][] tray) throws RemoteException {
		
	}
	
	@Override
	public void showTray(Gamer g) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
