// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MoveZero {
    public static void main(String[] args) {
    
        int num=4187832;
        int oddSum =0;
        int evenSum = 0;
        while(num!=0) {
            int rem = num%10;
            if(rem % 2 ==0 ) {
                evenSum+=rem;

            }
            else {
                oddSum+=rem;
            }
            num/=10;
        }
        System.out.println("even sum"+evenSum);
        System.out.println("odd sum"+oddSum);
    }
}