package miniproject_2;

public class Board {

	private Cell[][] cells = new Cell[3][3];
    private Line[] lines = new Line[8];

    public Board() {
        // Squareインスタンスを9つ作成
        for(int x=1;x<=3;x++) {
            for(int y=1;y<=3;y++) {
                this.cells[x-1][y-1] = new Cell(x, y);        
            }
        }
    }


//  マスを指定する・範囲内外かの確認・マークを置く

    public boolean selectCell(int x, int y) {

        boolean resultcheckArea = true;
        resultcheckArea = checkArea(x, y);
        if (resultcheckArea == false) {
            return false;
        }
        int index = 0;

        if (x == 1) {
            if (y == 1) {
                index = 0;
            } else if (y == 2) {
                index = 1;
            } else {
                index = 2;
            }
        } else if (x == 2) {
            if (y == 1) {
                index = 3;
            } else if (y == 2) {
                index = 4;
            } else {
                index = 5;
            }
        } else {
            if (y == 1) {
                index = 6;
            } else if (y == 2) {
                index = 7;
            } else {
                index = 8;
            }     
        }

    private makeLine[]; {
            // 横ライン
            lines[0] = new Line(0, 0, 0);
            lines[0].setCell(cells[0][0], cells[1][0], cells[2][0]);
            lines[1] = new Line();
            lines[1].setCell(cells[0][1], cells[1][1], cells[2][1]);
            lines[2] = new Line();
            lines[2].setCell(cells[0][2], cells[1][2], cells[2][2]);
                
            // 縦ライン
            lines[3] = new Line(0, 0, 0);
            lines[3].setCell(cells[0][0], cells[0][1], cells[0][2]);
            lines[4] = new Line();
            lines[4].setCell(cells[1][0], cells[1][1], cells[1][2]);
            lines[5] = new Line();
            lines[5].setCell(cells[2][2], cells[2][2], cells[2][2]);
                
            // 斜めライン
            lines[6] = new Line(0, 0, 0);
            lines[6].setCell(cells[0][0], cells[1][1], cells[2][2]);
            lines[7] = new Line();
            lines[7].setCell(cells[2][0], cells[1][1], cells[0][2]);
        }
    

        Mark mark = Mark.NONE; // 今既に入っているかのマーク
        mark = cells[index].checkCell();
        if (mark == Mark.NONE) {
            cells[index].setMark(Mark.CIRCLE);
        } else {
            System.out.println("既に置かれています。");
            return false;
        }
        return true;
    }


//     入力された文字列の判定
    public boolean checkArea(int x, int y) {
        if (x < 1 || y < 1 || 3 < x || 3 < y) { // 範囲外なら


            System.out.println("1から3の数字を入力してください。");
            return false;
        } else {


            return true;
        }
    }

//    3つ並んでいるかどうかの確認
    public boolean judge() {

        boolean result = false;
        for (int i = 0; i < lines.length; i++) {
            result = lines[i].checkLine();
            if (result == true) {
                return true;
            }
        }
        return false;
    }
//    Lineクラスから値を持ってくる（checkLine）        


//    ボードの状態を表示する
    public void showBoard() {
        Mark mark;
        String squareLine = "-------";
        
        System.out.println(squareLine);


        for(int y=0;y<3;y++) {
            System.out.print("|");
            for(int x=0;x<3;x++) {
                mark = cells[x][y].getMark();
                if(mark == Mark.CIRCLE) {
                    System.out.print("○");
                }
                else if(mark == Mark.CROSS) {
                    System.out.print("×");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            
            System.out.println();
            System.out.println(squareLine);
        }
    }

   public boolean judgeDraw() {
	   
	   boolean result = false;
      for (int i = 0; i < Cell.length; i++) {
    	  result = cells[i].checkFullCell();
      }
           if (result == true) {
               return true;
      }
           
       return false;
   }
 
//    ゲーム終了の表示をする
    public void showFinish() {
//        勝利ラインが確定したら（true）
    	
        System.out.println("勝利");
        
//	全てマスが埋まっていたら引き分け
        System.out.println("引き分け");
    }
}
