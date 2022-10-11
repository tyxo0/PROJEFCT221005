public class Mypoint {
    int x, y;
    public Mypoint(int x, int y){
        this.x = x;
        this. y = y;
    }
    public boolean equals(Mypoint mypoint){
        if(this.x == mypoint.x && this.y == mypoint.y)
            return true;
        else 
            return false;
    }
	public String toString() {

		return "Point(" + x + "," + y+")";
	}
    public static void main(String[] args) {
        Mypoint p = new Mypoint(3, 50);
        Mypoint q = new Mypoint(4, 50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은 점");
        else 
            System.out.println("다른 점");
    }   
}
