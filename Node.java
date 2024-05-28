package p;

public class Node<T> {
	private T data;
    private Node<T> next;

    Node(T data) {
        this(data,null);
   }
    Node(T d, Node<T> n) {
        this.data = d;
        this.next = n;
  
   }
   public T getData() {return this.data;}
   public Node<T> getnext() {return this.next;}
   public void setData(T data) {this.data=data;}
   public void setNext1 (Node<T> n) {this.next=n;}
   
   public String toString(){
	return null;}
}
    