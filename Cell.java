package miniproject_1;

public class Cell {

	private int x;
	private int y;
	private Mark mark;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		this.mark = Mark.NONE;
	}
	
	public void setMark(Mark mark) {
		this.mark = mark;
	}
	
	public Mark checkCell() {
		return this.mark;
	}
}


