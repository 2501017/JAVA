//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
    float purchase = 1015000f;
    float rate = 0.3f;
    float tax = 0.1f;
    float firstprice;
    float saletax;
    float purchasetax;
    float paytax;

    firstprice = purchase * (1 + rate);
    saletax = firstprice * tax;
    purchasetax = purchase * tax;
    paytax = saletax - purchasetax;

        System.out.printf("정가 :%,.0f원\n", firstprice);
        System.out.printf("매출 세액 :%,.0f원\n", saletax);
        System.out.printf("매입 세액 : %,.0f원\n",purchasetax);
        System.out.printf("납부 세액(낼 세금액) :%,.0f\n",paytax);
    }
}