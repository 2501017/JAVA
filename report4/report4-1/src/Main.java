import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int onepyeong = 56000;
        int area;
        int price;

        System.out.print("주택 면적(평) 입력 : ");
        area = keyboard.nextInt();

        price = area * onepyeong;

        price /= 1000;
        price *= 1000;

        System.out.printf("주택 면적: %,d 평\n", area);
        System.out.printf("주택 가격: %,d 원\n", price);





    }
}