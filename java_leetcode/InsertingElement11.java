import java.util.Hashtable;
import java.util.ArrayList;

class Inserting {
    /**
     * @param num1
     * @param num2
     * @return
     */
    public int[] insert(int[] num1,int[] num2) {

        Hashtable<Integer , Integer> nums1Map = new Hashtable<>();
        ArrayList<Integer> IntersectionAL =new ArrayList<>();
        for(int i = 0 ; i < num1.length; i++) {


            //If the number repeats same we will increment its count
            if(nums1Map.containsKey(num1[i])) {
                nums1Map.put(num1[i],nums1Map.get(num1[i])+1);
            } 
            else {
                nums1Map.put(num1[i],1);
            }
        }

        //If it exist add the element into the array list ans substract the frequency in the hashtable
        //Iterate through num2 ,at each iteration ,check if the current element is exist in the hash table


        for(int i = 0 ; i < num2.length; i++) {
            if(nums1Map.containsKey(num2[i])) {
                IntersectionAL.add(num2[i]);
                nums1Map.put(num2[i], nums1Map.get(num2[i])-1);
                if (nums1Map.get(num2[i] )== 0) {
                    nums1Map.remove(num2[i]);
                }
            }
        }

        int result[] = new int[IntersectionAL.size()];
        // iterate through the Arraylist till the end and using get method assign the valur to the result array
        for(int i = 0 ; i < result.length ; i++) {
            result[i] = IntersectionAL.get(i);
        }

        //Define an array with the size of the arraList

        return result;

    }
}


public class InsertingElement11 {
    public static void main(String args[]) {
        int arr1[] = {4,9,5,4};
        int arr2[] = {9,4,8,9,4};
        Inserting in = new Inserting();
        int[] a =in.insert(arr1,arr2);
        for(int i = 0 ; i < a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
