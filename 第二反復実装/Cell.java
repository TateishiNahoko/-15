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
	
	public Mark getMark() {
		return mark;
	}
	
	public Mark checkCell() {
		return this.mark;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean checkFullCell() {
		if(this.mark == Mark.NONE) {
			return false;	
		} else {
			System.out.print("‚·‚Å‚É’u‚©‚ê‚Ä‚¢‚Ü‚·B");
			return true;
		}
	}
}






