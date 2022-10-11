import java.util.Scanner;

interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}
class StringStack implements Stack{

    String str[];
    int savedNum =0;
    public StringStack(int inpSize){
        str = new String[inpSize];
    }
    @Override
    public int length() {// 저장된 수
        return savedNum;
    }

    @Override
    public int capacity() {// 용량
        return str.length;
    }

    @Override
    public String pop() {
        return this.str[--savedNum];
    }

    @Override
    public boolean push(String val) {
        
        if (savedNum >= this.capacity())
            return false;
        else{
            savedNum++;
            this.str[savedNum-1] = val;
            return true;
        }
            
    }
    
}
public class StackApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        String inpStr;
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        size = scanner.nextInt();
        StringStack strStack= new StringStack(size);
        

        while(true){
            System.out.print("문자열 입력 >> ");
            inpStr = scanner.next();
            if(inpStr.equals("그만")){
                System.out.print("스택에 저장된 모든 문자열 팝:");
                for(int i =0; i<strStack.length(); i++)
                    System.out.print(strStack.str[i] + " ");
                break;
            }
            if(!strStack.push(inpStr))
                System.out.println("스택이 꽉 차서 푸시 불가!");
            
        }
        scanner.close();

    }
}
