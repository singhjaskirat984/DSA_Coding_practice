import java.util.*;

public class p13_merge_overlapping_intervals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr){
        Pair[] p = new Pair[arr.length];
        for(int i=0; i<arr.length; i++){
            p[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(p);
        Stack<Pair> st = new Stack<>();
        for(int i=0; i<p.length; i++){
            if(i==0){
                st.push(p[i]);
            }else{
                Pair top = st.peek();
                if(p[i].st>top.et){
                    st.push(p[i]);
                }else{
                    top.et = Math.max(top.et, p[i].et);
                }
            }
        }

        Stack<Pair> rs = new Stack<>();
        while(st.size()>0){
            rs.push(st.peek());
        }

        while(rs.size()>0){
            Pair pair = rs.pop();
            System.out.println(pair.st + " " + pair.et);
        }

    }

    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        public int compareTo(Pair other){
            if(this.st!=other.st){
                // return +ve or -ve according to start property of object
                return this.st-other.st;
            }else{
                // return +ve pr -ve from end according to end property of object 
                return this.et-other.et;
            }
        }
    }
}
