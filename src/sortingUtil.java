public class sortingUtil
{
    public static int[] randIntArr(int count)
    {
        int [] out = new int [count];
        for (int i = 0; i < count; i++)
        {
            out[i] = (int)(Math.random()*count + 1);
        }
        return out;
    }



    public static void swap (int [] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr [j] = temp;
    }

    public static void printArr(int [] arr)
    {
        String out = "";
        for (int i = 0; i < arr.length; i++ )
        {
            out = out + "[" + arr[i] + "], ";
        }
        System.out.println(out);
    }


}
