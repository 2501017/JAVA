import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final int NIGHT_START = 22;
        final int NIGHT_END = 5;
        final float NIGHT_RATE = 0.20f;

        int age;
        int time;
        boolean hasCard;
        int baseFare;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        System.out.print("교통카드 사용 여부 (true/false): ");
        hasCard = keyboard.nextBoolean();
        System.out.print("탑승 시간 (0~23시)을 입력하세요: ");
        time = keyboard.nextInt();

        baseFare = (age >= 19) ? (hasCard ? 1250 : 1350) :
                (age >= 13) ? (hasCard ? 750 : 850) :
                        450;

        boolean isNight = (time >= NIGHT_START) || (time < NIGHT_END);

        float finalFare = isNight ? baseFare * (1 + NIGHT_RATE) : baseFare;

        System.out.printf("\n--- 요금 계산 결과 ---\n");
        System.out.printf("기본 요금: %,d 원\n", baseFare);
        System.out.printf("심야 할증 여부: %s\n", isNight ? "적용" : "미적용");
        System.out.printf("총 지불 요금: %,.0f 원\n", finalFare);

        keyboard.close();
    }
}