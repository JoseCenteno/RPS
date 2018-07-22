package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.FigureFactory;

public class MoveTest {
	FigureFactory ffactory;
	
	@Before
	public void init(){
		ffactory = FigureFactory.getInstance();
	}
	
	@Test
	public void testGoFigure2() {		
		Round round = new Round();
		
		round.go();
		assertTrue("Error figure2 is not Rock", round.getFigure2().equals(ffactory.getRock()));
	}

	@Test
	public void testGoFigure1() {		
		
		Integer first_idx = 0;
		Integer idx = 0;
		Integer i = 0;
		Boolean diff = false;
		
		Round round = new Round();
		round.go();
		first_idx = round.getFigure1().getIndex();
		 
		do {
		  round.go();
		  idx = round.getFigure1().getIndex();
		  if (!diff & idx != first_idx) {		  
			  diff = true;
		  }
		  i++;		
		} while(i<10);
							
		assertTrue(diff);	
		
		
	}
	
	@Test
	public void testGoWinner() {		
		Round round = new Round();
		round.go();
		assertTrue("error in go",round.getWinner() ==1 || round.getWinner() == 2 || round.getWinner() == 0);
		
	}
}
