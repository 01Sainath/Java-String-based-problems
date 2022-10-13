import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateCharacters {
	public static String removeDuplicate(char str[], int n)
    {
        
        int index = 0;
 
        for (int i = 0; i < n; i++)
        {
 
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
           
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String str=input.next();
		int n=str.length();
		char s[]=str.toCharArray();
		System.out.println(removeDuplicate(s,n));
	}

}
