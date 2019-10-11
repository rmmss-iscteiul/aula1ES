package Aasvdhashdah;

public class Tree {

	private int height;
	
	public Tree(int x) {
		
		setHeight(x);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void cut (int x) {
		
		height = x--;
	}
	
}