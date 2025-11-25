import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = new String[10][4];
        float[] num2 = new float[employees.length];
        int[][] water = new int[employees.length][3];
        int usage;

        int i = 0;
        while (i < employees.length){
            System.out.print("번호 : ");
            employees[i][0] = keyboard.nextLine();

            System.out.print("이름 : ");
            employees[i][1] = keyboard.nextLine();

            while (true) {
                System.out.print("구분 : ");
                employees[i][2] = keyboard.nextLine();

                if (employees[i][2].equals("가정용") ||
                        employees[i][2].equals("영업용") ||
                        employees[i][2].equals("공장용") ||
                        employees[i][2].equals("관공서") ||
                        employees[i][2].equals("군기관")) {
                    break;
                } else {
                    System.err.println("ERROR : 가정용, 영업용, 공장용, 관공서, 군기관 중 하나 입력!");
                }
            }
            System.out.print("사용량 : ");
            num2[i] = keyboard.nextFloat();
            keyboard.nextLine();

            num2[i] = Math.round(num2[i] * 10) / 10.0f;

            i++;
        }

        for (i = 0; i < employees.length; i++){
            usage = Math.round(num2[i]);

            if (employees[i][2].equals("가정용")){
                water[i][0] = usage * 40;
            } else if (employees[i][2].equals("영업용")) {
                water[i][0] = usage * 55;
            } else if (employees[i][2].equals("공장용")) {
                water[i][0] = usage * 80;
            } else if (employees[i][2].equals("관공서")) {
                water[i][0] = usage * 35;
            } else if (employees[i][2].equals("군기관")) {
                water[i][0] = usage * 20;
            }

            int base = 1200;

            int tempTax = (int)((base + water[i][0]) * 0.05);
            water[i][1] = (tempTax / 10) * 10;

            water[i][2] = base + water[i][0] + water[i][1];

            employees[i][3] = "일괄징수";
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("번호   이름    구분    사용량    사용금액   TAX     납부액      비고");
        System.out.println("---------------------------------------------------------");

        for (i = 0; i < employees.length; i++){
            System.out.printf("%-6s %-6s %-6s %7.1f %,10d %,7d %,10d   %s\n",
                    employees[i][0], employees[i][1], employees[i][2], num2[i],
                    water[i][0], water[i][1], water[i][2], employees[i][3]);
        }
    }
}
