class Ch6_Point3 {
	int x, y;
	
	public Ch6_Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		Ch6_Point3 p = (Ch6_Point3)obj;
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		Ch6_Point3 a = new Ch6_Point3(2, 3);
		Ch6_Point3 b = new Ch6_Point3(2, 3);
		Ch6_Point3 c = new Ch6_Point3(3, 4);
		
		if (a == b)
			System.out.println("a == b");
		if (a.equals(b))
			System.out.println("a is equal to b");
		if (a.equals(c))
			System.out.println("a is equal to c");
	}

}