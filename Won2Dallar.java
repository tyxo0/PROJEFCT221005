import java.util.Scanner;

abstract class Converter{
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDesString();
    protected double ratio;

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 "+ getDesString() +"로 바꿉니다.");
        System.out.print(getSrcString() +"을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과 " + res + getDesString() + "입니다.");
        scanner.close();
    }
}

public class Won2Dallar extends Converter{
    @Override
    protected double convert(double src) {
        
        return src/ratio;
    }
    @Override
    protected String getSrcString() {
    
        return "원";
    }
    @Override
    protected String getDesString() {
        return "달러";
    }
    public Won2Dallar(double inp){
        ratio = inp;
    }
    public static void main(String[] args) {
        Won2Dallar toDallar = new Won2Dallar(1200); //1달러 == 1200
        toDallar.run();
    }
    


}
