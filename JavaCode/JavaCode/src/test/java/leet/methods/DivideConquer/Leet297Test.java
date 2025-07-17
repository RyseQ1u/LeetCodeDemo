package leet.methods.DivideConquer;

import leet._class.Tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Leet297Test {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(int[] preorder, int[] inorder, TreeNode expected) {
         new Leet297().test1();
        Assertions.assertEquals (1, 1);
    }

    private static Stream<Arguments> provideTestCases() {
        //test1
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        return Stream.of(
                Arguments.of(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7},node1)
        );
    }
}