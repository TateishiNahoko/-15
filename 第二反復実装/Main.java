package miniproject_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Board board = new Board();
		int x = 0;
		int y = 0;
		boolean result = true;
		
		do{
			
		do {
			System.out.println("列と行を、半角スペースで区切って入力して下さい(例：2列目の3行目 → 2 3) ");

			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			String[] zahyo = line.split(" ");
			x = Integer.parseInt(zahyo[0]);
			y = Integer.parseInt(zahyo[1]);

			System.out.println("確認結果" + x + " " + y);

			result = board.selectCell(x, y);
		} while (result == false);
		
		

		result = board.judge();
		board.showBoard();
	}while(result == false);
	
		if (result == true) {
			board.showFinish();
		}

	}

}

