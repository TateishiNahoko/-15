package miniproject_1;

 

public class Board {
    
//    属性（int = 3）
    
    public static final int size = 3;
    private Cell[] cells = new Cell[size*size];
    private Line[] lines = new Line[size*2+2];
    
//    (3,3)
    public Board() {
        int index = 0;
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                cells[index] = new Cell(x,y);
                index++;
            }
        }
    }
    
//    ラインが8つ
    private void makeLine() {
//        8回ループする
        for (int i = 0; i <= lines.length; i++) {    
//            ラインを生成する
            Cell[] cells= new Cell[size];
            lines[i] = new Line(cells);
        }
        
        int lineno = 0;
        int cellno = 0;
//        ラインにセルを登録する
//        縦ラインの登録
        for (int x = 1; x <= size; x++) {
            for (int y = 1; y <= size; y++) {
                lines[lineno].cell[cellno] = new Cell(x,y);
                cellno++;
            }
            lineno++;
        }
        
        cellno = 0;
//        横ラインの登録
        for (int y = 1; y <= size; y++) {
            for (int x = 1; x <= size; x++) {
                lines[lineno].cell[cellno] = new Cell(x,y);
                cellno++;
            }
            lineno++;
        }
        
        cellno = 0;
//        斜めラインの登録
        for (int x = 1,y = 1; x <= size && y <= size; x++,y++) {
                lines[lineno].cell[cellno] = new Cell(x,y);
                cellno++;
            }
            lineno++;
        
        cellno = 0;
        for (int x = size,y = 1; x <= 1 && y >= size; x--,y++) {
                lines[lineno].cell[cellno] = new Cell(x,y);
                cellno++;
        }
    }
    
//    マスを指定する・範囲内外かの確認・マークを置く
    public void selectCell(int x, int y) {
        
        checkArea (x, y);
        
        Mark mark = null; //今既に入っているかのマーク
        mark = cells[0].checkCell(); //(1,1)
        
        if(mark == null) {
        	
        	cell.setMark(Mark.CIRCLE);
        	
        }
        
        /*cells[1].checkCell();
        cells[2].checkCell();
        cells[3].checkCell();
        cells[4].checkCell();
        cells[5].checkCell();
        cells[6].checkCell();
        cells[7].checkCell();
        cells[8].checkCell();*/
        
        
        Mark mark = null;
        cell.setMark(mark);
        
    }
    
//     入力された文字列の判定
    public boolean checkArea(int x, int y) {
            if (x < 1 || y < 1 || 3 < x || 3 < y) { //範囲外なら
            	
                System.out.println("1から3の数字を入力してください。"); 
                return false;
            }else {
            	
            	return true;
            }
            
    }

 

    
                    
//    3つ並んでいるかどうかの確認
    public boolean judge() {
//    checkLineをもってくる、checkLineがtrueだったらjudgeもtrue
        Cell[] cell= new Cell[3];
        Line result = new Line(cell);
        
        if (result.checkLine()) {
            return true;
        } 
        return false;
    }        
//        checkLineをして、（もってきて？）さっき作ったLineと比較（勝利ラインかどうかの判定）    
//        true 抜ける　ゲーム終了
//        false 抜けない　選択に戻る
//        っていうのをメインに返す
//    Lineクラスから値を持ってくる（checkLine）        

 

 

//    ボードの状態を表示する
    public void showBoard() {
        Mark mark;
        String squareLine = "-------";
            
        System.out.println(squareLine);

 

        for(int y = 0; y < 3; y++) {
            System.out.print("|");
            for(int x = 0; x < 3; x++) {
                mark = cell(x,y).getMark();
                if(mark == Mark.CIRCLE) {
                    System.out.print("○");
                } else {
                    System.out.print(" ");
                }
                    System.out.print("|");
            }
                System.out.println();
                System.out.println(squareLine);
            }
        }

 


//    ゲーム終了の表示をする
    public void showFinish() {
//        勝利ラインが確定したら（true）
        System.out.println("ゲーム終了");
    }
}