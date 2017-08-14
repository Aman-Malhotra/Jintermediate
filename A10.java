//reverse and copy methods 
import java.util.*;
class A10
{
public static void main(String args[])
{
//create an arry and convert to  list 
Character[] ray={'p' ,'w' ,'n'};
List<Character> l = Arrays.asList(ray);
System.out.println("List is : ");
output(l);

//reverse and print out the list
Collections.reverse(l);
System.out.println("After reverse : ");
output(l);

//create a new array and anew list 
Character[] newArray=new Character[3];
List<Character> listCopy=Arrays.asList(newArray);

//copycontents of list to listCopy
Collections.copy(listCopy,l);
System.out.println("Copy of the list : ");
output(listCopy);

//fill collection with crap
Collections.fill(l,'X');
System.out.println("After filling the list : ");
output(l);
}

//otput method()
private static void output(List<Character> theList)
{
for(Character thing: theList)
{
System.out.printf("%s ",thing);
}
System.out.println();

}
}


