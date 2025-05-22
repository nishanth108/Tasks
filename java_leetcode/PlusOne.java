class PlusOneSolution {
    public static int[] PlusOne(int[] num)
    {
        for(int c=num.length-1;c>=0;c--) {
            if(num[c] == 9) {
                num[c]=0;
            }
            else {
                num[c]++;
                return num;
            }
        }
        int[] result = new int[(num.length)+1];
        result[0]=1;
    return result;
    }
}
public class PlusOne {
  public static void main(String args[]){
    PlusOneSolution sol = new PlusOneSolution();
    int arr[] = {9,9,9};
    int result[]=sol.PlusOne(arr);
    for(int i=0;i<result.length;i++) {
        System.out.println(result[i]);
    }
  }
}
