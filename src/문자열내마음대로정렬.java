import java.util.Arrays;

/*
문제 설명
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings	                n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
입출력 예 설명
입출력 예 1
"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.

입출력 예 2
"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다.
"abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 답은 ["abcd", "abce", "cdx"] 입니다.
버블정렬
 */
public class 문자열내마음대로정렬 {
    public String[] solution(String[] strings, int n) {

        return Arrays.stream(strings).sorted((s1, s2) ->
                {
                    if (s1.charAt(n) == s2.charAt(n)) {
                        return s1.compareTo(s2);
                    }
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
        ).toArray(String[]::new);
    }

//
//    public String[] solution(String[] strings, int n) {
//        for (int i = 0; i < strings.length - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < strings.length; j++) {
//                char char1 = strings[minIndex].charAt(n);
//                char char2 = strings[j].charAt(n);
//
//                if (char2 < char1 || (char2 == char1 && strings[j].compareTo(strings[minIndex]) < 0)) {
//                    minIndex = j;
//                }
//            }
//            if (minIndex != i) {
//                String temp = strings[i];
//                strings[i] = strings[minIndex];
//                strings[minIndex] = temp;
//            }
//        }
//        return strings;
//    }
}