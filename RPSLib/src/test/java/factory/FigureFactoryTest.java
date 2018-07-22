package factory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import game.Figure;

public class FigureFactoryTest {

	@Test
	public void testGetInstance() {		
		FigureFactory ffactory = FigureFactory.getInstance();
		
		assertTrue("Error geting instace FigureFactory", ffactory !=null);
		
		ffactory = FigureFactory.getInstance();
		
		assertTrue("Error geting instace FigureFactory", ffactory !=null);
	}
	
	@Test
	public void testGetRock(){
		FigureFactory ffactory = FigureFactory.getInstance();
		Figure figure = ffactory.getRock();
		
		assertTrue("Error geting Rock", figure.getIndex() == 0);
	}
	
	@Test
	public void testGetPaper(){
		FigureFactory ffactory = FigureFactory.getInstance();
		Figure figure = ffactory.getPaper();
		
		assertTrue("Error geting Paper", figure.getIndex() == 1);
	}
	
	@Test
	public void testGetScissors(){
		FigureFactory ffactory = FigureFactory.getInstance();
		Figure figure = ffactory.getScissor();
		
		assertTrue("Error geting Scissor", figure.getIndex() == 2);
	}
	
	@Test
	public void testGetRandom(){
		Integer first_idx = 0;
		Integer idx = 0;
		Integer i = 0;
		Boolean diff = false;
		
		FigureFactory ffactory = FigureFactory.getInstance();
		Figure figure = ffactory.getRamdonFigure();
		first_idx = figure.getIndex();
		 
		do {
		  figure = ffactory.getRamdonFigure();
		  idx = figure.getIndex();
		  if (!diff & idx != first_idx) {		  
			  diff = true;
		  }
		  i++;		
		} while(i<10);
							
		assertTrue(diff);	
	}
}
