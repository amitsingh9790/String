package String;

import java.io.StringReader;
import java.util.Arrays;

public class StringMethods {
    public static <Char> void main(String[] args) {

        // 1. concat()
        // Using concat() in a loop to build a long string can be inefficient because each call to concat() creates a
        // new String object, leading to a lot of temporary String objects and increasing the time complexity. A more
        // efficient alternative is to use StringBuilder or StringBuffer and use append Method.
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(str2);
        //System.out.println(result); // Output: HelloWorld

        String[] str = {"Amit","believe","on","Execution"};
        String str3 = "";
        for (int i = 0; i < str.length; i++)
            str3 =str3.concat(str[i]);
        //System.out.println(str3);

        // 2.substring()
        String s1 = "HelloWorld";
        String sub = s1.substring(5,10);
        //System.out.println(sub); //Output: World

        // 3.SubSequence()
        // What is difference b/w subSequence(int start, int end) and substring(int start, int end)
        // Both methods return a part of the string, but subSequence() returns a CharSequence while substring() returns
        // a String. They are otherwise functionally equivalent.
        String s2 = "HelloWorld";
        CharSequence sub2 = s1.subSequence(2,7);
        //System.out.println(sub2); //Output: lloWo

        // 4. replace()
        // Using replace on large strings can be slow because it creates a new String object each time a replacement
        // is made, which can be inefficient in terms of memory and processing time. For Performance critical applications,
        // consider using StringBuilder or StringBuffer.
        String s3 = "Hello Moto";
        String res = s3.replace(' ','_');
        //System.out.println(res); //Output: Hello_Moto

        // 5. replaceFirst()
        // replaceFirst() can use regular expressions to match patterns within the string and replace the first
        // occurrence that matches the pattern.
        String s4 = "Hello World";
        String res2 = s4.replaceFirst("o", "e");
        //System.out.println(res2); //Output: Helle World

        String res3 = s4.replaceFirst("Hello", "Bye");
        //System.out.println(res3); //Output: Bye World

        // 6.replaceAll()
        // * replace() is used for literal replacements and does not use regular expressions, whereas replaceAll() uses
        // regular expressions for pattern matching.
        // * replace() can be slightly faster since it does not involve pattern matching, whereas replaceAll() is
        // more powerful for complex replacements involving patterns.
        String s5 = "Hello guys this is my Hello World";
        String res4 = s5.replaceAll("o", "e");
        //System.out.println(res4); //Output: Helle guys this is my Helle Werld

        String res5 = s5.replaceAll("Hello", "Bye");
        //System.out.println(res5); //Output: Bye guys this is my Bye World

        // 7.indexOf()
        // The indexOf() method returns the position of the first occurrence of a value in a string and if the value is
        // not found returns -1.

        String s6 = "HelloWorld";
        //System.out.println(s6.indexOf('o')); //Output: 4
        //System.out.println(s6.indexOf("World")); //Output: 5

        // 8.lastIndexOf(int a)
        //   lastIndexOf(char 'c')
        //   lastIndexOf(String str, int fromIndex) finds the index of the last occurrence of the specified substring,
        //   starting the search backward from the specified index.
        String s7 = "HelloWorld";
        //System.out.println(s7.lastIndexOf('o')); //Output: 6

        // 9.contains()
        // Using contains() with large strings can be slow because it checks for the presence of the substring by
        // iterating over the entire string. For performance-critical applications, consider using more efficient
        //structures tries or suffix trees.
        String s8 = "JavaProgramming";
        //System.out.println(s8.contains("Programming")); //Output: true

        //10.charAt()
        // Using charAt() in a loop allows you to access and process each character of a string individually.
        // This can be useful for tasks like counting characters, validating input, or building new strings based
        // on specific conditions.
        String s9 = "JavaProgramming";
        //System.out.println(s9.charAt(4)); //Output: P

        //int count = 0;
        //for (int i = 0; i < s9.length(); i++) {
        //    if(s9.charAt(i)=='a')
        //        ++count;
        //}
        //System.out.println(count); //Output: 3

        //11.endsWith()
        //endsWith() method returns true if a string ends with a specified string. Otherwise, it returns false.
        String s10 = "JavaProgramming";
        //System.out.println(s10.endsWith("ing")); //Output: true

        //12.startsWith()
        // Using startsWith() is generally efficient because it only needs to compare the beginning segment of
        // the string with the specified prefix. However, if the string is very large, and startsWith() is called
        // frequently, it can still contribute to overall performance overhead.
        String s11 = "JavaProgramming";
        //System.out.println(s11.startsWith("ava")); //Output: false

        //13. toLowerCase()
        //Using toLowerCase() on large strings can be slow because it needs to create a new String object with all
        //characters converted to lowercase. This involves iterating over the entire string and can increase the
        // time complexity.
        String s12 = "JavaProgramming";
        //System.out.println(s12.toLowerCase()); //Output: javaprogramming

        //String s = "a".repeat(1000000);
        //long startTime = System.currentTimeMillis();
        //String upper = s.toUpperCase();
        //long endTime = System.currentTimeMillis();
        //System.out.println("Time taken: " + (endTime - startTime) + " ms");
        //System.out.println(upper);  // Output: AAAAAAAAAA...

        //14. toUppercase()
        //Using toUpperCase() on large strings can be slow because it needs to create a new String object with all
        //characters converted to uppercase. This involves iterating over the entire string and can increase the
        //time complexity.
        String s13 = "JavaProgramming";
        //System.out.println(s13.toUpperCase()); //Output: JAVAPROGRAMMING

        //15. ValueOf()
        // - valueOf() is a static method in the String class that converts various data types (including primitives)
        //   to their string representation.
        // - toString() is a method in all Java objects (inherited from Object class) that returns a string
        //   representation of the object.
        // - For objects, both can be used, but valueOf() handles null more gracefully by returning "null" instead of
        //   throwing a NullPointerException.
        String s14 = "";
        int a=10;
        s14= String.valueOf(a); //Converting integer into string using valueOf() Methods.
        //System.out.println(s14); //Output: 10

        //16. toCharArray()
        //The toCharArray() method is used to convert a string into a character array, which allows for easier
        // manipulation of individual characters. This is particularly useful for operations like reversing a
        // string, checking for palindromes, and performing character-level transformations.
        String s15 = "Java";
        char[] chars = s15.toCharArray();
        //for( char c : chars){
        //    System.out.println(c);
        //}

        //17. split()
        // The split() method can take a regular expression as an argument, allowing for more complex splitting
        // conditions beyond simple delimiters. Regular expressions enable splitting by patterns, such as multiple
        // spaces, punctuation, or specific character sequences.
        String s17 = "Java,Programming,Language";
        String[] s18 = s17.split(",");
        //for(String s:s18){
        //   System.out.println(s);
        //}
    }
}
