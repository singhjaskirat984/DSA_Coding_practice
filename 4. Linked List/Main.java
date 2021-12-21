import java.util.*;
import java.io.*;

public class Main{
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if(size==0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        void printList(LinkedList list)
        {
            Node currNode = list.head;
        
            System.out.print("LinkedList: ");
        
            // Traverse through the LinkedList
            while (currNode != null) {
                // Print the data at current node
                System.out.print(currNode.data + " ");
        
                // Go to next node
                currNode = currNode.next;
            }
        }
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<n; i++){
            list.addLast(i);
        }

        list.printList(list);
    }
}