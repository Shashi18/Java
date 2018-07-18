public class Main{
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append(4);
		
		System.out.println(l.toString());
		l.insertAt(2, 10);
		System.out.println(l.toString());
		l.deleteAt(2);
		System.out.println(l.toString());
		
	}
	public static class Node{
		public Integer data;
		public Node next;
		public Node prev;
		public Node(Integer data){
			this.data = data;
			next = null;
			prev = null;
		}
	}
public static class LinkedList{
	private Node header;
	private Node lastNode;
	private int size = 0;
	
	
	public LinkedList(){
	    header = new Node(null);
	    lastNode = header;
	}
	
	public void prepend(Integer data){
		Node n = new Node(data);
		
		if (size == 0){
			header.next = n;
			lastNode = n;
			n.prev = header;
			size++;
		}
		else{
			Node temp = header.next;
			header.next = n;
			n.next = temp;
			temp.prev = n;
			size++;
		}
	}
	public void append(Integer data){
	    Node n = new Node(data);
	    if(size==0){
	        header.next = n;
	        lastNode = n;
	        n.prev = header;
	        size++;
	    }
	    else{
	        lastNode.next = n;
	        n.prev = lastnode;
	        lastNode = n;
	        size++;
	    }
	}
	
	public void removeFirst(){
	    if(size != 0){
	        header.next = header.next.next;
	        size--;
	    }
	    else{
	        System.out.println("LinkedList size is already Zero");
	    }

	}
	public void removeLast(){
	    if(size != 0){
    	    Node current = header;
    	    Node n1 = current.next;
    	    Node n2 = new Node(null);
    	    while(n1 != null){
    	        n2 = current;
    	        current = n1;
    	        n1 = current.next;
    	    }
    	   n2.next = null;
    	   size--;
	    }
	    else
	        System.out.println("LinkedList size is already Zero");
	}
	
	public int getSize(){
		return size;
	}
	
	public String toString(){
		Node n = header.next;
		String temp = "";
		while(n != null){
			temp = temp + n.data + "  ";
			n = n.next;
		}
		return temp;
	}
	public void insertAt(int index, Integer data){
	    int dex = 0;
	    Node n = new Node(data);
	    Node temp = header.next;
	    while(temp != null){
	        dex++;
	        if(index == dex){
	            n.next = temp.next;
	            temp.next = n;
	            n.prev = temp;
	            size++;
	            break;
	        }
	        temp = temp.next;
	        temp.prev = n;
	    }
	}
	
	public void deleteAt(int index){
	    int dex = 0;
	    Node temp = header.next;
	    while(temp != null){
	        dex++;
	        if(index == dex){
	            Node temp2 = temp.next.next;
	            temp.next = temp2;
	            temp2.prev = temp;
	            size--;
	            break;
	        }
	        temp = temp.next;
	        
	    }
	}
}
}