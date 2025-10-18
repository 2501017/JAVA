import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ticket;
        float discount;
        System.out.print("구매할 식권 개수를 입력하세요: ");
        ticket = keyboard.nextInt();
        discount = (ticket >= 30) ? 0.20f : (ticket >= 20) ? 0.15f : (ticket >= 10) ? 0.10f : 0.0f;
        System.out.printf("구매하신 식권 개수가 %d개 입니다. %.0f%% 할인 가능합니다\n", ticket, discount * 100);
    }
}