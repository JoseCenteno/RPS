package game;

import factory.FigureFactory;

/**
 * The Class Move.
 */
public class Round {

	/** The Figure 1. */
	private Figure figure1;

	/** The Figure 2. */
	private Figure figure2;

	/** The winner. */
	private Integer winner;

	
	
	/**
	 * Gets the figure 1.
	 *
	 * @return the figure 1
	 */
	public Figure getFigure1() {
		return this.figure1;
	}



	/**
	 * Gets the figure 2.
	 *
	 * @return the figure 2
	 */
	public Figure getFigure2() {
		return this.figure2;
	}



	/**
	 * Gets the winner.
	 *
	 * @return the winner
	 */
	public Integer getWinner() {
		return this.winner;
	}



	/**
	 * Go.
	 */
	public void go() {
		FigureFactory ffactory = FigureFactory.getInstance();
		//Figure 1 random
		this.figure1 = ffactory.getRamdonFigure();
		//Figure 2 always Rock
		this.figure2 = ffactory.getRock();
		//Get the winner
		if (figure1.draw(figure2)) {
			this.winner = 0;
		} else if (figure1.winTo(figure2)) {
			this.winner = 1;
		} else
			this.winner = 2;
	}
	
	
}
