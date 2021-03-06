package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import br.com.dsd.dominio.Gamer;

public interface NavalBattleServer extends Remote {
	
	public Gamer conection(Player player, Gamer g) throws RemoteException;
	public boolean attack(int column, int row) throws RemoteException;
	public Gamer receiveTray(List<Ship> tray, Gamer g) throws RemoteException;
	public void send(Player player, String msg) throws RemoteException;
}
