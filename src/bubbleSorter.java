public class bubbleSorter
{

    public static void bubble (int [] arr)
    {
        boolean unsorted = true;
        boolean hasChanged;
        while (unsorted)
        {
            hasChanged = false;
            for (int i = 0; i < arr.length -1;i++)
            {
                if (arr[i] > arr[i+1])
                {
                    sortingUtil.swap(arr,i,i+1);
                    hasChanged = true;
                }
            }
            if (!hasChanged)
            {
                unsorted = false;
            }
        }
    }


}
