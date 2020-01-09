import java.util.*;

import com.sun.media.jfxmedia.events.PlayerEvent;

public class paatiedosto {

	public static void main(String[] args) {

		List<Player> players = new ArrayList<Player>();
		
		players.add(new Player("Peter", 10));
		players.add(new Player("Pierre", 120));
		players.add(new Player("George", 110));
		players.add(new Player("John", 1255));
	
		Collections.sort(players, Player.PlayerScoreComparator);
		
		System.out.println(Player.toString(players));
		players.add(new Player("josu", 1235));

		System.out.println("list with added persons\n");
		Collections.sort(players, Player.PlayerScoreComparator);
		System.out.println(Player.toString(players));
	}

}