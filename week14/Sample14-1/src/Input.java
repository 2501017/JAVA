import java.util.Scanner;

public class Input {

    public void inputScore(String[][][] students, int[][][] score, Scanner sc) {

        for (int c = 0; c < students.length; c++) {
            System.out.println("\n*** " + (c+1) + "반 성적 입력 ***");

            for (int s = 0; s < students[c].length; s++) {

                String name = students[c][s][1];
                String gender = students[c][s][2];

                String[] subject = {"국어", "영어", "수학"};

                for (int i = 0; i < 3; i++) {
                    score[c][s][i] = getScoreInput(sc,
                            (c+1) + "반 학생 " + name + "의 " + subject[i] + " 점수 입력: ");
                }
                String opt = gender.equals("남") ? "기술" : "가정";

                score[c][s][3] = getScoreInput(sc,
                        (c+1) + "반 학생 " + name + "의 " + opt + " 점수 입력: ");

                System.out.println();
            }
        }
    }

    private int getScoreInput(Scanner sc, String msg) {
        int num;

        while (true) {
            System.out.print(msg);
            num = sc.nextInt();

            if (num >= 0 && num <= 100)
                return num;

            System.out.println("ERROR : 점수는 0에서 100 사이어야 합니다. 다시 입력하세요.\n");
        }
    }
}
