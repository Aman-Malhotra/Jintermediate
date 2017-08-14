import java.util.*;
class A18
{
    public static void main(String args[])
    {
        Integer[] iray={1,2,3,4,5};
        Character[] cray={'a','m','a','n'};
        
        printMe(iray);
        printMe(cray);
    }
    private static <T> void printMe(T[] x)
    {
        for(T a:x)
            System.out.printf("%s ",a);
        System.out.println();
    }
}