package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class PlayerImpl extends UnicastRemoteObject implements Player {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	
	protected PlayerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setIdPlayer(String id) throws RemoteException {
		
		setId(id);
		
	}
	
	public String getIdPlayer() {
		
		return id;
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
