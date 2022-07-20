package Recursion_in_Arraylists;
import java.util.*;;

public class p1_get_subsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> ansArrayList = getSubsequence(s);
        System.out.println(ansArrayList);
    }

    public static ArrayList<String> getSubsequence(String s){
        if(s.length() == 1){
            ArrayList<String> ansArrayList = new ArrayList<>();
            ansArrayList.add("");
            ansArrayList.add(s);
            return ansArrayList;
        }
        char ch = s.charAt(0);
        ArrayList<String> returnedArrayList = getSubsequence(s.substring(1));
        ArrayList<String> ansArrayList = new ArrayList<>();
        for(int i=0; i<returnedArrayList.size(); i++){
            ansArrayList.add("" + returnedArrayList.get(i));
        }
        for(int i=0; i<returnedArrayList.size(); i++){
            ansArrayList.add(ch + returnedArrayList.get(i));
        }
        return ansArrayList;
    }
}
