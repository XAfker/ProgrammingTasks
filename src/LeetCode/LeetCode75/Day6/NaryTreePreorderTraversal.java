package LeetCode.LeetCode75.Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryTreePreorderTraversal {
    public static void main(String[] args) {

    }

    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if(root==null) return output;

        Stack<Node> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty()){
            Node node = nodes.pop();
            output.add(node.val);
            if (node.children != null){
                for (int i = node.children.size() - 1; i >= 0 ; i--) {
                    nodes.push(node.children.get(i));
                }
            }
        }
        return output;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
