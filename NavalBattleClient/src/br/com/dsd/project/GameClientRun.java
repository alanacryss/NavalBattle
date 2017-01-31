package br.com.dsd.project;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class GameClientRun {
	
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			NavalBattleServer battleServer = (NavalBattleServer) Naming.lookup("//localhost/nb");
			
			Player player = new PlayerImpl();
			
			String name;
			name = read.nextLine();
			
			((PlayerImpl) player).setName(name);
			
			battleServer.conection(player, name);
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
