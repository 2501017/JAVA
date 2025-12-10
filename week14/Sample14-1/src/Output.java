public class Output {

    public void printResult(String[][][] students, int[][][] score,
                            float[][] ang, float[] classAvg) {

        float totalAvg = 0;

        for (int c = 0; c < students.length; c++) {
            System.out.println("\n\n*** " + (c+1) + "반 성적표 ***");
            System.out.println("*******************************************************************");
            System.out.println("학번        이름    국어 영어 수학 선택 총점  평균 반석차 학년석차 기타");
            System.out.println("*******************************************************************");

            for (int s = 0; s < students[c].length; s++) {
                int tot = score[c][s][0] + score[c][s][1] + score[c][s][2] + score[c][s][3];

                String extra = (ang[c][s] < classAvg[c]) ? "반평균 미만" : "";

                System.out.printf("%s  %s  %3d %4d %4d %4d %4d  %6.2f   %2d   %2d   %s\n",
                        students[c][s][0],
                        students[c][s][1],
                        score[c][s][0], score[c][s][1], score[c][s][2], score[c][s][3],
                        tot, ang[c][s],
                        (s+1), (s+2), extra
                );
            }

            System.out.printf("%d반 전체 평균: %.2f\n", (c+1), classAvg[c]);
            totalAvg += classAvg[c];
        }

        System.out.printf("\n학년 전체 평균: %.2f\n", totalAvg / students.length);
    }
}

