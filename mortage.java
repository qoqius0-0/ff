import java.text.NumberFormat;
import java.util.Scanner;

public class mortage {
    public static void main(String[] args) {
        
    
   final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    Scanner sc = new Scanner ( System.in);
    
    System.out.println("Principal:");
    int Principal = sc.nextInt();

  System.out.println("Annual Interest Rate : ");
  float annualInterest = sc.nextFloat();
  float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

  System.out.println("Period(years):");
  byte years = sc.nextByte();
  int numberofPaymets = years * MONTHS_IN_YEAR;
  double mortgage = Principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberofPaymets)/(Math.pow(1+monthlyInterest,numberofPaymets)-1));
   String mortgageF = NumberFormat.getCurrencyInstance().format(mortgage);

  System.out.println("mortgage"+mortgageF);

}}