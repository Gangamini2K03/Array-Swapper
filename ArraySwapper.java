import  java.util.Arrays;

public class ArraySwapper{
	static Integer[] array = {5,2,4,6,1,3};
	static int outerIndex;
	
	public static void swap(int i,int j){
		int temp = array[j];
		array[i] = array[j];
		array[j] = temp;
	}
	public static void insert(int endIndex){
		int i = endIndex;
		while(i>0 && array[i]< array[i-1]){
			swap(i,i-1);
			System.out.println("i:" + i+"j:"+(i-1)+","+"Array state:"+ Arrays.toString(array));
			i--;
		}
	}
	public static void insertionSort (){
		for(outerIndex = 1;outerIndex<array.length;outerIndex++){
			insert(outerIndex);
		}
	}
	public static void main(String[]args){
		System.out.println("Array Before Sorting:"+Arrays.toString(array));;
		insertionSort();
		System.out.println("Array after sorting:"+Arrays.toString(array));
	}
}
		
