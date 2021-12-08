import java.util.Scanner;

public class allSortingMenuDriven
{
    static void bubbleSort(int[] arr){
        int len = arr.length - 1;
        System.out.println("\n\t\t\tWorst case Time Complexity: O(n*n)\n");
        System.out.println("Sorted array after applying Bubble Sort ---- :");
    }
    
    static void selectionSort(int[] arr){
        int len = arr.length - 1;
        System.out.println("\n\t\t\tWorst case Time Complexity: O(n*n)\n");
        System.out.println("Sorted array after applying Selection Sort ---- :");
    }
  
    static void quickSort(int[] arr){
        int len = arr.length - 1;
        System.out.println("\n\t\t\tWorst case Time Complexity: O(n*n)\n");
        System.out.println("Sorted array after applying Quick Sort ---- :");
    }
  
    static void mergeSort(int[] arr){
       int len = arr.length - 1;
       System.out.println("\n\t\t\tWorst case Time Complexity: nlog(n)\n");
       System.out.println("Sorted array after applying Merge Sort ---- :");
    }
  
    
	public static void main(String[] args) {
		int[] arr = {1,2,13,4,15,7,8};
		Scanner in = new Scanner(System.in);
    
		System.out.println("Press 1 for Bubble Sort");
		System.out.println("Press 2 for Selection Sort");
		System.out.println("Press 3 for Quick Sort");
		System.out.println("Press 4 for Merge Sort");
		int choice = in.nextInt();
    
		switch(choice){
		    case 1: bubbleSort(arr); break;
		    case 2: selectionSort(arr); break;
        case 3: quickSort(arr); break;
        case 4: mergeSort(arr); break;
		    default: System.out.println("Enter a valid option");
		}
	}
}
