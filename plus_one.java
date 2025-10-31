import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                 return digits;
               
            }
           digits[i]=0;
        }
        int[] newdigits=new int[n+1];
        newdigits[0]=1;
        return newdigits;
    }
    
    public static void main(String[] args) {
        int digits[]={1,2,3};
        Solution obj=new Solution();
        int[] result=obj.plusOne(digits);
        System.out.print(Arrays.toString(result));
    }
}
