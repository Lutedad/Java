package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "HELLO WORLD";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("HELLO"));
        //위치정보
        System.out.println(s.indexOf("HELLO"));
        //포함되지 않는 경우
        System.out.println(s.indexOf("Asdfasdf")); // -1
        //단어가 겹칠경우 마지막으로 일치하는 위치 정보
        System.out.println(s.lastIndexOf("L"));
        //특정 문자열로 시작하는지 불리안값
        System.out.println(s.startsWith("H")); //True
        //특정 문자열로 끝나는지 불리안값
        System.out.println(s.endsWith("D")); //True

    }
}
