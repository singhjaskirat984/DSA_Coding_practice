package Recursion_in_Arraylists;
import java.util.*;

public class p2_getKpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> ansArrayList = getKpc(s);
        System.out.println(ansArrayList);
    }

    public static String[] arr = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKpc(String str){
        // if(str.length() == 1){
            // ArrayList<String> ansArrayList = new ArrayList<>();
            // String stringRetrievedFromArr = arr[Integer.parseInt(str)];
            // for(int i=0; i<stringRetrievedFromArr.length(); i++){
            //     ansArrayList.add(stringRetrievedFromArr.charAt(i) + "");
            // }
            // return ansArrayList;
        // }

        // base case alternate and better
        if(str.length() == 0){
            ArrayList<String> ansArrayList = new ArrayList<>();
            ansArrayList.add("");
            return ansArrayList;
        }

        String stringRetrievedFromArr = arr[Integer.parseInt(str.substring(0, 1))];
        ArrayList<String> returnedArrayList = getKpc(str.substring(1));
        ArrayList<String> ansArrayList = new ArrayList<>();
        for(int i=0; i<stringRetrievedFromArr.length(); i++){
            for(int j=0; j<returnedArrayList.size(); j++){
                ansArrayList.add(stringRetrievedFromArr.charAt(i) + returnedArrayList.get(j));
            }
        }

        return ansArrayList;
    }
}
