import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] candidate = new int[4];
        int invalid = 0;

        System.out.print("총 투표자 수를 입력하세요: ");
        int voters = sc.nextInt();

        System.out.println("투표해주세요 (1~4 중 번호 입력):");

        for (int i = 0; i < voters; i++) {
            System.out.print((i + 1) + "번째 투표: ");
            int vote = sc.nextInt();

            if (vote >= 1 && vote <= 4) {
                candidate[vote - 1]++;
            } else {
                invalid++;
            }
        }

        System.out.println("\n===== 투표 결과 =====");
        System.out.println("총 투표자 수: " + voters);
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 후보 득표수: " + candidate[i]);
        }
        System.out.println("무효표 수: " + invalid);

    }
}
