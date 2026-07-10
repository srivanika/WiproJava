package abstractClasses.Packages.accessSpecifier;

import abstractClasses.Packages.test.Foundation;

public class TestFoundation {

    public static void main(String[] args) {

        Foundation obj = new Foundation();

        // Private - Not Accessible
        // System.out.println(obj.var1);

        // Default - Not Accessible
        // System.out.println(obj.var2);

        // Protected - Not Accessible
        // System.out.println(obj.var3);

        // Public - Accessible
        System.out.println("var4 = " + obj.var4);
    }
}