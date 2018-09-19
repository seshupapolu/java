package seshu.java.playground;

public class Main {
    public  static  void main(String [] args)
    {
        //1.Print
        Print print=new Print();
        print.printMe("Hello");

        //2.Add two number

        AddTwoNumbers add=new AddTwoNumbers();
        System.out.println(add.add(2,3));
    }
}
