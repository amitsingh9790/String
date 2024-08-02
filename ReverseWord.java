package String;

public class ReverseWord {
        public static String reverseWords(String s) {
            String ans = "";
            int i=0,j=0,n=s.length();
            while (i<n){
                while (i<n && s.charAt(i)==' ')
                    i++;
                if(i>=n) break;
                j=i+1;
                while (j<n && s.charAt(j) !=' ')
                    j++;
                String sub = s.substring(i,j);
                if(ans.length()==0)
                    ans=sub;
                else
                    ans = sub +" "+ ans;
                i=j+1;
            }
            return ans;
        }

    public static void main(String[] args) {
        System.out.println(reverseWords(" This is my   First Demo"));

        //   i   j
        //0123456789   n=10
        //   this is
    }
}
