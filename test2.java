package project1;

import java.util.LinkedList;

public class test {

	public static node head=null;
		public static class node{
			
			int data;
			node next;
			node prev;
			node(int x)
			{
			data=x;
			next=null;	
			prev=null;
			}
		}
		 public static void push(node head_ref, int d){
			 
			 node temp = new node(d);
			 temp.prev=null;
			 temp.next=head;
			 if ((head) != null){
			 head.prev=temp;
			 }
			 head=temp;   
		 }
		 public static void reverse(){
			
			 node temp=head;
			 if(temp.next==null) //empty list
				 return;
			 while(temp!=null){  //traversing whole list
				 temp=temp.next;
			 }
			 
			 System.out.println("reverse list is");
			 while(temp!=null){    // reverse list
				 System.out.println(temp.data);
				 temp=temp.prev;
			 } 
		 }
	
		public static void print(){
			
			node temp=head;
			System.out.println("forward list is:");
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
		public static void main(String args[])
		{
			 LinkedList list = new LinkedList();
			 list.push(head, 2);print();
		        list.push(head, 4);print();reverse();
		        list.push(head, 8);print();reverse();
		        list.push(head, 10);print();reverse();
		
		
		}
}
