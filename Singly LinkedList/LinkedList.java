public class LinkedList{
    
    private Node head;
    private Node tail;
    private int size;
    
    public LinkedList(){
        this.size = 0;
    }
    
    //  function to add nodes 
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
        if(index == size){
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
    
    
     //  function to remove nodes 
     public void remove_first(){
        head = head.next;
         size--;
      }
    public void remove_back(){
        Node temp = head;
        int i = 0;
        while( i < size-2){
            temp = temp.next;
            i++;
        }
        size--;
        temp.next = null;
    }
    public void removeFrom(int index){
        if(index == 0){
            remove_first();
            return;
        }
        if(index == size-1){
            remove_back();
            return;
        }
        Node temp = head;
        for (int i=1; i<index; i++){
            temp = temp.next;
        } 
        temp.next = temp.next.next;
    }
    //function to display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
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
