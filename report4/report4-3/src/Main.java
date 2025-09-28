import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int dollars;
    int half;
    int quater;
    int dime;
    int nickel;
    int penny;
    int total;

    System.out.print("달러 개수 입력: ");
    dollars = keyboard.nextInt();
    System.out.print("하프 개수 입력: ");
    half = keyboard.nextInt();
    System.out.print("쿼터 개수 입력: ");
    quater = keyboard.nextInt();
    System.out.print("다임 개수 입력: ");
    dime = keyboard.nextInt();
    System.out.print("니켈 개수 입력: ");
    nickel = keyboard.nextInt();
    System.out.print("페니 개수 입력: ");
    penny = keyboard.nextInt();

    total = (dollars * 100) + (half * 50) + (quater * 25)
            + (dime * 10) + (nickel * 5) + penny;

        System.out.printf("총 금액은 %d 센트입니다.", total);

    }
}