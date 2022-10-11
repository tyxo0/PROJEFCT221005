import java.util.Calendar;

public class Ch6_Q5 {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR);

        System.out.println("현재 시간은 " + hour +"시 " 
        + now.get(Calendar.MINUTE) + "분 입니다.");
        if(hour >4 && hour <12)
            System.out.println("Good Moring");
        else if(hour <18)
            System.out.println("Good Afternoon");
        else if(hour <22)
            System.out.println("Good Evening");
        else 
            System.out.println("Good Night");
    }
}
