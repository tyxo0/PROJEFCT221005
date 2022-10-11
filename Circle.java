interface Shape{
    final double PI =3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}
public class Circle implements Shape{
    @Override
    public void redraw() {
        Shape.super.redraw();
    }
    public void draw(){
        System.out.println("반지름이 " +r +"인 원입니다.");
    }
    public double getArea(){
        return PI * r * r;
    }

    int r;
    private Circle(int r){
        this.r =r;
    }
    public static void main(String[] args) {
        Shape donut = new Circle(10);
        donut.redraw();
        System.out.println("면적은 " + donut.getArea() *10 /10.0);
    }
}
