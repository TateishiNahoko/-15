package miniproject_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Board board = new Board();
		int x = 0;
		int y = 0;
		boolean result = true;
		
		do{
			
		do {
			System.out.println("��ƍs���A���p�X�y�[�X�ŋ�؂��ē��͂��ĉ�����(��F2��ڂ�3�s�� �� 2 3) ");

			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			String[] zahyo = line.split(" ");
			x = Integer.parseInt(zahyo[0]);
			y = Integer.parseInt(zahyo[1]);

			System.out.println("�m�F����" + x + " " + y);

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

