
public class Node {
	
	private String value;
	private Node prev;
	private Node next;
	
	public Node(){
		
	}
	
	public Node(String value, Node prev, Node next){
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	public Node(String value, Node next){
		this.value = value;
		this.next = next;
	}
	
	public Node(String value){
		this.value = value;
	}
	
	
	public String getValue(){
		return this.value;
	}
	
	public void setValue(String value){
		this.value = value;
	}
	
	public Node getPrev(){
		return prev;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNextNode(Node nextNode){
		next = nextNode;
	}
	
	public void setPrevNode(Node prevNode){
		prev = prevNode;
	}

}
