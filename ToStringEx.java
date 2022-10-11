class Ch6_Point2 {
        int x, y;
        
        public Ch6_Point2(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public String toString() {
            return "Point(" + x + "," + y + ")";
        }
    }
    public class ToStringEx {
        public static void main(String[] args) {
            Ch6_Point2 p = new Ch6_Point2(2, 3);
            System.out.println(p.toString());
            System.out.println(p);
            System.out.println(p + "입니다.");
        }
}