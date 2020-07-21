package am.tech42.datastructure.array;


public class Array <T> {
	private int arraySize;
	private T [] array;
	private int elementCount;
	
	@SuppressWarnings("unchecked") // because we can put only value of T type 
	public Array(int arraySize) {
		this.arraySize = arraySize;
		array = (T[]) new Object [arraySize];
		elementCount = 0;
	}
	
	public int length() {
		return arraySize;
	}
	
	public void add( T value) {
		array[elementCount ++] =value;
	}
	
	public  T  get(int index) {
		if (index < 0 || index > arraySize-1) {
			throw new IllegalArgumentException( " index mast be O =<  or < " + arraySize );
		}
		return array[index];
	}
	
	public T  remove(int index) {
		if (index < 0 || index > arraySize-1) {
			throw new IllegalArgumentException( " index mast be O =<  or < " + arraySize );
		}
		T temp =  array[index];
		while (index < elementCount) {
			array[index] = array[index+1];
			index++;
		}
		elementCount--;
		return temp ;
	}
	
}
