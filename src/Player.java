import java.util.*;


public class Player implements Comparable<Player>{
		private Integer _playerScore;
		private String _name;
		private Object getScore;
//		private List<Player> players = new ArrayList<Player>();
		
		public Player() {
			
		}
		
		public Player (String name, int score) {
			this._name = name;
			this._playerScore = score;
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
		
		
		@Override
		public int compareTo(Player compareScore) {
			int compareGetScore = ((Player) compareScore).getScore();
			// TODO Auto-generated method stub
			if(getScore == null) {
				return 0;
			}
			return this._playerScore - compareGetScore;
			
			
		}
		
	
		
	}
