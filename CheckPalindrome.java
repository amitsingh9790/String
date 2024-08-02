package String;

public class CheckPalindrome {
    public static char[] reverseString(String str){
        char[] arr = str.toCharArray();
        int n = arr.length;
        char temp;
        for(int i=0;i<n/2;i++){
            temp=arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        char[] arr= str.toCharArray();
        int l=0,r=arr.length-1;
        while(l<=r){
            if(arr[l]!=arr[r])
                return false;
            ++l;
            --r;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "Abcba";
        System.out.println(isPalindrome(str));
        String str2 = "AmitSingh";
        System.out.println(reverseString(str2));
    }
}
