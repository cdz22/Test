package Test2;

import org.w3c.dom.NodeList;

public class work1 {
	 
		 
		    public ListNode deleteDuplicates(ListNode head) {
		        if(head==null||head.next==null){
		            return head;
		        }
		        ListNode newNode=new ListNode(head.val);
		        ListNode start=newNode;
		        ListNode current=head.next;
		        while(current!=null){
		            if(current.val!=start.val){
		                ListNode node=new ListNode(current.val);
		                start.next=node;
		                start=node;
		            }
		            current=current.next;
		        }
		        return newNode;
		    }
		
	public Node delete(Node head) {
		if(head==null) {
			return null;
		}
		if(head.getNext()==null) {
			return head;
		}
		Node newhead = new Node();
				
		while(head.getNext()!=null) {
			while(newhead.getNext()!=null) {
				if(head.getVal()==newhead.getNext().getNext().getVal()) {
					newhead.setNext(newhead.getNext().getNext().getNext());
				}else {
					newhead=newhead.getNext();
				}
			}
			head=head.getNext();
		}
		return null;
	}
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3= new ListNode(1);
		ListNode node4= new ListNode(3);
		ListNode node5= new ListNode(2);
		node1.next=(node2);
		node2.next=(node3);
		node3.next=(node4);
		node4.next=(node5);
		work1 work = new work1();
		work.deleteDuplicates(node1);
		while(node1.next!=null) {
			System.out.println(node1.val);
			node1=node1.next;
		}
	}
}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
       next = null;
    }
}
class Node{
	private int val;
	private Node next;
	
	public Node(){
		
	}
	
	public Node(int val){
		this.val = val;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	
}