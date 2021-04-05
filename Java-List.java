import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            ans.add(val);
        }
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            String s = sc.next();
            if(s.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                ans.add(x,y);
            }
            if(s.equals("Delete")){
                int x = sc.nextInt();
                ans.remove(x);
            }
        }
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}