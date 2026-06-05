package methods.linklist.easy;

import leet.Daily.easy.Leet2716;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet2716Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet2716WithMethodSource(String input1, int expected) {
        int res = new Leet2716().minimizedStringLength(input1);
        Assertions.assertEquals (expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("aaabc",3),
                Arguments.of("cbbd",3),
                Arguments.of("baadccab",4)


        );
    }

}