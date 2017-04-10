import java.util.ArrayList;
import java.util.Random;

public class MergeSort {

	private ArrayList<Integer> array;
	
	public MergeSort(){
		array = new ArrayList<Integer>();
	}

	public MergeSort(int size){
		array = new ArrayList<Integer>();
		randomArrayList(size);
	}
	
	public void randomArrayList(int size){
		
		Random values = new Random();
		
		for(int i=0; i<size ; i++){
			int randValue = values.nextInt(size*4);
			this.array.add(randValue);
		}
	}
	
	public void mergeSort(){
		
		int mid = this.array.size()/2;
		if(this.array.size() == 1){
			return ;
		}
		MergeSort ar1 = new MergeSort();
		for(int i = 0 ; i<mid ; i++){
			ar1.array.add(this.array.get(i));
		}
		MergeSort ar2 = new MergeSort();
		for(int j = mid; j<this.array.size() ; j++){
			ar2.array.add( this.array.get(j));

		}	
		ar1.mergeSort();
		ar2.mergeSort();
		this.merge(ar1, ar2);
	}

	public  void merge(MergeSort ar1, MergeSort ar2){
		
		int index=0;
		
		while(ar1.array.size() !=0 && ar2.array.size() !=0){
			if(ar1.array.get(0)>ar2.array.get(0)){
				this.array.remove(index);
				this.array.add(index++,ar2.array.get(0));
				ar2.array.remove(0);
			}else{
				this.array.remove(index);
				this.array.add(index++,ar1.array.get(0));
				ar1.array.remove(0);
			}
		}
		while(ar1.array.size() !=0){
			this.array.remove(index);
			this.array.add(index++,ar1.array.get(0));
			ar1.array.remove(0);
		}
		while(ar2.array.size() !=0){
			this.array.remove(index);
			this.array.add(index++,ar2.array.get(0));
			ar2.array.remove(0);
		}
		
	}

}
