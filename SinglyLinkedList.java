
public class SinglyLinkedList {
	
	private int index;
	private Node head;
	private Node tail;
	private int i = 0;
	private static String [] arrayNode;
	private static int size = 0;
	
	public SinglyLinkedList(){
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public void add(String value){
		if(size == 0 && head == null){
			head = new Node(value);
			tail = head;
			size++;
		}
		else if(size == 1){
			tail = new Node(value);
			head.setNextNode(tail);
			size++;
		}
		else {
			Node newNode = new Node(value);
			tail.setNextNode(newNode);
			tail = newNode;
			size++;
		}
	}
	
	public Node find(String searchValue){
		Node searchNode = head;
		
		while(searchNode != null) {
			if (searchNode.getValue().equals(searchValue)) {
				return searchNode;
			}
			searchNode = searchNode.getNext();
		}
		return null;
	}
	
	public void delete(Node node){
		Node prevNode = new Node();
		Node deleteNode = head;
		while(deleteNode != null){
				if(node.getValue().equals(deleteNode.getValue())){
				head = head.getNext();
				if(deleteNode.getValue().equals(tail.getValue()) && deleteNode.getNext() == null){
					tail = prevNode;	
					size--;
					break;
				}
				prevNode.setNextNode(deleteNode.getNext());
				deleteNode.setValue(null);
				deleteNode = null;
				size--;
				break;
				}
				prevNode = deleteNode;
				deleteNode = deleteNode.getNext();
			}
	}
	
	public Node getNode(String value){
		return find(value);
	}
	
	public String [] values(){
		arrayNode = new String [0];
	
	if(arrayNode.length == 0){
		arrayNode = new String [size];
		Node node = head;
		
		while(i < size){
			arrayNode[i] = node.getValue();
			node = node.getNext();
			i++;
		}
	}
		i = 0;
		return arrayNode;
		
	}
	
	public Node getHead(){
		return this.head;
	}
	
	public Node getTail(){
		return this.tail;
	}

	public int getSize() {
		return this.size;
	}

}
