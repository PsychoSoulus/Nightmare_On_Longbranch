
public abstract class Item {
	private String Name;
	private String Desc;
	private boolean Owned; 
	public Item(String x, String y) {
		Name=x;
		Desc=y;
		Owned=false;
	}
	
	public Item(String x, String y, boolean z) {
		Name=x;
		Desc=y;
		Owned=z;
	}
	
}
