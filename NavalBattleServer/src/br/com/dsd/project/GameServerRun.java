package br.com.dsd.project;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GameServerRun {

	public static void main(String[] args) {
		
		try {
			LocateRegistry.createRegistry(1099);
			NavalBattleServer nb = new NavalBattleImpl();
			Naming.rebind("//localhost/nb", nb);
			System.out.println("Conectado!");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
