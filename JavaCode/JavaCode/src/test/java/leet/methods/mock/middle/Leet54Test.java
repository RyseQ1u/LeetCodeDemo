package leet.methods.mock.middle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class Leet54Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[][] input1, int[] expected) {
        List<Integer> res = new Leet54().spiralOrder(input1);
        int[] arr1 = res.stream()
                .mapToInt(Integer::intValue) // 或 .mapToInt(i -> i)
                .toArray();
        Assertions.assertArrayEquals (expected,arr1 );
    }

    private static Stream<Arguments> provideTestCases() {
        int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int[] res = {1,2,3,6,9,8,7,4,5};
        return Stream.of(
                Arguments.of(arr,res  )
        );
    }
}