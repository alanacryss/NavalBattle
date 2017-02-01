package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

import br.com.dsd.dominio.Gamer;

public class NavalBattleImpl extends UnicastRemoteObject implements NavalBattleServer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Hashtable<Integer, Gamer> players = new Hashtable<Integer, Gamer>();
	private List<String> logs =  new ArrayList<>();
	
	private Random r = new Random();
	
	protected NavalBattleImpl() throws RemoteException {
		super();
	}
	
	private void onLogs(String msg){
		logs.add(msg);
		System.out.println(msg);
	}
	
	@Override
	public boolean conection(Player player, Gamer g) throws RemoteException {

		g.setId(r.nextInt(100));
		
		if (players.size() < 1) {
			players.put(g.getId(), g);
			send(player, "Aguardando oponente...");
			onLogs(g.getName() + "se conectou");
			return true;
		}
		
		Enumeration<Gamer> e = players.elements();
		List<Gamer> gma = new ArrayList<Gamer>();
		while(e.hasMoreElements()){
			gma.add(e.nextElement());
		}
		
		send(player, "O seu oponente é: " + gma.get(0).getName());
		send(gma.get(0).getPlayer(), "Oponente conectado com o nome: " + gma.get(gma.size() - 1).getName());
		
		onLogs(g.getName() + "se conectou");
		return true;
	}

	@Override
	public boolean attack(int column, int row) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void receiveTray(Tray tray) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(Player player, String msg) throws RemoteException {

		player.receiveMsg(msg);
	}
	
	

}
