class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int slargest=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=slargest)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
