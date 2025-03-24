package methods.linklist.easy;

import leet.Daily.easy.Leet2255;
import leet._class.linklist.ListNode;
import leet.methods.linklist.easy.Leet206;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet2255Test {

    // 方式 2：使用 MethodSource 传递复杂参数
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLeet2255WithMethodSource(String[] words, String s, int expected) {
        int res = new Leet2255().countPrefixes(words,s);
        Assertions.assertEquals(expected, res);
    }

    // 参数生成方法（必须为 static）
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"a","b","c","ab","bc","abc"},"abc",3),
                Arguments.of(new String[]{"a","a"},"aa",2),
                Arguments.of(new String[]{"feh","w","w","lwd","c","s","vk","zwlv","n","w","sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs","br","w","rypg","wh","g","w","w","fh","w","w","sccy"},"w",14)

        );
    }

}