public class Runner
{
    public static void main (String [] args)
    {

        int [] before = sortingUtil.randIntArr(100);
        sortingUtil.printArr(before);
        int [] after = bubbleSorter.bubble(before);
        sortingUtil.printArr(after);

        System.out.println("Before is sorted? " + sortingUtil.isSorted(before));
        System.out.println("After is sorted? " + sortingUtil.isSorted(after));
    }
}
