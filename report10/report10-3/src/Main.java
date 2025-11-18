import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int NUM_STUDENTS = 10;


        String[] names = new String[NUM_STUDENTS];
        int[] report = new int[NUM_STUDENTS];
        int[] Finaltest = new int[NUM_STUDENTS];
        int[] Midtest = new int[NUM_STUDENTS];
        int[] schoollist = new int[NUM_STUDENTS];
        int[] quiz = new int[NUM_STUDENTS];


        final double W_MID = 0.15;
        final double W_FINAL = 0.15;
        final double W_QUIZ = 0.10;
        final double W_REPORT = 0.40;
        final double W_ATTENDANCE = 0.20;
        final int NUM_SCORES = 5;


        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.println("\n--- [" + (i + 1) + "번째 학생 정보 입력] ---");

            System.out.print("이름을 입력하세요: ");
            names[i] = keyboard.next();

            System.out.print("중간고사 점수(100점 만점): ");
            Midtest[i] = keyboard.nextInt();

            System.out.print("기말고사 점수(100점 만점): ");
            Finaltest[i] = keyboard.nextInt();

            System.out.print("퀴즈 점수(100점 만점): ");
            quiz[i] = keyboard.nextInt();

            System.out.print("과제/레포트 점수(100점 만점): ");
            report[i] = keyboard.nextInt();

            System.out.print("출석 점수(100점 만점): ");
            schoollist[i] = keyboard.nextInt();
        }

        System.out.println("| 순번 | 이름   | 중간(15%) | 기말(15%) | 퀴즈(10%) | 과제(40%) | 출석(20%) | 단순 평균 | 가중치 평균 |");

        for (int i = 0; i < NUM_STUDENTS; i++) {

            int totalSum = Finaltest[i] + Midtest[i] + quiz[i] + report[i] + schoollist[i];
            double simpleAverage = (double) totalSum / NUM_SCORES;


            double weightedAverage = (Finaltest[i] * W_MID) +
                    (Midtest[i] * W_FINAL) +
                    (quiz[i] * W_QUIZ) +
                    (report[i] * W_REPORT) +
                    (schoollist[i] * W_ATTENDANCE);

            System.out.printf("| %-4d | %-4s | %-9d | %-9d | %-9d | %-9d | %-9d | %-9.2f | %-11.2f |\n",
                    (i + 1), names[i], Finaltest[i], Midtest[i], quiz[i], report[i], schoollist[i],
                    simpleAverage, weightedAverage);
        }

    }
}

