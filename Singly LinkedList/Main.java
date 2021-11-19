
public class Main
{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtFirst(5);
		list.insertAtFirst(4);
		list.insertAtFirst(2);
		
		list.insertAtBack(58);
		list.insertAtBack(59);
		
		list.remove_first();
			
		list.display();
	}
}
