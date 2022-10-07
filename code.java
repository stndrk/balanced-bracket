import java.util.*;
import java.lang.*;
import java.io.*;

// BALANCED BRACKET WITH T.C O(n) && S.C O(n)

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                String s=sc.next();
                boolean ans=balacedbracket(s, n);
                if(ans==true){
                        System.out.println("YES");}
                else{
                         System.out.println("NO");}
        }
        static boolean balacedbracket(String s, int n){
                Stack <Character> st=new Stack<>();
                for(int i=0;i<n;i++){
                        char curr=s.charAt(i);
                         if(curr=='(' || curr=='{'|| curr=='['){
                                st.push(curr);}
                        else{
                                if(st.isEmpty()){
                                        //unmatch condition
                                        return false;}
                                if(curr==')'&& st.peek()=='('){
                                        // match happening
                                     st.pop();
                                        continue;}
                                if(curr==']'&& st.peek()=='['){
                                     st.pop();
                                        continue;}
                                if(curr=='}'&& st.peek()=='{'){
                                     st.pop();
                                        continue;}
				return false;
                        }
                }
                //if for loops end then brackets are balanced
                return st.isEmpty();
	}
}
