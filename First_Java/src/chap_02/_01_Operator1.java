package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //Operators
        // + - * / % 
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 / 2);
        System.out.println(4 * 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);

        //Priority 
        System.out.println(2+2*2);
        System.out.println((2+2)*2);

        //using variables
        int a = 20;
        int b = 40;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);


        // 증감연산 ++ , --

        int val;
        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(++val);
        // ++val VS val++ 는 다르다
        System.out.println(val);
        System.out.println(val--);
        System.out.println(--val);

        //example
        
        int waiting = 0;
        System.out.println("대기인원: "+ waiting++);
        System.out.println("대기인원: "+ waiting++);
        System.out.println("대기인원: "+ waiting++);

    }
}
