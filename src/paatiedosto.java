import java.util.*;
public class paatiedosto {

	

	public static void main(String[] args) {
		Scanner Reader = new Scanner(System.in);
		int NumberOfPlayers = 0;
		List<String> Players = new ArrayList<String>();
		
		System.out.println("How many players are joining the game?");
		NumberOfPlayers = Reader.nextInt();
		System.out.println("Names of the players that are joining the game please?");
		while(Players.size() <= NumberOfPlayers) {
			//Creating Players array 
			Players.add(Reader.next());
			if(Players.size() == NumberOfPlayers) {
				break;
			}
		} 
		System.out.println(Players);
		
		
		Reader.close();
	}

}
