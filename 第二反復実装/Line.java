package miniproject_2;

public class Line {
	
	public Cell[] cell = new Cell[3];

	public Line(Cell cell1, Cell cell2, Cell cell3) {
		//for (int i = 0; i < this.cell.length; i++) {
			//this.cell[i] = cell[i];
		//}
		this.cell[0] = cell1;
		this.cell[1] = cell2;
		this.cell[2] = cell3;
	}

	public boolean checkLine() {
		if (cell[0].checkCell() == Mark.CIRCLE && cell[1].checkCell() == Mark.CIRCLE
				&& cell[2].checkCell() == Mark.CIRCLE) {
			return true;
		}
		if (cell[0].checkCell() == Mark.CROSS && cell[1].checkCell() == Mark.CROSS
				&& cell[2].checkCell() == Mark.CROSS) {
			return true;
		}
		return false;
	}

}

}
