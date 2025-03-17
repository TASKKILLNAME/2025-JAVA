package grammerpractice;
 /*
 ++피연산자 / 피연산자 ++ && --피연산자 / 피연산자-- 연습
  */
public class practice2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int result1 = ++a + 10;
        int result2 = b++ + 10; // b + 10을 먼저 한 후에 b에 +1. 따라서 result2에 11이라는 값이 저장된 후에 b는 2가됨.

        System.out.println(result1);
        System.out.println(result2);

        System.out.println("---------------");

        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("---------------");

        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("---------------");

        z = x++; // (z = x) 먼저 한 후에 ++ 따라서 z를 출력 하면 기존값 12가 나옴, 이후 x값엔 13출력
        System.out.println("z=" + z); 
        System.out.println("x=" + x); // (x값 13)

        System.out.println("---------------");

        z = ++x + y++; // 14 + 8 , z = 22, x = 14, y = 9
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
