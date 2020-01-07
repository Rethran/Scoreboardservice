import java.util.*;
public class paatiedosto {

	
	
	 
	public static void main(String[] args) {
	
		List<Player> players = new ArrayList<Player>();
		
		Player myplayer =  new Player("santeri", 100);
		Player kiti =  new Player("cindy", 2);
		Player cindy =  new Player("ti", 300);
		Player noora =  new Player("noora", 150);
		
		players.add(noora);
		players.add(myplayer);
		players.add(kiti);
		players.add(cindy);
		Collections.sort(players,Player.PlayerScoreComparator);
		
		int i=0;
	 for(Player temp: players) {
		 
		 System.out.println("Player"+ ++i + " : " + temp.getName()+"Score: "+ temp.getScore());
		
	 }
	}
}
