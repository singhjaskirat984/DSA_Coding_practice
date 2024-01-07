import java.util.*;

public class generic_tree_traversals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numRows = scn.nextInt();

        generic_tree_traversals gen = new generic_tree_traversals();

        List<List<Integer>> res = gen.generate(numRows);

        System.out.println(res);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++) {
            if(i==0) {
                List<Integer> first = new ArrayList<>();
                first.add(1);
                res.add(first);
            }else if(i==1) {
                List<Integer> second = new ArrayList<>();
                second.add(1);
                second.add(1);
                res.add(second);
            }else{
                List<Integer> prev = res.get(i-1);
                List<Integer> newElement = new ArrayList<>();

                for(int j=0; j<=i;  j++) {
                    if(j==0) {
                        newElement.add(1);
                    }else if(j==i) {
                        newElement.add(1);
                    }else {
                        newElement.add(prev.get(j) + prev.get(j-1));
                    }
                }
                res.add(newElement);
            }
        }

        return res;
    }
}
