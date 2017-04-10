import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input =	new Scanner(System.in);
		int size , operation, value;
		Random randValeu = new Random();
		
		do{
		System.out.println("1-Matrix multiplicatio");
		System.out.println("2-Finding maximum element");
		System.out.println("3-Bubble sort algorith");
		System.out.println("4-Merge sort algorith");
		System.out.println("5-Binary search algorith");
		System.out.println("6-Exit\n");
		System.out.print("İşletmek istediğiniz algoritmayı seçin: ");
		
		operation = input.nextInt();
		
		switch(operation){
		 	case 1:
		 		System.out.print("What is the size of matrix: ");
		 		size = input.nextInt();
		 		double totaltime1 = 0;
				for(int i = 0; i<10;i++){
			 		Matrix mainMatrix1 = new Matrix(size);
			 		Matrix mainMatrix2 = new Matrix(size);
					Matrix totalMatrix = new Matrix(size);
					long startTime1 = System.nanoTime();
					totalMatrix.multiplicatio(mainMatrix1, mainMatrix2, size);
			 	   	long estimatedTime1 = (System.nanoTime()- startTime1);
			 	   	totaltime1 += estimatedTime1;
				}
				System.out.println(totaltime1/10000000 + "\n");
		 	   	break;
		 	case 2:
		 		System.out.print("What is the size of array: ");
		 		size = input.nextInt();
		 		double totaltime2 = 0;
				for(int i = 0; i<100000;i++){
			 		FindMax findArray = new FindMax(size);
			 		long startTime2 = System.nanoTime();
			 		findArray.findMaxValue();
			 		long estimatedTime2 = (System.nanoTime()- startTime2);
			 		totaltime2 += estimatedTime2;
				}
				BigDecimal result=new BigDecimal(totaltime2/100000000000.0 + "\n");
				System.out.println(result);
		 		break;
		 	case 3:
		 		System.out.print("What is the size of array: ");
		 		size = input.nextInt();
		 		double totaltime3 = 0;
				for(int i = 0; i<10;i++){
			 		BubbleSort bubbleArray = new BubbleSort(size);
			 		long startTime3 = System.nanoTime();
			 		bubbleArray.bubbleSort(size);
			 		long estimatedTime3 = (System.nanoTime()- startTime3);
			 		totaltime3 += estimatedTime3;
				}
				System.out.println(totaltime3/10000000 + "\n");
		 		break;
		 	case 4:
		 		System.out.print("What is the size of array: ");
		 		size = input.nextInt();
		 		double totaltime4 = 0;
				for(int i = 0; i<10;i++){
			 		MergeSort mergeArray = new MergeSort(size);
			 		long startTime4 = System.nanoTime();
				 	mergeArray.mergeSort();
				 	long estimatedTime4 = (System.nanoTime()- startTime4);
			 		totaltime4 += estimatedTime4;
				}
				System.out.println(totaltime4/10000000 + "\n");
		         break;
		 	case 5:
		 		System.out.print("What is the size of array: ");
		 		size = input.nextInt();
		 		value = randValeu.nextInt(size*4);
		 		double totaltime5 = 0;
				for(int i = 0; i<10;i++){
			 		BinarySearch binaryArray = new BinarySearch(size);
			 		long startTime5 = System.nanoTime();
				 		binaryArray.binarySearch(size, value);
			 		long estimatedTime5 = (System.nanoTime()- startTime5);
			 		totaltime5 += estimatedTime5;
				}
				System.out.println(totaltime5/10000000 + "\n");
		 		break;
		}	
	
	}while(operation != 6);
	}
}
