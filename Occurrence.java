
public class Occurrence {
public static void main(String[] args) {
	    String str1="Hello";
	    char ch='l';
	    char ch1;
	    int a=0;
	    for(int i=1;i<=str1.length()-1;i++) {
	        ch1=str1.charAt(i);
	        if(ch==ch1) {
	           a=a+1;
	            }
	        }
	        System.out.println(a);
	    }
}
