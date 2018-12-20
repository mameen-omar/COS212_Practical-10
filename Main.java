public class Main {
    public static void main(String[] args)
    {
		Mergesort<Integer> sort = new Mergesort<Integer>();

		Integer sArray1[] = {6, 1, 3, 2, 8, 5, 9, 7, 4};
		sort.mergeSort(sArray1);
		System.out.println(sort.toString());
	}
	/*
	[1, 6, 3, 2, 8, 5, 9, 7, 4]
	[1, 3, 6, 2, 8, 5, 9, 7, 4]
	[1, 3, 6, 2, 8, 5, 9, 7, 4]
	[1, 2, 3, 6, 8, 5, 9, 7, 4]
	[1, 2, 3, 6, 8, 5, 9, 7, 4]
	[1, 2, 3, 6, 8, 5, 9, 4, 7]
	[1, 2, 3, 6, 8, 4, 5, 7, 9]
	[1, 2, 3, 4, 5, 6, 7, 8, 9]
	*/
}
