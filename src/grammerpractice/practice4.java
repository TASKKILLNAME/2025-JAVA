package grammerpractice;

/*
    산술 연산을 정확하게 계산하고 싶다면  (실수타입 x, 정수타입 o)
*/
public class practice4 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.print("사과 1개에서 남은 양: " + result/10.0);
    }
}
