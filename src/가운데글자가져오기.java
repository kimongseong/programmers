/*
https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=java/
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class 가운데글자가져오기 {
    public String solution(String s) {
        int mid = s.length() / 2;
        return  s.length() % 2 == 0 ? s.substring(mid-1, mid + 1) : s.substring(mid, mid+1);
    }
}