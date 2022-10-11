import java.util.Scanner;

public class Ch6_Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp, compu;
        String rsp[] ={" ", "가위", "바위", "보"};
        while(true){
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            inp =scanner.nextInt();
            if(inp == 4)
                break;
            compu = (int)(Math.random()*3) +1;
            System.out.println("철수(" + rsp[inp] + "): 컴퓨터 (" + rsp[compu] + ")");
            
            if(inp == compu)
                System.out.println("비겼습니다.");
            else{
                if(inp==1){
                    if(compu == 3)
                        System.out.println("철수가 이겼습니다.");
                    else
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                if(inp == 2){
                    if(compu == 1)
                        System.out.println("철수가 이겼습니다.");
                    else
                        System.out.println("컴퓨터가 이겼습니다.");
                    }
                if(inp == 3){
                    if(compu == 2)
                        System.out.println("철수가 이겼습니다.");
                    else
                        System.out.println("컴퓨터가 이겼습니다.");
                    }    
                }
        }
        scanner.close();
    }
}
