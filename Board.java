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
        makeLine();
    }
    
//    ラインが8つ
    private void makeLine() {
//        8回ループする
        //for (int i = 0; i < lines.length; i++) {    
//            ラインを生成する
            //Cell[] cells= new Cell[size];
            //lines[i] = new Line(cells);
        //}
        
        int lineno = 0;
        int cellno = 0;
//        ラインにセルを登録する
//        縦ラインの登録
        
        for (int i = 0; i < size; i++) {
            //for (int y = 1; y <= size; y++) {
                //lines[lineno].cell[cellno] = new Cell(x,y);
            	lines[lineno] = new Line(cells[i],cells[3 + i],cells[6 + i]);
                //cellno++;
            //}
            lineno++;
        }
        
        cellno = 0;
//        横ラインの登録
        for (int i = 0; i < size; i++) {
            //for (int x = 1; x <= size; x++) {
                //lines[lineno].cell[cellno] = new Cell(x,y);
        	lines[lineno] = new Line(cells[i * size],cells[1 + i * size],cells[2 + i * size]);
                //cellno++;
            //}
            lineno++;
        }
        
        cellno = 0;
//        斜めラインの登録
        //for (int x = 1,y = 1; x <= size && y <= size; x++,y++) {
                //lines[lineno].cell[cellno] = new Cell(x,y);
        	lines[lineno] = new Line(cells[0],cells[4],cells[8]);
        	lineno++;
        	
        	lines[lineno] = new Line(cells[2],cells[4],cells[6]);
                //cellno++;
            //}
            //lineno++;
        
        cellno = 0;
        for (int x = size,y = 1; x <= 1 && y >= size; x--,y++) {
                lines[lineno].cell[cellno] = new Cell(x,y);
                cellno++;
        }
    }
    
//    マスを指定する・範囲内外かの確認・マークを置く
    public boolean selectCell(int x, int y) {  
        
    	boolean resultcheckArea = true;
    	resultcheckArea = checkArea (x, y);
         if(resultcheckArea == false) {
        	 return false;
         }
        int index = 0;
        
        if(x == 1) {
        	if(y == 1) {
        		index = 0;
        	}else if(y == 2){
        		index = 1;
        	}else {
        		index = 2;
        	}
        }else if(x == 2){
        	if(y == 1) {
        		index = 3;
        	}else if(y == 2){
        		index = 4;
        	}else {
        		index = 5;
        	}
        }else {
        	if(y == 1) {
        		index = 6;
        	}else if(y == 2){
        		index = 7;
        	}else {
        		index = 8;
        	}
        }
        Mark mark = Mark.NONE; //今既に入っているかのマーク
        mark = cells[index].checkCell(); 
        if(mark == Mark.NONE) {
        	cells[index].setMark(Mark.CIRCLE);
        }else {
        	return false;
        }
        return true;
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
    	
    	boolean result = false;
    	for(int i = 0; i < lines.length; i++) {
    		result = lines[i].checkLine();
    		if(result == true) {
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

        int index = 0;
        for(int y = 0; y < 3; y++) {
            System.out.print("|");
                for(int x = 0; x < 3; x++) {
                mark = cells[index].checkCell();
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