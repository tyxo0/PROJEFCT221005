import java.util.Scanner;

public class Ch6_OpenChallenge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp;
        
        StringBuffer alp[] = new StringBuffer[26];
        
        char startChar = 'A';
        for(int i =0; i<alp.length; i++){
            alp[i] = new StringBuffer(Character.toString(startChar++));
        }

        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        inp = scanner.nextLine();
        StringBuffer strbuff = new StringBuffer(inp);
        while(!inp.equals(";")){
            inp = scanner.nextLine();
            strbuff.append(inp);
            if(inp.equals(";"))
                break;
        }
        
        for(int i=0; i<strbuff.length(); i++){
            char lowerChar = 'a';
            char upperChar = 'A';

            for(int j=0; j<26; j++){
                
                if(strbuff.charAt(i) == lowerChar 
                    || strbuff.charAt(i) == upperChar){
                        alp[j].append("-");
                    }

                lowerChar++;
                upperChar++;
                if(lowerChar >'z'+1)
                    break;
            }
        }
    
        System.out.println('\n'+ "히스토그램을 그립니다.");
        for(int i =0; i<26; i++)
            System.out.println(alp[i]);
        scanner.close();
    }
}