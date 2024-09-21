package Substr;
import java.util.*;
import java.lang.*;
public class Substring
{
    public ArrayList<String> substringGenerator(String str)
    {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<str.length();i++)
        {
            for(int j = i;j<str.length();j++)
            {
                String sub = str.substring(i,j+1);
                list.add(sub);
            }
        }
        return list;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();

        Substring s = new Substring();
        System.out.println("The substrings are: ");
        ArrayList<String> l = s.substringGenerator(str);
        for(var x : l)
        {
            System.out.println(x);
        }

    }
}
