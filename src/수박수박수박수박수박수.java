import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12922/
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
 */
public class 수박수박수박수박수박수 {
    public String solution(int n) {

        String result = "";

       for (int i = 1; i <= n; i++) {

           if (i % 2 == 1) {
               result += "수";
           } else {
               result += "박";
           }
       }
       return result;
    }


// IntStream활용  return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? "수":"박").collect(Collectors.joining());


//for문 없이
// String pattern = "수박";
//        // 패턴을 길이 n에 맞게 반복하고 잘라서 반환
//        return pattern.repeat((n + 1) / 2).substring(0, n);
}
