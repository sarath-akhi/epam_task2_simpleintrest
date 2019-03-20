import java.util .*;
class Intrest
{
    public static void main (String[] args)
{
    double prin,rate,time,si,com;
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    prin=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    time=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rate=sc.nextDouble();
    si=(prin*time*rate)/100;
    com=prin*Math.pow(1.0+rate/100.0,time) - prin;
    System.out.println("Simple Interest="+si);
    System.out. println("Compound Interest="+com);
   }
}