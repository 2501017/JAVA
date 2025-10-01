import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float C = 0;
        float F = 0;

        System.out.print("섭씨 온도를 입력하세요. :");
        C = keyboard.nextInt();
        F = C * 9 / 5 + 32;

        System.out.printf("화씨 온도는 %.1f 입니다.", F);
    }
}