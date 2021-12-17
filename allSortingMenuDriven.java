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
	
    static void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
  
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        int i = 0, j = 0;
  
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int[] arr, int l, int r){
       System.out.println("\n\t\t\tWorst case Time Complexity: nlog(n)\n");
       System.out.println("Sorted array after applying Merge Sort ---- :");
	if (l < r) {
            int m =l+ (r-l)/2;
  
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
  
            merge(arr, l, m, r);
        }
    }
	
    static void display(int[] arr){
        for(int element: arr){
            System.out.print(element + " ");
        }
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
		    case 1: bubbleSort(arr); display(arr); break;
		    case 2: selectionSort(arr); display(arr); break;
            	    case 3: quickSort(arr); display(arr); break;
            	    case 4: mergeSort(arr,0, arr.length - 1); display(arr); break;
		    default: System.out.println("Enter a valid option");
		}
	}
}
