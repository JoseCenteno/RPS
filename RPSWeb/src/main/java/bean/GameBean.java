package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import game.Round;
public class GameBean {
	
	private List<Round> lstRound;
	
	/** The Iterations. */
	private int iterations;


	/** The wins player 1. */
	private Integer winsPlayer1;
	
	/** The wins player 2. */
	private Integer winsPlayer2;
	
	/** The draw. */
	private Integer draw;
	
	private StadisticBean stadisticBean;
	
	public GameBean() {

		initialize();
	}

	public void reset(ActionEvent actionEvent) {
		initialize();
	}
	public void play(ActionEvent actionEvent) {
		
		Round round = new Round();
		//Execute one move
		round.go();
		//Get winner player
		switch (round.getWinner()) {
		case 0:
			this.draw ++;
			stadisticBean.addDraw();
			break;
		case 1:
			this.winsPlayer1 ++;
			stadisticBean.addPlayer1Win();
			break;
		case 2:
			this.winsPlayer2 ++;
			stadisticBean.addPlayer2Win();
			break;
		}
		// Add to the Move List	
		this.lstRound.add(round);
		this.iterations ++;
		stadisticBean.addTotalRound();

	}

	private void initialize(){
		//Initialization
		this.iterations = 0;
		this.winsPlayer1 = 0;
		this.winsPlayer2 = 0;
		this.draw = 0;
		this.lstRound = new ArrayList<>();
	}
	
	/* Getters & Setters*/ 
	public List<Round> getLstRound() {
		return lstRound;
	}

	public void setLstRound(List<Round> lstRound) {
		this.lstRound = lstRound;
	}

	public int getIterations() {
		return iterations;
	}

	public void setIterations(int iterations) {
		this.iterations = iterations;
	}

	public Integer getWinsPlayer1() {
		return winsPlayer1;
	}

	public void setWinsPlayer1(Integer winsPlayer1) {
		this.winsPlayer1 = winsPlayer1;
	}

	public Integer getWinsPlayer2() {
		return winsPlayer2;
	}

	public void setWinsPlayer2(Integer winsPlayer2) {
		this.winsPlayer2 = winsPlayer2;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public StadisticBean getStadisticBean() {
		return stadisticBean;
	}

	public void setStadisticBean(StadisticBean stadisticBean) {
		this.stadisticBean = stadisticBean;
	}
}
