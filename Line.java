package miniproject_1;

public class Line {

	public Cell[] cell = new Cell[3];

	public Line(Cell[] cell) {
		for (int i = 0; i < this.cell.length; i++) {
			this.cell[i] = cell[i];
		}
	}

	public boolean checkLine() {
		if (cell[0].checkCell() == Mark.CIRCLE && cell[1].checkCell() == Mark.CIRCLE
				&& cell[2].checkCell() == Mark.CIRCLE) {
			return true;
		}
		return false;
	}

}
