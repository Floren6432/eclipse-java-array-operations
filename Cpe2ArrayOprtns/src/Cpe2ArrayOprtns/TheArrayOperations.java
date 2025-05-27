package Cpe2ArrayOprtns;
import java.util.Scanner;

public class TheArrayOperations {
	public static int[] myArray() {
		int[] takeArray;
		int size=0;
		Scanner elements = new Scanner(System.in);
		int i;
		
		System.out.print("Enter number of elements for the array (Greater than 5): ");
		size = elements.nextInt();
		takeArray = new int[size];
		
		System.out.println("Enter "+size+" numbers for the Array:");
		for(i=0;i<size;i++) {
			takeArray[i]=elements.nextInt();
			System.out.println("Number Stored!");
		}
		
		return takeArray;
	}
	static void displayArray(int[] takeArray) {
		int i;
		System.out.print("Your Array: ");
		for(i=0;i<takeArray.length;i++) {
			System.out.print("Arr["+i+"] = "+takeArray[i]);
			if(i<takeArray.length-1) {
				System.out.print(", ");
			}
			
		}
	}
	 static void displayMenu() {
		System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		System.out.println("Array Operations:");
		System.out.println("1.] Traverse");
		System.out.println("2.] Insert");
		System.out.println("3.] Delete");
		System.out.println("4.] Search");
		System.out.println("5.] Update");
		System.out.println();
		
		System.out.print("Please select an operation: ");
		
	}
	static void traverseArray(int[] takeArray) {
		int i;
		System.out.print("Your Array: ");
		for(i=0;i<takeArray.length;i++) {
			System.out.print("Arr["+i+"] = "+takeArray[i]);
			if(i<takeArray.length-1) {
				System.out.print(", ");
			}
		}
	}
	 static void insertionArray(int[] takeArray) {
		int i,x,pos,n=0;
		System.out.print("Enter a number to be contained in an array: ");
		Scanner numOfArray = new Scanner(System.in);
		x = numOfArray.nextInt();
		
		System.out.println();
		System.out.print("From what position do you want to put the number in?(Array length is currently "+takeArray.length+") ");
		Scanner indexPosition = new Scanner(System.in);
		pos = indexPosition.nextInt();
		
		n++;
	    for(i=n;i>=pos;i--){
	    	takeArray[i]=takeArray[i-1];
	    }
	    takeArray[pos-1]=x;
	    
	    System.out.println("Your Array after insertion: ");
		for(i=0;i<takeArray.length;i++) {
			System.out.print("Arr["+i+"] = "+takeArray[i]);
			if(i<takeArray.length-1) {
				System.out.print(", ");
			}
		}
	}
	static void deletionArray(int[] takeArray) {
		int k=30, n=5;
		int i,j;
		j=k;
		
		while(j<n) {
			takeArray[j-1] = takeArray[j];
			j=j+1;
		}
		n=n-1;
		
		System.out.println("Your Array after deletion: ");
		for(i=0;i<takeArray.length;i++) {
			System.out.print("Arr["+i+"] = "+takeArray[i]);
			if(i<takeArray.length-1) {
				System.out.print(", ");
			}
		}
			
	}
	static void searchArray(int[] takeArray) {
		int item=0,j=0;
		
		System.out.print("Enter an element to be searched: ");
		Scanner elementItem = new Scanner(System.in);
		item = elementItem.nextInt();
		
		while(j<5) {
			if(takeArray[j]==item) {
				break;
			}
			j=j+1;
		}
		System.out.printf("Element %d is found at %d position",item,j+1);
	}
	static void updationArray(int[] takeArray) {
		int i,item=50,pos=3;
		
		Scanner positionForNum = new Scanner(System.in);
		System.out.print("Enter the position number you want to update: ");
		pos = positionForNum.nextInt();
		
		System.out.println();
		System.out.print("Enter the number that you want to put in that position: ");
		Scanner updatedNum = new Scanner(System.in);
		item = updatedNum.nextInt();
		
		takeArray[pos-1]=item;
		System.out.printf("\nElements after updation:\n");
		
		for(i=0;i<takeArray.length;i++) {
			System.out.print("Arr["+i+"] = "+takeArray[i]);
			if(i<takeArray.length-1) {
				System.out.print(", ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] getArray = {};
		getArray = myArray();
		displayArray(getArray);
		
		displayMenu();
		Scanner operation = new Scanner(System.in);
		int choice = operation.nextInt();
		
		
		
		switch(choice) {
		case 1:
			traverseArray(getArray);
			break;
		case 2:
			insertionArray(getArray);
			break;
		case 3:
			deletionArray(getArray);
			break;
		case 4:
			searchArray(getArray);
			break;
		case 5:
			updationArray(getArray);
			break;
		default:
			System.out.println("Invalid input!");
			break;
		}
		
	}

}
