package ADT;

public class Queue<T>{
    Node lastNode = null;
    
    public void enqueue(T data){
        Node newNode = new Node(data);
          
        if(isEmpty()){
            lastNode = newNode;
            lastNode.next = newNode;
        }else{
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }
    
    public T dequeue(){
        T item = null;
        
        if(lastNode.next == lastNode){
            item = lastNode.data;
            lastNode = null;
        }else{
            Node firstNode = lastNode.next;
            lastNode.next = firstNode.next;
            item = firstNode.data;
        }
        return item;
    }
    
    public T peek(){
        T item = null;
        item = lastNode.next.data;
        
        return item;
    }
    
    public boolean isEmpty(){
        if(lastNode == null)
            return true;
        else
            return false;
    }
    
    public class Node{
        T data;
        Node next;
        
        public Node(T data){
            this.data = data;
        }
    }
}


