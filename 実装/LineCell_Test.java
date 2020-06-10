package miniproject_1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class LineCell_Test {

		Cell[] cells = new Cell[3];

		@Test
		public void testLine_01マークが3つそろう() {

			Cell cell1 = new Cell(1, 1);
			Cell cell2 = new Cell(2, 2);
			Cell cell3 = new Cell(3, 3);

			cells[0] = cell1;
			cells[1] = cell2;
			cells[2] = cell3;

			Line line = new Line(cell1,cell2,cell3);

			cell1.setMark(Mark.CIRCLE);
			cell2.setMark(Mark.CIRCLE);
			cell3.setMark(Mark.CIRCLE);
			boolean actual = line.checkLine();
			boolean expected_result = true;

			assertThat(actual, is(expected_result));
		}

		@Test
		public void testLine_02マークがそろわない() {

			Cell cell1 = new Cell(1, 1);
			Cell cell2 = new Cell(2, 2);
			Cell cell3 = new Cell(3, 3);

			cells[0] = cell1;
			cells[1] = cell2;
			cells[2] = cell3;

			Line line = new Line(cell1,cell2,cell3);

			cell1.setMark(Mark.CIRCLE);
			cell2.setMark(Mark.CIRCLE);
			cell3.setMark(Mark.NONE);
			boolean actual = line.checkLine();
			boolean expected_result = false;

			assertThat(actual, is(expected_result));
		}

}


