import java.util.*;
class A15
{
    public static void main(String args[])
    {
        PriorityQueue<String> q=new PriorityQueue<String>();
        q.offer("First");
        q.offer("Second");
        q.offer("Third");
        
        System.out.printf("%s ",q);
        System.out.println();
        
        System.out.println(q.peek());
        System.out.println();
        
        q.poll();
        System.out.printf("%s ",q);
       
        
    }
}