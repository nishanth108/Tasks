class Solution 
{
    public int removeDuplicate(int[] arr) {
        // [0,0,1,1,1,2,2,3,3,4]
         

        int lastUniqueIndex = 0;
        for(int i = 1; i < arr.length ; i++) {
            if (arr[lastUniqueIndex] != arr[i] )
            { 
                lastUniqueIndex +=1;
                arr[lastUniqueIndex] = arr[i];
                
            }
        }
        // [0,1,2,3,4,2,2,3,3,4]
        //          u         i


        //Time Complexity : O(n) -> the for loop used so n time it executes
        //Space Complexity : O(1)
        return lastUniqueIndex+1;
    }
}

public class RemDupliNumber {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {0,0,1,1,1,2};
        int a=s.removeDuplicate(arr);
        System.out.println(a);
    }
}