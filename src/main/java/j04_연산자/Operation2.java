package j04_연산자;

/* //논리연산자
*
* True(1), False(0)
*
* AND && -> 곱   True X True -> True, True X False = False, False X False = False 하나라도 거짓이면 거짓
*OR || (Shift + \) -> 합 True + True = True, True + False = True, False + False = False 하나라도 참이면 참
*NOT ! -> 부정
*/
public class Operation2 {
    public static void main(String[] args) {
    boolean flag1 = true;
    boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println("T x T =>" + result1);

        boolean result2 = flag1 && flag2;
        System.out.println("T x F =>" + result2);

        boolean result3 = flag2 && flag2;
        System.out.println("F x F =>" + result3);

        System.out.println(); //줄 바꿈 때문에 이렇게 표기

        boolean result4 = flag1 || flag1;
        System.out.println("T x T =>" + result4);

        boolean result5 = flag1 || flag2;
        System.out.println("T x F =>" + result5);

        boolean result6 = flag2 || flag2;
        System.out.println("F x F =>" + result6);

        System.out.println();

        boolean result7 = flag1 || flag2 && flag1;
        System.out.println("T + F x T =>" + result7); // 결과는  true  곱셈이기 때문에  true임

        boolean result8 = flag1 || flag2 && flag1;
        System.out.println("T + F x T =>" + !result8);

        boolean result9 = 10 % 3 != 0;
        System.out.println("10 % 3 !=0 =>" + result9);


        int year = 2022;
        boolean result10 = year % 2 == 0 && year % 300 != 0 || year % 100 == 0;
        System.out.println(result10);
    }
}
