package miniproject_2;

import java.util.Scanner;

public class Player {
	private Mark mark;
	private String name;
	
	
	public Player(String name, Mark mark) {
		this.name = name;
		this.mark = mark;
	}
    public int[] selectCell() {
    	int[] xy = new int[2];
    	Scanner scanner = new Scanner(System.in);
    	String line = scanner.nextLine();
		String[] zahyo = line.split(" ");
		xy[0] = Integer.parseInt(zahyo[0]);
		xy[1] = Integer.parseInt(zahyo[1]);
    	
    
        return xy;
    }
 
    public String getName() {
    	return name;
    }

}
