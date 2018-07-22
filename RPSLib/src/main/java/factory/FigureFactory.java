package factory;

import java.util.ArrayList;
import java.util.Random;

import game.Figure;

public class FigureFactory {

	static FigureFactory instance;
	static Random randomGenerator;
	
	public static FigureFactory getInstance(){
		if (instance == null) {
			instance = new FigureFactory();
			randomGenerator = new Random();
		}
		return instance;
	}
	
	public Figure getRock(){
		Figure rock = new Figure(0);
		rock.setDrawTo(new ArrayList<>());
		rock.setWinTo(new ArrayList<>());
		
		rock.getDrawTo().add(new Figure(0));
		rock.getWinTo().add(new Figure(2));
		
		return rock;
	}
	
	public Figure getPaper(){
		Figure paper = new Figure(1);
		paper.setDrawTo(new ArrayList<>());
		paper.setWinTo(new ArrayList<>());
		
		paper.getDrawTo().add(new Figure(1));
		paper.getWinTo().add(new Figure(0));
		
		return paper;
	}
	
	public Figure getScissor(){
		Figure scissor = new Figure(2);
		scissor.setDrawTo(new ArrayList<>());
		scissor.setWinTo(new ArrayList<>());
		
		
		scissor.getDrawTo().add(new Figure(2));
		scissor.getWinTo().add(new Figure(1));
		
		return scissor;
	}
	
	public Figure getRamdonFigure(){
		int index  = randomGenerator.nextInt(3);
		switch (index) {
		case 0:
			return getRock();
		case 1:
			return getPaper();
		case 2:
			return getScissor();
		default:
			return getRock();
		}
	}
}
