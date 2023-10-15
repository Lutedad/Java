package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I wanna go home";
        
        //문자열 변환
        System.out.println(s.replace('n', ','));
        System.out.println(s.substring(8));
        System.out.println(s.substring(s.indexOf("go")));
        System.out.println(s.substring(s.indexOf("wanna"), s.indexOf("home")));


        //공백 제거
        s = "      I love Java.";
        System.out.println(s.trim());

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
