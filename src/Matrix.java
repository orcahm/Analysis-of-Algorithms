import java.util.Random;

class Matrix {
	
	private int [][] matrix;
	
	public Matrix(int setSize){
		
		matrix = new int[setSize][setSize];
		randomValues(setSize);
	}
	
	private void randomValues(int size){
		
		Random values = new Random();
		
		for(int i=0; i<size ; i++){
			for(int j=0; j<size ; j++){
				int randValue = values.nextInt(size*4);
				this.matrix[i][j]= randValue;
			}
		}
	}
	
	public void multiplicatio(Matrix m1,Matrix m2,int size){
		
		for(int i=0; i<size ; i++){
			for(int j=0; j<size ; j++){
				this.matrix[i][j] = 0 ;
					for(int k=0; k<size ; k++){
						this.matrix[i][j] += (m1.matrix[i][k]*m2.matrix[k][j]);
					}
			}
		}
	}	
}

