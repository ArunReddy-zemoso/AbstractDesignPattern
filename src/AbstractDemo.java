public class AbstractDemo {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        phone phone1=new nokia3310("128kb","10mb");
        phone1.printDetails();
        phone1.call();
        phone1.message();
        System.out.println();

        phone phone2=new MiA1("8gb","64gb");
        phone2.printDetails();
        phone2.call();
        phone2.message();
    }
}
