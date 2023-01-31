import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
import java.security.PublicKey;
import java.text.DecimalFormat;

public class CurrencyConvertor{

    public static void main(String[] args){

        double amount, dollar, pound, code, euro, yen, ringgit, rupee;

        DecimalFormat f= new DecimalFormat("##.##");
        Scanner sc = new Scanner(System.in);

        System.out.println("hi, welcome to the currency convertor");
        System.out.println("which currency you want to convert?");
        System.out.println("1: rupee \t2:Dollar \t3:POund \t4:Euro \t5:Yen \t6:Ringgit");

        code= sc.nextInt();

        System.out.println("how much money you want to convert?");
        amount=sc.nextInt();

        if(code==1){
            // rupee conversion
            dollar=amount / 70;
            System.out.println("your" + amount+ "Rupee is" + f.format(dollar) +"Dollar");

            pound = amount /88;
            System.out.println("your" + amount+ "Rupee is" + f.format(pound) +"Pound");

            euro= amount/80;
            System.out.println("your" + amount+ "Rupee is" + f.format(euro) +"Euro");

            yen = amount/0.63;
            System.out.println("your" + amount+ "Rupee is" + f.format(yen) +"Yen");

            ringgit=amount/16;
            System.out.println("your" + amount+ "Rupee is" + f.format(ringgit) +"Rimggit");

        }
        else if(code==2){
        // dollar conversion
            rupee=amount * 70;
            System.out.println("your " + amount+ "  Dollar is  " + f.format(rupee) +"Rupee");

            pound = amount * 0.76;
            System.out.println("your" + amount+ "Dollar is" + f.format(pound) +"Pound");

            euro= amount*0.87;
            System.out.println("your" + amount+ "Dollar is" + f.format(euro) +"Euro");

            yen = amount* 111.087;
            System.out.println("your" + amount+ "Dollar is" + f.format(yen) +"Yen");

            ringgit=amount * 4.17;
            System.out.println("your" + amount+ "Dollar is" + f.format(ringgit) +"Rimggit");
 
        }
        else if(code==3){
            //pound conversion
            rupee=amount * 88;
            System.out.println("your" + amount+ "Pound is" + f.format(rupee) +"Rupee");

            dollar = amount * 1.26;
            System.out.println("your" + amount+ "Pound is" + f.format(dollar) +"Dollar");

            euro= amount*1.10;
            System.out.println("your" + amount+ "Pound is" + f.format(euro) +"Euro");

            yen = amount* 140.93;
            System.out.println("your" + amount+ "Pound is" + f.format(yen) +"Yen");

            ringgit=amount * 5.29;
            System.out.println("your" + amount+ "Pound is" + f.format(ringgit) +"Rimggit");
        }
        else if(code==4){
            // Euro conversion
            rupee=amount * 80;
            System.out.println("your" + amount+ "Euro is" + f.format(rupee) +"Rupee");

            dollar = amount * 1.14;
            System.out.println("your" + amount+ "Euro is" + f.format(dollar) +"Dollar");

           pound= amount*0.98;
            System.out.println("your" + amount+ "Euro is" + f.format(pound) +"Pound");

            yen = amount* 127.32;
            System.out.println("your" + amount+ "Euro is" + f.format(yen) +"Yen");

            ringgit=amount * 4.78;
            System.out.println("your" + amount+ "Euro is" + f.format(ringgit) +"Rimggit"); 
        }
        else if(code==5){
            //Yen conversion
            rupee=amount * 0.63;
            System.out.println("your" + amount+ "Yen is" + f.format(rupee) +"Rupee");

            dollar = amount * 0.008;
            System.out.println("your" + amount+ "Yen is" + f.format(dollar) +"Dollar");

           pound= amount*0.007;
            System.out.println("your" + amount+ "Yen is" + f.format(pound) +"Pound");

            euro = amount* 0.007;
            System.out.println("your" + amount+ "Yen is" + f.format(euro) +"YEuro");

            ringgit=amount * 0.037;
            System.out.println("your" + amount+ "Yen is" + f.format(ringgit) +"Rimggit"); 
        }
        else if(code==6){
            // ringgit conversion
            rupee=amount * 16.8;
            System.out.println("your" + amount+ "Ringgit is" + f.format(rupee) +"Rupee");

            dollar = amount * 0.239;
            System.out.println("your" + amount+ "Ringgit is" + f.format(dollar) +"Dollar");

           pound= amount*0.188;
            System.out.println("your" + amount+ "Ringgit is" + f.format(pound) +"Pound");

            euro = amount* 0.209;
            System.out.println("your" + amount+ "Ringgit is" + f.format(euro) +"Euro");

            yen=amount * 26.63;
            System.out.println("your" + amount+ "Ringgit is" + f.format(yen) +"Yen"); 
        }
        else{
            System.out.println("Invalid input");
        }
        System.out.println("Thank you !");
    }
}
