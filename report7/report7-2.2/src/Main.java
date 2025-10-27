import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    final int money = 10000;
    float discont = 0.0f;
    int age;
    double result;
    int time;

    System.out.print("관람 시간을 입력하세요 : ");
    time = keyboard.nextInt();
    System.out.print("나이를 입력하세요 : ");
    age = keyboard.nextInt();

    if (time >=6 && time < 10){
        discont += 0.2f;
        if (age >= 8 && age <= 18){
            discont += 0.3;
        } else if (age >= 65){
            discont += 0.4;
        }
    } else if (time >= 10 && time <=23){
        if (age >= 8 && age <= 18){
            discont += 0.3;
        }else if (age >= 65){
            discont += 0.4;
        }
    }
    result = money * (1 - discont);


        System.out.printf("기본 영화 관람 요금은 10,000원 입니다.\n");
        System.out.printf("총 금액은 %d 입니다.\n", (int)result);
    }
}