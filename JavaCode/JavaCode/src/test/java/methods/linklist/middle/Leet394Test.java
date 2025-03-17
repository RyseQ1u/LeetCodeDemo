package methods.linklist.middle;

import leet.methods.stackAndqueue.middle.Leet394;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet394Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet394WithMethodSource(String input1, String expected) {
        String res = new Leet394().decodeString(input1);
        Assertions.assertEquals (expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(
                        "3[a]2[bc]",
                        "aaabcbc"),
                Arguments.of(
                        "3[a2[c]]",
                        "accaccacc"),
                Arguments.of(
                        "2[abc]3[cd]ef",
                        "abcabccdcdcdef")

        );
    }

}