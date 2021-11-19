public class LinkedList{
    
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList(){
        this.size = 0;
    }
    
    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertAtBack(int value){
        if(tail == null){
           insertAtFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        if(index == length){
            insertAtBack(value);
            return;
        }
        
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
            
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
    private class Node{
        
       private int value;
       private Node next;
        
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    
}
