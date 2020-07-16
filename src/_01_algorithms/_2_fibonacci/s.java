package _01_algorithms._2_fibonacci;

public class s {
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = 1;
		System.out.println(x);
		System.out.println(y);
		for (int i = 0; i <12; i++) {
		z = y+x;
		x = y;
		y = z;
		
		System.out.println(z);
		}
		
		
		
		
		
	}

}
