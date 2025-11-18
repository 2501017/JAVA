//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int chicken = 0;

        do {
            int dog = 37 - chicken;
            if (2 * chicken + 4 * dog == 102) {
                System.out.printf("닭은 %d마리, 개는 %d마리입니다.\n", chicken, dog);
            }
            chicken++;
        } while (chicken <= 37);

    }
}