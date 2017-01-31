package br.com.dsd.project;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

public class NavalBattleImpl extends UnicastRemoteObject implements NavalBattleServer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Hashtable<Integer, Player> players = new Hashtable<>();
	
	private Random r = new Random();
	
	protected NavalBattleImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean conection(Player player, String name) throws RemoteException {

		player.setIdPlayer(r.nextInt(100) + name);
		
		if (players.size() % 2 == 0) {
			players.put(((PlayerImpl) player).getId(), player);
			send(player, "Aguardando oponente...");
			
			return true;
		}
		
		List<Player> e = (List<Player>) players.values();
		
		send(player, "Oponente: " + ((PlayerImpl) e.get(e.size())).getName());
		players.put(((PlayerImpl) player).getId(), player);
		
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
