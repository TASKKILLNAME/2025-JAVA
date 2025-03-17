package week2;

public class DataType {
    public static void main(String[] args) {
        System.out.println("byte byte size = "+Byte.SIZE/ 8);
        System.out.println("char byte size = "+Character.SIZE/ 8);
        System.out.println("short byte size = "+Short.SIZE/ 8);
        System.out.println("int byte size = "+Integer.SIZE/ 8);
        System.out.println("float byte size = "+Float.SIZE/ 8);
        System.out.println("long byte size = "+Long.SIZE/ 8);
        System.out.println("double byte size = "+Double.SIZE/ 8);

        /* 그러나 long, int (정수형) 자료형보다 float, double (실수형) 자료형이
        * 수를 표현할 수 있는 범위가 더 크다 */

    }
}
