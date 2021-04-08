import java.util.*;
class Solution{
	
    public static int solve(String A) 
    {
        if(A.length()==0)
        {
            return 1;
        }
        if(A.length()%2==1)
        {
            return 0;
        }
        Stack<Character> s = new Stack<Character>(); 
        for(int i=0; i<A.length(); i++)
        {
            if(A.charAt(i)=='{' || A.charAt(i)=='('|| A.charAt(i)=='[')
            {
                s.push(A.charAt(i));
                continue;
            }
            if(s.isEmpty())
            {
                return 0;
            }
            char brac; 
            switch (A.charAt(i)) 
            { 
                case ')':
                    { 
                        brac = s.peek();
                        s.pop();
                        if (brac == '{' || brac == '[') 
                            return 0; 
                        break; 
                    }
  
                case '}':
                    { 
                        brac = s.peek();
                        s.pop(); 
                        if (brac == '(' ||brac == '[') 
                            return 0; 
                        break; 
                        
                    }
      
                case ']':
                    {
                        brac = s.peek();
                        s.pop();
                        if (brac == '(' || brac == '{') 
                            return 0; 
                        break; 
                    }
            }	 
        }
	if(s.isEmpty())
	{
		return 1;
	}
	return 0;
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
			if(solve(input) == 1 ){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
		}
	}
}



