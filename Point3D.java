public class Point3D extends Point {
    int z;
    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    public void moveUp(){
        z+=1;
    }
    public void moveDown(){
        this.z -= 1;}
    @Override
    protected void move(int x, int y) {
        super.move(x, y);
    }
    public void move(int x, int y, int z){
        super.move(x, y);
        this.z = z;
    }
    public String toString(){
        String str;
        str = "(" + Integer.toString(this.getX()) +","
            + Integer.toString(this.getY()) +","+ Integer.toString(z) + ")의 점";
        return str ;
    }
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString() + "입니다.");
        p.moveUp();
        System.out.println(p.toString() + "입니다.");
        p.moveDown();
        p.move(10, 10);
        System.out.println((p.toString() + "입니다."));

        p.move(100, 200, 300);
        System.out.println(p.toString() + "입니다.");
    }
}
