import java.util.Scanner;
public class Ch6_Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp;
        String operator;
        StringBuffer strbuff;

        System.out.print(">>");
        inp = scanner.nextLine();
        strbuff = new StringBuffer(inp);
        while(true){
            System.out.print("명령:");
            operator = scanner.nextLine();
            if(operator.equals("그만")) break;
            String opDiv[] = operator.split("!");
            if(opDiv.length !=2 || opDiv[0].equals("")){
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            
            int startidx =strbuff.indexOf(opDiv[0]);

            if(startidx !=-1){
                strbuff.replace(startidx, startidx +opDiv[0].length(), opDiv[1]);
                System.out.println(strbuff);
            }  
            else
                System.out.println("찾을 수 없습니다!");

        }
        System.out.println(strbuff);
        System.out.println("종료합니다.");
        scanner.close();
    }    
}

