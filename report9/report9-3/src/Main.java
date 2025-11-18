//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int depth = 300;
        int up = 55;
        int down = 13;
        int day = 0;
        int height = 0;

        while (height < depth) {
            day++;
            height += up;

            if (height >= depth) {
                System.out.printf("달팽이는 %d일 만에 은달방울꽃이 시들기 전에 정상에 도착했습니다. \n", day);
                break;
            } else
                height = height - down;
        }
    }
}