package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.FigureFactory;

public class FigureTest {
	FigureFactory ffactory;
	
	@Before
	public void init() {
		ffactory = FigureFactory.getInstance();
	}

	@Test
	public void testRandomFigure() {
		
		Integer first_idx = 0;
		Integer idx = 0;
		Integer i = 0;
		Boolean diff = false;
		
		
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

	@Test
	public void testFigureInteger() {
		Figure f = ffactory.getScissor();
		assertTrue("Error getFigure Scissors", f.getIndex() == 2);
	}

	@Test
	public void testDraw() {
		Figure figure1 = ffactory.getPaper();
		Figure figure2 = ffactory.getPaper();

		assertTrue("Error in Draw", figure1.getIndex() == figure2.getIndex());
		assertTrue("Error in Draw", figure1.draw(figure2));
	}

	@Test
	public void testWinTo() {
		Figure figure1 = ffactory.getRock();
		Figure figure2 = ffactory.getScissor();

		assertTrue("Error in rock wins to scissors", figure1.winTo(figure2));

	}

}
