import java.util.*;

public class p1_size_of_generic_tree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static int size(Node node){
        int sum = 0;
        sum++;
        if(node.children.size()==0){
            return sum;
        }
        
        for(Node child: node.children){
            sum += size(child);
        }
        
        return sum;
    }
    
    // accidentally found the solution for counting of leaf nodes
    // public static int size(Node node){
    //     if(node.children.size()==0){
    //         return 1;
    //     }

    //     int sum = 0;
    //     for(Node child: node.children){
    //         sum += size(child);
    //     }
        
    //     return sum;
    // }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};

        Node root = null;
        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==-1){
                st.pop();
            }else{
                Node t = new Node();
                t.data = arr[i];

                if(st.size()>0){
                    st.peek().children.add(t);
                }else{
                    root = t;
                }
                st.push(t);
            }
        }
        int ans = size(root);
        System.out.println(ans);
    }
}
