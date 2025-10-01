import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double radious = 0.0;
        double circlearea = 0.0;
        double squareside = 0.0;
        double squarearea = 0.0;
        double difference = 0.0;

        System.out.print("원의 반지름:");
        radious = keyboard.nextDouble();
        System.out.print("정사각형의 한 변의 길이:");
        squareside = keyboard.nextDouble();

        circlearea = Math.PI * radious * radious;
        squarearea = squareside * squareside;

        difference = squarearea - circlearea;

        System.out.printf("\n원의 면적: %.2f cm제곱\n", circlearea);
        System.out.printf("정사각형의 면적: %.2f cm제곱\n", squarearea);
        System.out.printf("구하는 면적: %.2f cm제곱\n", difference);
    }
}