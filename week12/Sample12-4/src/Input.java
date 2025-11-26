import java.util.Scanner;

public class Input {
    public static void readData(int[] data) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d번쨰 데이터 입력 : ", i + 1);
            data[i] = keyboard.nextInt();
        }


    }
}
