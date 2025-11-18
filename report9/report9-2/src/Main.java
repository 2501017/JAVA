//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int save1 = 10;
        int save2= 10;
        int month;
        int amount;


        month = (500 * save1) + (100 * save2);
        amount = month * 12 * 30;

        System.out.printf("30년 동안 저금된 총 금액은 %d원입니다.\n", amount);

    }
}