import java.util.stream.IntStream;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/77884
문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000
 */
public class 약수의개수와덧셈 {
        public int solution(int left, int right) {
            return IntStream.rangeClosed(left, right)
                    .map(num -> {
                        int sqrt = (int) Math.sqrt(num);
                        long count = IntStream.rangeClosed(1, sqrt)
                                .filter(i -> num % i == 0)
                                .flatMap(i -> i * i == num ? IntStream.of(i) : IntStream.of(i, num / i))
                                .count();
                        return count % 2 == 0 ? num : -num;
                    })
                    .sum();
        }
    }

