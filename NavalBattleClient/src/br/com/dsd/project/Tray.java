package br.com.dsd.project;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Tray extends Remote {

	public void generateTray(int opc, int col, int row, int[][] tray) throws RemoteException;
	public void printTray(int col, int row, int[][] tray) throws RemoteException;
}
