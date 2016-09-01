package com.glinin.java.javadesignpattern;

/**
 * Hello world!
 *
 */
public class App 
{
    private static int a = 1;
    
    private int b = 10;
    
    private int getB(){
        b++;
        return b;
    }
    public static void main( String[] args )
    {
        App app = new App();
        System.out.println(app.a);
        System.out.println(app.getB());
        a++;
        app = new App();
        System.out.println(app.a);
        System.out.println(app.getB());
    }
}
