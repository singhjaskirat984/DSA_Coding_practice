import java.util.*;

public class p4_replace_with_sum_of_larger_in_bst {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node constructBST(int[] arr, int lo, int hi) {
        if(lo>hi) {
            return null;
        }

        int mid = (lo+hi)/2;

        Node left = constructBST(arr, lo, mid-1);
        Node right = constructBST(arr, mid+1, hi);

        Node myNode = new Node(arr[mid], left, right);

        return myNode;
    }

    public static void display(Node node) {
        if(node==null) {
            return;
        }

        String left = node.left==null ? "." : node.left.data + "";
        String right = node.right==null ? "." : node.right.data + "";

        String str = left + " <- " + node.data + " -> " + right;

        System.out.println(str);

        display(node.left);
        display(node.right);
    }


    static int sum = 0;
    public static void replaceWithSumOfLargerInBST(Node node) {
        if(node==null) {
            return;
        }

        replaceWithSumOfLargerInBST(node.right);

        // In Order
        int od = node.data;
        node.data = sum;
        sum += od;

        replaceWithSumOfLargerInBST(node.left);
    }

    public static void main(String[] args) {
        // sorted array
        int[] arr = {12, 25, 37, 50, 62, 75, 87};

        Node root = constructBST(arr, 0, arr.length-1);

        display(root);

        replaceWithSumOfLargerInBST(root);

        display(root);

    }
}
