package miniproject_2;

public class Turn {
	private int turn = 0;
	private Player player;
	private Cell cell;
	

	public Turn(Player player) {
		this.player = player;
		this.turn++;
	}

	public void showTurnHistory() {
		System.out.print(player.getName() + ":(" + cell.getX() + "," + cell.getY() + ") ");
		Mark mark = cell.getMark();
		if (mark == Mark.CIRCLE) {
			System.out.println("○");
		} else if (mark == Mark.CROSS) {
			System.out.println("×");
		}
	}

	public void startTurn(Board board) {//引数をつけることをTictactoeの人に伝える
		int[] zahyou = new int[2];
		zahyou = player.selectCell();
		
		board.checkArea(zahyou[0],zahyou[1]);
		
		cell.checkCell();
		
		cell.setMark(mark);

	}

}
