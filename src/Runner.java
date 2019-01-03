public class Runner
{
    public static void main (String [] args)
    {

        int [] arr = sortingUtil.randIntArr(100);
        sortingUtil.printArr(arr);
        bubbleSorter.bubble(arr);
        sortingUtil.printArr(arr);
    }
}
