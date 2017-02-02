package br.com.dsd.project;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
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
			
			battleServer.conection(g.getPlayer(), g);
			
			List<Ship> s = new ArrayList<>();
			int sh = 0;
			for(int i = 0; i < 5; i++){
				System.out.println("Posicione os navios: \n"
						+ "1 Porta-aviões → OOOOO \n"
						+ "2 Submarino → O\n"
						+ "3 HridroAviões → OoO\n"
						+ "4 Destroyers → OOOO\n"
						+ "5 Cruzadores → OOO\n");
				sh = read.nextInt();
				w(sh, s);				
			}
			
			g.getPlayer().showTray(g);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void w(int s, List<Ship> ships){
		switch (s) {
		case 1:
			Ship ship = new Ship();
			ship.setName("Porta-aviões");
			System.out.println("Informe as dimensões");
			int [] d = new int[10];
			
			for(int i = 0; i < 10; i++){
				if(i % 2 == 0){
					System.out.println("X: ");
					d[i] = read.nextInt();
				}else{
					System.out.println("Y: ");
					d[i] = read.nextInt();
				}
			}
			ship.setDimension(d);
			break;

		default:
			break;
		}
	}
}
