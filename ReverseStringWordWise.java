package String;
public class ReverseStringWordWise {
    public static <str> void main(String[] args) {
//        String s = "  This is my      Demo String   ";
//        String[] str = s.split(" ");
//        String ans = "";
//
//        for (int i = str.length-1; i > -1; --i) {
//            if(!str[i].isEmpty()){
//                ans += str[i]+" ";
//            }
//        }
//         ans=ans.trim();
//        System.out.println(ans);


        String s = "  This is my      Demo String   ";
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = str.length-1; i > -1; --i) {
            if(!str[i].isEmpty()){
                ans.append(str[i]).append(" ");
            }
        }
        System.out.println(ans.toString().trim());



    }
}
