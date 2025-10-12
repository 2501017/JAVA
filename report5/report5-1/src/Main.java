import java.util.Scanner; //TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch;
        char convert;
        String result;

        System.out.print("영문자를 입력하세요. : ");
        ch = keyboard.next().charAt(0);

        convert = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ?
                (char)(ch ^ 32) : ch;

        result = (ch >= 'A' && ch <= 'Z') ?
                String.format("입력한문자 %c는 대문자이고, 소문자로 변경하면 %c 입니다.", ch, convert) :
                (ch >= 'a' && ch <= 'z') ?
                        String.format("입력한문자 %c는 소문자이고, 대문자로 변경하면 %c 입니다.", ch, convert) :
                        "영문자가 아닙니다.";
        System.out.println(result);
    }
}