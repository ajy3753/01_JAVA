package logOfJava;

public class Game {
	// 매개변수
	private String player;
	private int stage;
	
	// 기본 생성자
	public Game() {}
	
	public Game(String player, int stage) {
		this.player = player;
		this.stage = stage;
	}
	
	// getter
	public String getPlayer() {
		return this.player;
	}
	
	public int getStage() {
		return this.stage;
	}
	
	// setter
	public void setPlayer(String player) {
		this.player = player;
	}
	
	public void setStage(int stage) {
		this.stage = stage;
	}
}
