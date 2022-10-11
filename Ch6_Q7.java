import java.util.Scanner;
import java.util.StringTokenizer;

public class Ch6_Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        
        while(true){
            System.out.print(">>");
            str = scanner.nextLine();
            if(str.equals("그만"))
                break;
            //(1) StringTokenizer이용

            StringTokenizer strtn = new StringTokenizer(str, " ");
            System.out.println("어절의 개수는 " + strtn.countTokens());
            //(2) split 이용
            // String tempStr[] =str.split(" ");
            // System.out.println("어절의 개수는 " +tempStr.length);
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}
