package coding.huffman;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HoffmanCoding {

    private PriorityQueue<HoffmanNode> priorityQueue = new PriorityQueue<>(
        Comparator.comparingInt(n -> n.frequency));
    private Map<Character, String> charCodeMap = new HashMap<>();

    // 计算每个字符的频率，放到优先队列中
    private void initQueue(String text) {
        text.chars().mapToObj(x -> (char)x)
            .collect(Collectors.groupingBy(
                Function.identity(), Collectors.summingInt(c -> 1)))
            .forEach((c, feq) -> priorityQueue.add(HoffmanNode.ofLeaf(c, feq)));
    }

    public HoffmanCoding(String text) {
        initQueue(text);
    }

    // 根据优先队列生成二叉树
    private HoffmanNode generate() {
        while (priorityQueue.size() > 1) {
            HoffmanNode node1 = priorityQueue.poll();
            HoffmanNode node2 = priorityQueue.poll();
            HoffmanNode node = HoffmanNode.ofNode(node1, node2);
            priorityQueue.add(node);
        }

        return priorityQueue.poll();
    }

    private void apply(String currentCode, HoffmanNode root) {
        if (root.isLeaf()) {
            charCodeMap.put(root.aChar, currentCode);
            return;
        }
        HoffmanNode leftNode = root.left;
        HoffmanNode rightNode = root.right;
        apply(currentCode + "0", leftNode);
        apply(currentCode + "1", rightNode);
    }

    public Map<Character, String> apply() {
        apply("", generate());
        return charCodeMap;
    }

    static class HoffmanNode {
        private HoffmanNode left;
        private HoffmanNode right;
        private int frequency;
        private char aChar;

        boolean isLeaf() {
            return left == null && right == null;
        }

        private HoffmanNode(char c, int frequency) {
            this.aChar = c;
            this.frequency = frequency;
        }

        private HoffmanNode(HoffmanNode left, HoffmanNode right) {
            this.left = left;
            this.right = right;
            this.frequency = left.frequency + right.frequency;
        }

        static HoffmanNode ofLeaf(char c, int frequency) {
            return new HoffmanNode(c, frequency);
        }

        static HoffmanNode ofNode(HoffmanNode left, HoffmanNode right) {
            return new HoffmanNode(left, right);
        }
    }

    public static void main(String[] args) {
        String text = "baacccddddfffff";
        HoffmanCoding hoffmanCoding = new HoffmanCoding(text);
        System.out.println(hoffmanCoding.apply());

    }

}
