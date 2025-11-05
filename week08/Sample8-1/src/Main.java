import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    int age;
    String money;

    System.out.print("나이를 입력하세요. : ");
    age = keyboard.nextInt();

    if (age >= 18){
        money = "4000원";
    }else if (age >= 13 && age < 18){
        money ="3000원";
    }else if (age >= 7 && age < 13){
        money ="1000원";
    }else {
        money = "무료";
    }
    System.out.printf("입장료는 %s입니다." ,money);
    }
}