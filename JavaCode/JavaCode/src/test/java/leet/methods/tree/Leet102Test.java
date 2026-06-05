package leet.methods.tree;

import leet._class.Tree.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Leet102Test {
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void maximumTripletValue(TreeNode root, ArrayList<ArrayList<Integer>> expected) {
        List<List<Integer>> res = new Leet102().levelOrder(root);
        Assertions.assertEquals (expected, res);
    }

    private static Stream<Arguments> provideTestCases() {
        //test1
        TreeNode node1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        // 填充数据
        list1.add(new ArrayList<>(Arrays.asList(3)));
        list1.add(new ArrayList<>(Arrays.asList(9, 20)));
        list1.add(new ArrayList<>(Arrays.asList(15, 7)));

        //test2
        TreeNode node2 = new TreeNode(1);
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        // 填充数据
        list2.add(new ArrayList<>(Arrays.asList(1)));
        
        return Stream.of(
//                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12, 3},9,4),
                Arguments.of(node1, list1),
                Arguments.of(node2, list2)
        );
    }
}