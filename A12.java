import java.util.*;
class A12
{
public static void main(String args[])
{
//Convert stuff array to a list
String stuff[]={"apples","beef","corn","ham"};
List<String> list1= Arrays.asList(stuff);

ArrayList<String> list2= new ArrayList<String>();
list2.add("Youtube");
list2.add("google");
list2.add("digg");

for(String x:list2)
System.out.printf("%s ",x);
System.out.println();

Collections.addAll(list2,stuff);
for(String x:list2)
System.out.printf("%s ",x);
System.out.println();

System.out.println(Collections.frequency(list2,"digg"));

boolean tof = Collections.disjoint(list1,list2);
System.out.println(tof);

if(tof)
System.out.println("These lists do not have anything in common");
else
System.out.println("These list must have something in common");


}
}