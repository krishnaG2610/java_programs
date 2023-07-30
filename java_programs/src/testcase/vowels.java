package testcase;

public class vowels {
	  public static void main(String args[]) {
		  int a=0,e=0,i=0,o=0,u=0;
	    
	    String str = new String("Hello everyone!");
	    for(int f=0; f<str.length(); f++) {
	      if(str.charAt(i) == 'a'|| str.charAt(i) == 'A')
	      {
	    	  a++;
	      }
	      else if( str.charAt(f) == 'i' || str.charAt(f) == 'I') 
	       {
	       	 i++;
	       }
	      else if( str.charAt(f) == 'e' || str.charAt(f) == 'E') 
           {
        	 e++;
           }
	      else if( str.charAt(f) == 'o' || str.charAt(f) == 'O') 
           {
        	 o++;
           }
	      else if( str.charAt(f) == 'u' || str.charAt(f) == 'U') 
          {
        	 u++;
          }   
	   }
	    System.out.println("a:"+a);
	    System.out.println("e:"+e); System.out.println("i:"+i); System.out.println("o:"+o); System.out.println("u:"+u);
	  }
}
