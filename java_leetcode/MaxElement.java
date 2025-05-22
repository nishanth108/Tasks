class MaxElement {
    public static void main(String[] args) {
        int[] arr = {8,9,12,130,70,100,400} ;
     
       
        int max = arr[0];
        for(int i = 1; i < arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
              
            }
            
        }
        System.out.println("the maximum number is:"+max);
    }
}