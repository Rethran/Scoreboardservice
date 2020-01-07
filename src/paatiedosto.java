import java.util.*;
public class paatiedosto {

	
	
	 
	public static void main(String[] args) {
		
		List<Player> players = new ArrayList<Player>();
		
		Player myplayer =  new Player("Santeri", 100);
		Player kiti =  new Player("Cindy", 2);
		Player cindy =  new Player("Kiti", 300);
		Player noora =  new Player("noora", 150);
		
		players.add(noora);
		players.add(myplayer);
		players.add(kiti);
		players.add(cindy);
		
	 Collections.sort(players);
	 for(int i = 0; i < players.size(); i++) {
		
		System.out.println(players.get(i).getScore());
		
	 }
	 
	
		
	
		
		
		
			
		
		
		
		
		
		
	}


}
