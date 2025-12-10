import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][][] students = {
                {{"2101234","홍길동","남"}, {"2101235","경복대","여"},
                        {"2101236","한국인","남"}, {"2101345","정상인","여"}},

                {{"2301345","구자철","남"}, {"2301435","이가을","여"},
                        {"2301443","김광현","남"},{"2301678","박종철","남"},
                        {"2301679","올시즌","여"}},

                {{"2401234","한민국","여"}, {"2401456","안우진","남"},
                        {"2401789","이대한","남"}}
        };

        int[][][] score = new int[students.length][][];
        float[][] ang = new float[students.length][];

        Scanner keyboard = new Scanner(System.in);
        Input in = new Input();
        Compute cp = new Compute();
        Output out = new Output();

        for(int i=0;i<students.length;i++){
            score[i] = new int[students[i].length][4];
            ang[i] = new float[students[i].length];
        }

        in.inputScore(students, score, keyboard);

        float[] classAvg = cp.compute(students, score, ang);

        out.printResult(students, score, ang, classAvg);
    }
}


