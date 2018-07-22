package game;

import java.util.List;


public class Figure {

	private static final String[] FIGURE_NAME = {"ROCK","PAPER","SCISSORS"};

	/** The name. */
	private String name;

	/** The index. */
	private Integer index;

	/** List of Figures to wins*/
	private List<Figure> winTo;
	
	/** List of figures to draw*/
	private List<Figure>  DrawTo;	

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public Integer getIndex() {
		return this.index;
	}



	/**
	 * Instantiates a new figure.
	 *
	 * @param index
	 *            the index
	 */
	public Figure(Integer index) {

		this.name = FIGURE_NAME[index];

		this.index = index;

	}

	/**
	 * Draw.
	 *
	 * @param f
	 *            the f
	 * @return true, if successful
	 */
	public boolean draw(Figure f) {
		if (f == null) {
			return false;
		}
		return this.DrawTo.contains(f);
	}

	/**
	 * Win to.
	 *
	 * @param f
	 *            the f
	 * @return true, if successful
	 */
	public boolean winTo(Figure f) {
		if (f == null) {
			return false;
		}
		
		return this.winTo.contains(f);
	}
	
	public List<Figure> getWinTo() {
		return winTo;
	}

	public void setWinTo(List<Figure> winTo) {
		this.winTo = winTo;
	}

	public List<Figure> getDrawTo() {
		return DrawTo;
	}

	public void setDrawTo(List<Figure> drawTo) {
		DrawTo = drawTo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
	
	@Override
	public boolean equals(Object o){
		Figure figure = (Figure)o; 
		if (figure==null){
			return Boolean.FALSE;
		}
		return figure.getIndex() == this.getIndex();
	}
}
