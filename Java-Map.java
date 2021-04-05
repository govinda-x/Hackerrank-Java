import java.util.*;
class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        	HashMap<String, Integer> h= new HashMap<String , Integer>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            h.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(h.containsKey(s)){
                System.out.println(s+"="+h.get(s));
            }
            else{
                System.out.println("Not found");
            }
		}
	}
}



