import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int amount;
        int vat;
        int total;

        System.out.print("판매 금액 입력: ");
        amount = keyboard.nextInt();

        vat = (int) (amount * 0.10);
        total = amount + vat;

        System.out.printf("판매금액 : %,d 원\n", amount);
        System.out.printf("부가가치세 : %,d 원\n", vat);
        System.out.printf("총계 : %,d 원\n", total);

    }
}