import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a;
        int b;
        int c;
        int max, mid, min;

        System.out.print("첫 번째 정수 입력 : ");
        a = keyboard.nextInt();
        System.out.print("두 번쨰 정수 입력 : ");
        b = keyboard.nextInt();
        System.out.print("세 번쨰 정수 입력 : ");
        c = keyboard.nextInt();

        if (a > b && a > c){
            max = a;
            if (b > c){
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b > a && b > c){
            max = b;
            if (a > c){
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            max = c;
            if (a > b){
                mid= a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }


        System.out.printf("입력 받은 %d, %d, %d 를 크기순으로 나열하면 %d, %d, %d 입니다.\n", a, b, c, min, mid, max);
    }
}