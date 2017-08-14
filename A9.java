import java.util.*;
class A9
{
 public static void main(String args[])

 {
 String friends[]={"aman","bandan","arjun","nupur","jessica"};
 List<String> l1=Arrays.asList(friends);
 
 Collections.sort(l1);
 System.out.printf("%s\n",l1);
 
 Collections.sort(l1,Collections.reverseOrder());
  System.out.printf("%s\n",l1);
 
 
 
}
}

 
 
 

 
 
 