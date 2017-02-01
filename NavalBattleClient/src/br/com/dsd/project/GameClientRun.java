package br.com.dsd.project;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import br.com.dsd.dominio.Gamer;

public class GameClientRun {
	
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		
		try {
			NavalBattleServer battleServer = (NavalBattleServer) Naming.lookup("//localhost/nb");
			
			Gamer g = new Gamer();
			g.setPlayer(new PlayerImpl());
			
			String name;
			System.out.println("Digite seu nome: ");
			name = read.nextLine();			
			g.setName(name);
									
			int opc, col, row;
			
			battleServer.conection(g.getPlayer(), g);
			//((PlayerImpl) player).imlementsTray(opc, col, row);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
