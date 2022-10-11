public class ColorPoint extends Point{
    String color;
    public ColorPoint(int x, int y, String str) {
        super(x, y);
        this.color = str;
    }
    public void setXY(int x, int y){
        this.move(x, y);
    }
    public void setColor(String inp){
        color = inp;
    }
    public String toString(){
        return (this.color + "색의 (" + this.getX() +"," + this.getY()+
        ")의 점");
    }
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str =cp.toString();
        System.out.println(str + " 입니다.");
    }
}
