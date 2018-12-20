
import java.util.*;
//Mohamed Ameen Omar - u16055323
public class Mergesort<T extends Comparable<? super T>> {

    public Queue<String> queue = new LinkedList<String>();// To collect output from swap method
    private Comparable[] temp;

    //DO NOT MODIFY
    public Mergesort() {
    }

    //DO NOT MODIFY
    /**
     * Enqueues the array step by step output.
     */
    private void collectOutput(T[] data) {
        queue.add(Arrays.toString(data)); //store output for printing out array at each merge step
    }

    //DO NOT MODIFY
    /**
     * Prints out the output list from the queue.
     */
    @Override
    public String toString() {
        ArrayList<String> list = new ArrayList<String>(queue);
        String out = "";
        for (int i = 0; i < list.size(); i++) {


            out += list.get(i) + "\n";
        }
        return out;
    }

    //------------------------------------------------------------------------------------

    /**
    * TODO:Mergesort method.
    */
    public void mergeSort(T[] data)
    {
        //IMPLEMENT HERE
        temp = data.clone();
        mergeSort(data,0,data.length-1);

    }

    public void mergeSort(T[] data,int first,int last)
    {
        //IMPLEMENT HERE

        if(first<last)
        {
            int middle = (first+last)/2;
            mergeSort(data,first,middle);
            mergeSort(data,middle+1,last);
            merge(data, first,last);
        }
    }
    /**
     * TODO:Merge method.
     */
    private void merge(T[] data, int first, int last)
	{
        //IMPLEMENT HERE

		int middle = (first+last)/2;
        int temp1 = first;
        int temp2 = first;
        int temp3 = middle+1;

        for (int count = first; count <= last; count++)
        {
            temp[count] = data[count];
        }


        while(temp2 <= middle && temp3 <= last)
        {
            if(temp[temp2].compareTo(temp[temp3]) <= 0)
            {
                data[temp1++] = (T) temp[temp2++];
            }

            else
            {
               data[temp1++] = (T)temp[temp3++];
            }
        }

        while(temp2 <= middle)
        {
            data[temp1++] = (T)temp[temp2++];
        }

        if(Arrays.toString(data).equals(""))
        {
            return;
        }
        //DO NOT MODIFY. Implement merge method above this code.
        collectOutput(data); //store output for printing out array at each merge step

    }
}
