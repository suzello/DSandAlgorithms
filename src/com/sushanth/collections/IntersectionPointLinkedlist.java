package com.sushanth.collections;



import java.util.*;

	
		class Node
		    {
		        int data;
		        Node next;
		        Node(int d) {data = d; next = null; }
		    }
			
		class LinkedList_Intersection
		{
		    Node head = null;  
			Node tail = null;
		public void addToTheLast(Node node) 
		{
		  if (head == null) {
		   head = node;
		   tail = head;
		  } else {
		   //Node temp = head;
		   //while (temp.next != null)
		    //temp = temp.next;
		   //temp.next = node;
		   tail.next=node;
		   tail = node;
		  }
		}
		  /* Function to print linked list */
		    void printList()
		    {
		        Node temp = head;
		        while (temp != null)
		        {
		           System.out.print(temp.data+" ");
		           temp = temp.next;
		        }  
		        System.out.println();
		    }

		}
	class Intersect{
	// using trick 1	
	
	int intersectPoint(Node headA, Node headB) { 
		Node temp1 = headA;
		Node temp2 = headB;
	  
	  
	  // adding -ve nature to the elements of LL1 
		while(temp1 != null) { temp1.data
	  = 0 - temp1.data; temp1 = temp1.next; }

	// when you encounter a -ve number in LL2 return its +ve value 
		while(temp2 !=
	null)

	{
		if (temp2.data < 0) {
			return 0 - temp2.data;
		}
		temp2 = temp2.next;
	}

	// return -1 if no intersection found
	return-1;
	}
	 
	
	/*//using the lengths, the long method
	 * int getLength(Node head) { int count = 0;
	 * 
	 * while (head != null) { count++; head = head.next; }
	 * 
	 * return count; }
	 * 
	 * int intersectPoint(Node head1, Node head2) { int length1, length2;
	 * 
	 * length1 = getLength(head1); length2 = getLength(head2);
	 * 
	 * Node temp;
	 * 
	 * temp = head2;
	 * 
	 * int i, j;
	 * 
	 * for (i = 0; i < length1; i++) { for (j = 0; j < length2; j++) { if (head1 ==
	 * temp) { return temp.data; } temp = temp.next;
	 * 
	 * if (temp == null) { temp = head2; } }
	 * 
	 * head1 = head1.next; }
	 * 
	 * return -1; }
	 */	
	
    /* Driver program to test above functions */
   public static void main(String args[])
   {
      
        
       /* Constructed Linked List is 1->2->3->4->5->6->
          7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
        {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			LinkedList_Intersection llist1 = new LinkedList_Intersection();
		    LinkedList_Intersection llist2 = new LinkedList_Intersection();
			LinkedList_Intersection llist3 = new LinkedList_Intersection();
			
				int a1=sc.nextInt();
				Node head1= new Node(a1);
				Node tail1= head1;
				llist1.addToTheLast(head1);
				for (int i = 1; i < n1; i++) 
				{
					int a = sc.nextInt(); 
					llist1.addToTheLast(new Node(a));
				}
			
			
				int b1=sc.nextInt();
				Node head2 = new Node(b1);
				Node tail2 = head2;
				llist2.addToTheLast(head2);
				for (int i = 1; i < n2; i++) 
				{
					int b = sc.nextInt(); 
					llist2.addToTheLast(new Node(b));
				}
				
				int c1=sc.nextInt();
				Node head3= new Node(c1);
				Node tail3=head3;
				llist3.addToTheLast(head3);
				for (int i = 1; i < n3; i++) 
				{
					int c = sc.nextInt(); 
					llist3.addToTheLast(new Node(c));
				}
				
				if (tail1 != null)
				tail1.next = head3;
				if (tail2 != null)
				tail2.next = head3;
				
				Intersect obj = new Intersect();
				System.out.println(obj.intersectPoint(llist1.head, llist2.head));
			t--;			
        }
   }
}
