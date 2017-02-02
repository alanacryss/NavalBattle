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
			
			g = battleServer.conection(g.getPlayer(), g);
			
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
			
			g = battleServer.receiveTray(s, g);
			g.getTab().mostrarTabuleiro();
			
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
			ships.add(ship);
			break;
		case 2:
			Ship ship1 = new Ship();
			ship1.setName("Submarino");
			System.out.println("Informe as dimensões");
			int [] d1 = new int[2];
			
			for(int i = 0; i < 2; i++){
				if(i % 2 == 0){
					System.out.println("X: ");
					d1[i] = read.nextInt();
				}else{
					System.out.println("Y: ");
					d1[i] = read.nextInt();
				}
			}
			ship1.setDimension(d1);
			ships.add(ship1);
			break;
		case 3:
			Ship ship2 = new Ship();
			ship2.setName("HridroAviões");
			System.out.println("Informe as dimensões");
			int [] d2 = new int[6];
			
			for(int i = 0; i < 6; i++){
				if(i % 2 == 0){
					System.out.println("X: ");
					d2[i] = read.nextInt();
				}else{
					System.out.println("Y: ");
					d2[i] = read.nextInt();
				}
			}
			ship2.setDimension(d2);
			ships.add(ship2);
			break;
		case 4:
			Ship ship3 = new Ship();
			ship3.setName("HridroAviões");
			System.out.println("Informe as dimensões");
			int [] d3 = new int[8];
			
			for(int i = 0; i < 8; i++){
				if(i % 2 == 0){
					System.out.println("X: ");
					d3[i] = read.nextInt();
				}else{
					System.out.println("Y: ");
					d3[i] = read.nextInt();
				}
			}
			ship3.setDimension(d3);
			ships.add(ship3);
			break;
		case 5:
			Ship ship4 = new Ship();
			ship4.setName("HridroAviões");
			System.out.println("Informe as dimensões");
			int [] d4 = new int[8];
			
			for(int i = 0; i < 6; i++){
				if(i % 2 == 0){
					System.out.println("X: ");
					d4[i] = read.nextInt();
				}else{
					System.out.println("Y: ");
					d4[i] = read.nextInt();
				}
			}
			ship4.setDimension(d4);
			ships.add(ship4);
			break;

		default:
			break;
		}
	}
}
