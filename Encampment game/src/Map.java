public class Map {
	private String topMap = "[][][][][][][][][][]";
	private String bottomMap = "[][][][][]";
	private String newLine = System.lineSeparator();
	private static int rightPlayerTop = 19;
	private static int rightPlayerBottom = 9;
	private static int leftPlayerTop = 1;
	private static int leftPlayerBottom = 1;
	
	public void setRightPlayerTop(int move) {
		rightPlayerTop += move;
	}
	public void setRightPlayerBottom(int move) {
		rightPlayerBottom += move;
	}
	public void setLeftPlayerTop(int move) {
		leftPlayerTop += move;
	}
	public void setLeftPlayerBottom(int move) {
		leftPlayerBottom += move;
	}
	
	public int getRightPlayerTop() {
		return rightPlayerTop;
	}
	public int getRightPlayerBottom() {
		return rightPlayerBottom;
	}
	public int getLeftPlayerTop() {
		return leftPlayerTop;
	}
	public int getLeftPlayerBottom() {
		return leftPlayerBottom;
	}
	
	String getMap(){
		StringBuilder map1 = new StringBuilder(topMap);
		StringBuilder map2 = new StringBuilder(bottomMap);
		map1 = map1.insert(rightPlayerTop, "$");
		map2 = map2.insert(rightPlayerBottom, "$");
		map1 = map1.insert(leftPlayerTop, "@");
		map2 = map2.insert(leftPlayerBottom, "@");
		String map = map1 + newLine + map2;
		return map;
	}
}
