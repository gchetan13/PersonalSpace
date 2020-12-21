package LRUCacheimplementation;

public class Queue {
	private Node front;
	private Node rear;

	public Queue() {
		front = null;
		rear = null;
	}

	public void enqueue(int num) {
		Node newEntry = new Node(num, null);
		if (front == null && rear == null) {
			front = newEntry;
			rear = front;
		} else
			rear.link = newEntry;
			rear = newEntry;
	}

	public void dequeue() {
		if(front==null && rear==null)
		{
			System.out.println("Ahhhh ! Queue is Empty, Cann't dequeue ");
		}
		if (front == rear){
			front = null;
			rear = null;
		}
		else{
			front = front.link;
		}
	}
	public Integer peek(){
		if(front!=null)
			return front.item;
		else 
			return null;
	}

	@Override
	public String toString() {
		Node temp = front;
		StringBuilder builder =  new StringBuilder();
		while (temp!=null){
			builder = builder.append(temp.item+" ");
			temp = temp.link;
		}
		return builder.toString();
	}
	
	

}
