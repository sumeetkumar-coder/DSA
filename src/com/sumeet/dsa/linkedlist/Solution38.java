package com.sumeet.dsa.linkedlist;

public class Solution38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insert_node(1,100);
		insert_node(2,200);
		insert_node(3,300);
		insert_node(4,400);
		insert_node(5,500);
		insert_node(6,600);
		insert_node(7,700);
		
		print_ll();
		insert_node(2,2000);
		
		delete_node(5);
		
		print_ll();

	}
	
	static Node head = null;
	   static int size = 0;

	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }

	    }

	    public static void insert_node(int position, int value) {
	        // @params position, integer
	        // @params value, integer
	        if (position-1 > size) {
	            return;
	        }
	        Node node = new Node(value);

	        if (position == 1) {
	            head = node;
	            

	        } else {
	            int count = 1;
	            Node temp = head;
	            while (count < position-1) {
	                temp = temp.next;
	                count++;
	            }
	            System.out.println(temp.data);
	            node.next = temp.next;
	            temp.next = node;
	            
	        }
	        size++;
	    }

	    public static void delete_node(int position) {
	        // @params position, integer
	         Node temp = head;
	         
	         if (position > size) {
	            return;
	        }

	       for (int i=2; i<position; i++) {
	          
	           temp = temp.next;
	       }
	       if (position == 1) {
	           head = temp.next;
	       }
	       Node n = temp.next.next;
	       temp.next = n;
	       size--;

	       
	    }

	    public static void print_ll() {
	        // Output each element followed by a space
	        Node temp = head;

	        StringBuilder sb = new StringBuilder();
	        while (temp != null) {
	            
	            sb.append(temp.data);
	            sb.append(" ");
	            temp = temp.next;
	        }
	        String s = sb.toString().trim();
	        
	        System.out.println(s);
	        
	    }

}
