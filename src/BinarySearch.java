public class BinarySearch {
	
	private BubbleSort array;
	
	public BinarySearch(int size){
		this.array = new BubbleSort(size);
		this.array.bubbleSort(size);
	}

	public int binarySearch(int size,int value){
		
		int left , right , mid;
		left=0;
		right=size-1;
		
		while(left<=right){
			mid=(right-left)/2+left;
			if(this.array.getArray(mid)==value){
				return mid;
			}else if(value<this.array.getArray(mid)){
				right = mid-1;
			}else{
				left = mid+1;
			}	
		}
		return -1;
	}
}

