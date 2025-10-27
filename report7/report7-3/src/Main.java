import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    int ko, math, en;
    float avg;
    String score =" ";
    String result = " ";

    System.out.print("국어 점수를 입력하세요 : ");
    ko = keyboard.nextInt();
    System.out.print("영어 점수를 입력하세요 : ");
    en = keyboard.nextInt();
    System.out.print("수학 점수를 입력하세요 : ");
    math = keyboard.nextInt();

    avg = (float) ((ko + en + math) / 3);
    if (avg >= 80){
        result = "성적 양호";
        score = "B학점";
    }else if (avg >= 60){
        result ="노력";
        score = "C학점";
    }else if (avg < 60){
        result = "성적 불량";
        score = "F학점";
    }
        System.out.printf("국어,영어,수학 점수는? %d %d %d\n",ko, en, math);
        System.out.printf("======================================\n");
        System.out.printf("국어 영어 수학 평균 학점 결과\n");
        System.out.printf("%d %d %d %.2f %s %s\n", ko, en, math, avg, score, result);
    }
}