package String;

public class ClassQuestion {
    public static void duplicateCharator(String s){
        s=s.replaceAll(" ","");
        int []arr = new int[126];
        int N = s.length();
        for (int i = 0; i < N; i++) {
            char ch = s.charAt(i);
            arr[ch]=arr[ch]+1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>1){
                System.out.print((char)i+" "+arr[i]+" ");
            }
        }
    }

    public static char countMinChar(String s){
        s=s.replaceAll(" ","");
        int []arr = new int[126];
        int N = s.length();
        for (int i = 0; i < N; i++) {
            char ch = s.charAt(i);
            arr[ch]=arr[ch]+1;
        }
        int min= Integer.MAX_VALUE;
        char minChar = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 && arr[i]<min){
                min=arr[i];
                minChar= (char)i;
            }
        }
        return minChar;
    }
    public static char countMaxChar(String s){
        s=s.replaceAll(" ","");
        int []arr = new int[126];
        int N = s.length();
        for (int i = 0; i < N; i++) {
            char ch = s.charAt(i);
            arr[ch]=arr[ch]+1;
        }
        int max= Integer.MIN_VALUE;
        char maxChar = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxChar= (char)i;
            }
        }
        return maxChar;
    }
    public static String reversetheString(String s){
        StringBuilder str = new StringBuilder(s);;
        str.reverse();
        return str.toString();
    }
    public static boolean isPalidrome(String s){
        s=s.toLowerCase();
//        char[] arr = s.toCharArray();
//        int l=0,r=s.length()-1;
//        while(l<=r){
//            if(arr[l]!= arr[r])
//                return false;
//            l++;r--;
//        }
//        return true;
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return s.contentEquals(str);
    }
    public static void main(String[] args) {
        String str = "Arun";
        System.out.println(reversetheString(str));

//        System.out.println(isPalidrome("Aba"));
//        System.out.println(countMaxChar( " abc def  d fff "));
//        System.out.println(countMinChar("abcd"));
        duplicateCharator("abamit   ttss");

    }
}