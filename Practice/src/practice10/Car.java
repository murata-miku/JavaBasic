package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	
	int run() {
		this.gasoline--;
		
		if(this.gasoline < 0) {
			return -1;
		}
		
		int x = new java.util.Random().nextInt(15)+1;
		return x;
	}
	
}
