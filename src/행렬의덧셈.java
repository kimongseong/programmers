/*
https://school.programmers.co.kr/learn/courses/30/lessons/12950
문제 설명
행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아,
행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 */
public class 행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        int length1 = arr1.length;
        int length2 = arr1[0].length;
        int[][] answer = new int[length1][length2];

        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length1; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
