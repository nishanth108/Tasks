import java.util.Hashtable;

class Sum {
    public int[] twoSum(int[] arr,int target) {
        
        Hashtable<Integer,Integer> num = new Hashtable<>();
        for(int i = 0;i < arr.length; i++) {
            if(num.containsKey(target-arr[i]))
            {
                return new int[] {num.get(target-arr[i]),i};
            }
            num.put(arr[i],i);
        }
        return null;   
    }
}
class TwoSum {
    public static void main(String args[]) {
        int []arr = {1,3,4,5};
        int target = 9;
        Sum s = new Sum();
        int res[] = s.twoSum(arr,target);   
        for(int i=0; i<res.length;i++)
            System.out.println(res[i]+"");   
    }

}