import java.util.Random;

public class FindMax {
	
	private int [] array;
	
	public FindMax(int size){
		this.array = new int[size];
		randomValues(size);
	}
	
	private void randomValues(int size){
			
		Random values = new Random();
		
		for(int i=0; i<size ; i++){
				int randValue = values.nextInt(size*4);
				this.array[i]= randValue;
		}
	}
	
	public int findMaxValue(){
		
		int max = this.array[0];
		
		for(int i=1;i<this.array.length;i++){
			if(this.array[i]>max){
				max = this.array[i];
			}
		}
		return max;
		
	}
}
