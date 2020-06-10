package miniproject_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardCellTest {

	@Test
    public void testBoard1_1() {

		Board board = new Board();
		board.selectCell(1,1);
		board.showBoard();
	    }
	
	@Test
	public void testBoard1_2() {
		Board board = new Board();
		board.selectCell(0,4);
	}
	
}
