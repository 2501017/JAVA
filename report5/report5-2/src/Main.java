import java.util.Scanner;
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int score;
        String grade = "";

        char A = 65;
        char B = 66;
        char C = 67;
        char D = 68;
        char F = 70;

        System.out.print("JAVA 점수 입력 : ");
        score = keyboard.nextInt();

        grade = (score < 0 || score > 100) ? "없습니다." :
                (score >= 95 && score <= 100) ? A + "+" :
                        (score >= 90 && score <= 94)  ? A + "0" :
                                (score >= 85 && score <= 89)  ? B + "+" :
                                        (score >= 80 && score <= 84)  ? B + "0" :
                                                (score >= 75 && score <= 79)  ? C + "+" :
                                                        (score >= 70 && score <= 74)  ? C + "0" :
                                                                (score >= 65 && score <= 69)  ? D + "+" :
                                                                        (score >= 60 && score <= 64)  ? D + "0" : F + "";
        System.out.printf("입력 점수 : %d\n", score);
        System.out.printf("학점 : %s\n", grade);
    }
}