package bean;

public class StadisticBean {
	/** The Iterations. */
	private int totalRounds;

	/** The wins player 1. */
	private Integer winsPlayer1;
	
	/** The wins player 2. */
	private Integer winsPlayer2;
	
	/** The draw. */
	private Integer draw;
	
	public StadisticBean() {
		initialize();
	}


	private void initialize(){
		//Initialization
		this.totalRounds = 0;
		this.winsPlayer1 = 0;
		this.winsPlayer2 = 0;
		this.draw = 0;
	}


	public int getTotalRounds() {
		return totalRounds;
	}


	public Integer getWinsPlayer1() {
		return winsPlayer1;
	}


	public Integer getWinsPlayer2() {
		return winsPlayer2;
	}


	public Integer getDraw() {
		return draw;
	}
	
	public synchronized void addPlayer1Win(){
		winsPlayer1++;
	}
	
	public synchronized void addPlayer2Win(){
		winsPlayer2++;
	}
	
	public synchronized void addDraw(){
		draw++;
	}
	
	public synchronized void addTotalRound(){
		totalRounds++;
	}
}
