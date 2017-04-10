import java.util.Random;

public class BubbleSort {
	
	private int [] array;
	
	public BubbleSort(int size){
		this.array = new int[size];
		randomValues(size);
	}
	
	public int getArray(int index){
		return array[index];
	}
	
	private void randomValues(int size){
			
		Random values = new Random();
		
		for(int i=0; i<size ; i++){
				int randValue = values.nextInt(size*4);
				this.array[i]= randValue;
		}
	}
		
	public void  bubbleSort(int size){
		
		int swaps;
		
		for(int i=0; i<size ; i++){
			swaps=0;
			for(int j=0; j<size-1 ; j++){
				if(this.array[j]>this.array[j+1]){
					this.swap(j);
					swaps += 1;
				}
			}
			if(swaps==0){
				break;
			}
		}

	}
		
	private void swap(int j){
		
		int temp;
		
		temp = this.array[j];
		this.array[j]=this.array[j+1];
		this.array[j+1]=temp;
		
	}
}
