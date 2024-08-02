package String;
class Solution {
    public static String removeOuterParentheses(String s) {
        char[] arr = s.toCharArray();
        StringBuilder str= new StringBuilder();
        int n = arr.length,count=0,start=0;
        for (int i = 0; i < n ; i++) {
            if( '(' == arr[i] ) ++count;
            else --count;
            if(count==1){
                if(i!=0 && start<i){
                    str.append(s, start, i + 1);
                }
                start=i+1;
            }
            else if (count==0) start = i+2;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeOuterParentheses(str));
    }
}