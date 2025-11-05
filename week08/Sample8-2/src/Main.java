import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float engel;
        int foodlife;
        int spend;
        int save;
        String result;

        System.out.print("지출액을 입력하세요. : ");
        spend = keyboard.nextInt();
        System.out.print("저축액을 입력하세요. : ");
        save = keyboard.nextInt();

        foodlife = spend - save;
        engel =  (float) (foodlife / spend * 100);

        if (engel >=0 && engel <= 30){
            result = "상류";
        }else if (engel >= 31 && engel <= 50){
            result = "중산";
        }else  if (engel >=51){
            result = "하류";
        }else {
            result="측정 불가";
        }
        System.out.printf("엥겔 지수 판정에 따라 당신은 %s층 입니다.", result);
    }
}