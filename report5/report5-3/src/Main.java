//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int time;
        int hours;
        int minutes;
        int seconds;
        int rem;

        time = 3600;

        System.out.print("초를 입력하세요:");
        time = keyboard.nextInt();;

        hours = time / 3600;
        rem = time % 3600;
        minutes = rem / 60;
        seconds = rem % 60;

        System.out.printf("%d 초 = %d시간, %d분, 그리고 %d초 입니다.\n",time,hours,minutes,seconds);
    }
}