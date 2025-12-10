public class Compute {

    public float[] compute(String[][][] students, int[][][] score, float[][] ang) {

        float[] classAvg = new float[students.length];

        for (int c = 0; c < students.length; c++) {
            float sumClass = 0;

            for (int s = 0; s < students[c].length; s++) {
                int tot = 0;

                for (int k = 0; k < 4; k++) {
                    tot += score[c][s][k];
                }
                ang[c][s] = tot / 4f;
                sumClass += ang[c][s];
            }

            classAvg[c] = sumClass / students[c].length;
        }

        return classAvg;
    }
}
