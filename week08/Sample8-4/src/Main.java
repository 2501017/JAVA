import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int radius;
        final float PI = 3.141592f;
        float volume;
        float surface;

        System.out.print("구의 반지름을 입력하세요. : ");
        radius = keyboard.nextInt();

        volume = (float) ((4.0/3.0) * PI * radius * radius * radius);
        surface = (float) ((4 * PI * radius * radius));

        System.out.printf("구의 부피는 %.2f 입니다.\n",volume);
        System.out.printf("구의 표면적은 %.2f 입니다.",surface);
    }
}