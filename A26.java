import java.util.*;
//runnable interface contains run() method 
public class  A26 implements Runnable
{
    String name;
    int time;
    Random r= new Random();
    
    public A26(String x)
    {
        name = x;
        time = r.nextInt(999);
    }
    
    public void run(){
    try{
    System.out.printf("%s is sleeping for %d\n ",name,time );
    Thread.sleep(time);
    System.out.printf("%s is done \n ",name);
    }
    catch(Exception e)
    {
    
    }
    }
}
