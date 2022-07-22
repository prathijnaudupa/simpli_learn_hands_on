public class Long {
    static int max_ref; 
   
    static int _lis(int arr[], int n)
    {
        
        if (n == 1)
            return 1;
 
        int res, maxx = 1;
 
        for (int i = 1; i < n; i++) {
            res = _lis(arr, i);
            if (arr[i - 1] < arr[n - 1] && res + 1 > maxx)
                maxx = res + 1;
        }
 
        if (max_ref < maxx)
            max_ref = maxx;
 
        return maxx;
    }
 
    static int lis(int arr[], int n)
    {
      
        max_ref = 1;
 
        _lis(arr, n);
 
        return max_ref;
    }
 
    public static void main(String args[])
    {
        int arr[] = { 2,5,3,6,7,1,8,9,5 };
        int n = arr.length;
        System.out.println("Length of Longest Increasing Substring "
                           + lis(arr, n) + "\n");
    }
}
