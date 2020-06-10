package miniproject_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testBoard1_1() {

		int x = 2;
		int y = 2;

		Board board = new Board();

		boolean actual = board.checkArea(x, y);
		boolean expected_result = true;

		assertThat(actual, is(expected_result));
	}

	@Test
	public void testBoard1_2() {

		int x = 0;
		int y = 1;

		Board board = new Board();

		boolean actual = board.checkArea(x, y);
		boolean expected_result = false;

		assertThat(actual, is(expected_result));
	}

	@Test
	public void testBoard1_3() {

		int x = 1;
		int y = 0;

		Board board = new Board();

		boolean actual = board.checkArea(x, y);
		boolean expected_result = false;

		assertThat(actual, is(expected_result));
	}

	@Test
	public void testBoard1_4() {

		int x = 3;
		int y = 4;

		Board board = new Board();

		boolean actual = board.checkArea(x, y);
		boolean expected_result = false;

		assertThat(actual, is(expected_result));
	}

	@Test
	public void testBoard1_5() {

		int x = 4;
		int y = 3;

		Board board = new Board();

		boolean actual = board.checkArea(x, y);
		boolean expected_result = false;

		assertThat(actual, is(expected_result));
	}

	@Test
	public void testBoard2_1() {

		Board board = new Board();
		board.showBoard();
	}

	@Test
	public void testBoard3_1() {

		Board board = new Board();
		board.showFinish();

	}
}
