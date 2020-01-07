import java.util.*;


public class Player implements Comparable<Player>{
		private Integer _playerScore;
		private String _name;
		private Object getScore;
//		private List<Player> players = new ArrayList<Player>();
		
		public Player(String name, int score) {
			super();
			this._name = name;
			this._playerScore = score;
			
		}
		public Player (String name, Integer score) {
			
			System.out.println("Player: " + name + " score: " + score);
		}
		public void addPlayer() {
			
		}
		public void setScore( String name, int score){
			_playerScore = score;
			System.out.println("Player: " + name + " score: " + score);
		}
		public Integer getScore() {
			return _playerScore;
		}
		void changescore(int score) {
		   System.out.println("passed score is: " + score);
		}
		public String getName() {
			return _name;
		}
			
		@Override
		public int compareTo(Player compareScore) {
			int compareGetScore = ((Player) compareScore).getScore();
		
			if(getScore == null) {
				return 0;
			}
			return this._playerScore - compareGetScore;
			
			
		}
		public static Comparator<Player> PlayerScoreComparator
										= new Comparator<Player>() {
			public int  compare (Player player1, Player player2) {
				 Integer playerScore1 = player1.getScore();
				 Integer playerScore2 = player2.getScore();
				 return playerScore1.compareTo(playerScore2);
			}
			
		};
	}
