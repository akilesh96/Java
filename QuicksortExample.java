public class QuicksortExample  
{
    private int[] numbers;
    private int number;

    public void sort(int[] values) 
    {
        if (values ==null || values.length==0)
        {
            return;
        }
        this.numbers = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = numbers[low + (high-low)/2];
        //System.out.println("\n"+low+" "+high+" "+pivot);
        while (i <= j) 
        {
            while (numbers[i] < pivot) 
                i++;
            while (numbers[j] > pivot) 
                j--;
            if (i <= j)
            {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }
    
	public static void main(String[] arg)
	{
		int arr[]={1,56,3,7,8,21};
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		QuicksortExample q=new QuicksortExample();
		q.sort(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}