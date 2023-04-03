package array;

public class new_array {
public static int LinearSearch(int numbers[],int key) {
	for(int i=0; i<numbers.length; i++) {
		if(numbers[i] == key) {
			return i;
		}
	}
	return -1;
}
	public static void main(String args[]) {
	int numbers[] = {12,16,78,80,48,43,67,49,12};
	int key = 455 ;
	
	int index= LinearSearch(numbers,key);
	if(index == -1) {
		System.out.println("NOT found");
	
	}else {
		System.out.print("Key is at index :-"+index);

	}
	}

}
