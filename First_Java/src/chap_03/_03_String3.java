package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1.equals(s2)); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s1.equals("Java"));
        //대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        //문자열 비교 심화
        //벽에 붙은 메모지의 비밀번호 정보 (참조)
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //(내용)
        System.out.println(s1 == s2); // (참조)

        //내용은 같지만, 서로 다른 메모리에 있는 정보이기에 == 사용시 false가 나온다.
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
