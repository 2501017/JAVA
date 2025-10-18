import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double liter;
        double price;
        double tax;
        double result;
        double discount;
        double lastPrice;
        double discountPrice;

        System.out.print("주유할 리터수를 입력하세요 : ");
        liter = keyboard.nextDouble();

        System.out.print("리러탕 가격을 입력하세요 : ");
        price = keyboard.nextDouble();

        result = liter * price;

        discount = (result >= 50000) ? result * 0.07 : 0.0;
        discountPrice = result - discount;

        tax =  discountPrice * 0.10;
        lastPrice = discountPrice + tax;

        System.out.printf("총 금액 : %.0f\n", result);
        System.out.printf("할인 금액 : %.0f원\n", discount);
        System.out.printf("부가세 : %.0f원\n", tax);
        System.out.printf("최종 결제 금액 : %.0f원\n", lastPrice);
    }
}