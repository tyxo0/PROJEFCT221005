import java.util.Scanner;

abstract class Calc{
    public int a, b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    };
    protected abstract int calculate();    
}
class Add extends Calc{
    @Override
    public void setValue(int a, int b) {
        super.setValue(a, b);
    }
    @Override
    protected int calculate() { 
        return a+b;
    }
}
class Sub extends Calc{
    @Override
    public void setValue(int a, int b) {
        super.setValue(a, b);
    }
    @Override
    protected int calculate() {
        return a-b;
    }
}
class Mul extends Calc{
@Override
    public void setValue(int a, int b) {
        super.setValue(a, b);
    }
    @Override
    protected int calculate() {
        return a *b;
    }
}
class Div extends Calc{
    @Override
    public void setValue(int a, int b) {
        super.setValue(a, b);
    }
    @Override
    protected int calculate() {
        return a/b;
    }
}
public class Ch5_Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        char operator;
        System.out.print("두 정수 연산자를 입력하시오>>");
        a= scanner.nextInt();
        b= scanner.nextInt();
        operator = scanner.next().charAt(0);
        switch(operator){
            case '+':
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(add.calculate());
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(sub.calculate());
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(mul.calculate());
                break;
            case '/':
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(div.calculate());
                break;
        }
        scanner.close();
    }
}
