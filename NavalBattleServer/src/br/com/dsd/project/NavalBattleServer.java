package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface NavalBattleServer extends Remote {
	
	public boolean conection(Player player, String name) throws RemoteException;
	public boolean attack(int column, int row) throws RemoteException;
	public void receiveTray(Tray tray) throws RemoteException;
	public void send(Player player, String msg) throws RemoteException;
}
