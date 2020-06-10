package miniproject_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class BoardLineTest {

	Cell[] cells = new Cell[3];
	
	@Test
	public void testBoardLine1_1() {

		Board board= new Board();
		
		board.selectCell(1,1);
		board.selectCell(2,2);
		board.selectCell(3,3);

		
		boolean actual = board.judge();
		boolean expected_result = true;
		
		assertThat(actual, is(expected_result));
	}
	
	@Test
	public void testBoardLine1_2() {
		
		Board board= new Board();

		board.selectCell(1,1);
		
		boolean actual = board.judge();
		boolean expected_result = false;
		
		assertThat(actual, is(expected_result));
	}
}

