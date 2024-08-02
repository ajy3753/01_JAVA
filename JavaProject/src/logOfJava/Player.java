package logOfJava;

public class Player extends Game {
	// 필드
	private Items i = new Items();
	private String job;
	private String[] items = new String[5];
	private int ATK;
	private int HP;
	private int CRIT;
	private int DROP;
	
	// 기본 생성자
	public Player() {}
	
	public Player(String player, String job) {
		super(player, 1);
		this.job = job;
		this.items[0] = "주먹밥";
	}
	
	public Player(String player, String job, int stage, String[] items) {
		super(player, stage);
		this.job = job;
		this.items = items;
	}
	
	// getter
	public String getPlayer() {
		return super.getPlayer();
	}
	
	public String getJob() {
		return this.job;
	}
	
	public int getStage() {
		return super.getStage();
	}
	
	public String[] getItems() {
		return this.items;
	}
	
	// setter
	public void setPlayer(String player) {
		super.setPlayer(player);
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setStage(int stage) {
		super.setStage(stage);
	}
	
	public void setItems(String[] items) {
		this.items = items;
	}
}
