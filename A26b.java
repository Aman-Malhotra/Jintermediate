class A26b{
public static void main(String args[])
{
    Thread t1 = new Thread(new A26("one"));
    
    Thread t2 = new Thread(new A26("two"));
    Thread t3 = new Thread(new A26("three"));
    Thread t4 = new Thread(new A26("four"));
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
}
}