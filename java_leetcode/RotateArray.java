
class ArrayRotate {
    public void rotate(int arr[]) {

        
        //Caling method

        // after only we have to reverse upto k

        // then we have to reverse the rest thing to get the proper output
        for(int i=0;i<arr.length-1;i++) {
            System.out.println(arr[i]);
        }
        

    }
    // private int[] reverse(int arr[]) {
    //     int i =0;
    //     int temp ;
    //     int j =arr.length-1;
    //     while(i<j) {
    //         temp =arr[i];
    //         arr[i] =arr[j];
    //         arr[j] =temp;
    //         i++;
    //         j--;
    //     }
    //     return arr;
    // }

  
}
public class RotateArray {

	public static void main(String[] args) {
		
	        int arr[] ={1,2,3,4,5,6,7};
	        ArrayRotate a = new ArrayRotate();
	        a.rotate(arr);
	    
	}

}
