public class bubbleSorter
{

    public static void bubble (int [] arr)
    {
        boolean unsorted = true;
        boolean hasChanged = true;
        int lastchage = arr.length;
        while (unsorted)
        {
            hasChanged = false;
            for (int i = 0; i < lastchage; i++)
            {
                if (arr[i]  > arr[i+1])
                {
                    sortingUtil.swap(arr,i,i+1);
                    lastchage = i;
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
