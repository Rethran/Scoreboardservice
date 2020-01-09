import java.util.*;

public class Player implements Comparable<Player> {
	private Integer _playerScore;
	private String _name;
	private Object getScore;
	private List<Player> _players;

	public Player(String name, int score) {
		super();
		this._name = name;
		this._playerScore = score;

	}

	public Player() {

	}

	public Player(String name, Integer score) {

		System.out.println("Player: " + name + " score: " + score);
	}

	public List<Player> getPlayerList() {

		return new ArrayList<Player>(this._players);
	}

	public void setPlayer(String name, int score) {
		_name = name;
		_playerScore = score;
		System.out.println("Player: " + name + " score: " + score);
	}

	public void setPlayerList(List<Player> list) {
		this._players = new ArrayList<Player>(list);
	}

	public Integer getScore() {
		return _playerScore;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public String toString() {

		return this._name + " " + this._playerScore;
	}

	public static String toString(List<Player> players) {
		String s = "";
		for (Player player : players) {
			s += player + "\n";
		}
		return s;
	}

	@Override

	public int compareTo(Player compareScore) {
		int compareGetScore = ((Player) compareScore).getScore();

		if (getScore == null) {
			return 0;
		}
		return this._playerScore - compareGetScore;

	}

	public static Comparator<Player> PlayerScoreComparator = new Comparator<Player>() {
		public int compare(Player player1, Player player2) {
			Integer playerScore1 = player1.getScore();
			Integer playerScore2 = player2.getScore();
			return playerScore2.compareTo(playerScore1);
		}

	};
}