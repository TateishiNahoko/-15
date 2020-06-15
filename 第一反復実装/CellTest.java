package miniproject_1;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CellTest {
	@Test
	public void Test1() {
		Cell cell = new Cell(2, 2);
		cell.setMark(Mark.CIRCLE);

		Mark actual = cell.checkCell();

		assertThat(actual, is(Mark.CIRCLE));
	}

	@Test
	public void Test2() {
		Cell cell = new Cell(1, 1);
		cell.setMark(Mark.NONE);

		Mark actual = cell.checkCell();

		assertThat(actual, is(Mark.NONE));
	}
}
