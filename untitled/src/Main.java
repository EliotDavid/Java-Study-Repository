public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!"); // System 패키지 안에 들어있는 out이라는 모델 안에 있는 println
        System.out.println("Hello World~!");
        System.out.println("Hello World~!");
        System.out.println("홍길동"); // sout이라고 치고 엔터치면 이 코드가 자동완성 됨;

        int v1 = 1;
        String v2 = "홍길동";
        char v3 = 'a';

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        // Intelli J에서도 주석 쓰는 방법은 이클립스와 같음
        // 주석은 컴퓨터가 인식하지 못하는 영역임

        /*
        이 주석은 여러줄의 영역을 인식하지 못하게 해야할 경우에 사용
        자바스크립트 주석과 비슷함 */


        int b = 10;

        System.out.println(v1 + b);

        int c = v1 + b;
        System.out.println(c);

    }
}















