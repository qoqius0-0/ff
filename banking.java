package Project;
import java.util.Scanner;
public class banking {
    
static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        
        double balance = 30.23 ; 
        boolean isRunning = true; 
        int choice; 

        while(isRunning){
            System.out.println("***************");
            System.out.println(" Welcome to BANK OF BRODAS");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposite Money");
            System.out.println("3. WITHDRAW");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt(); 

            switch (choice) {
                case 1 -> System.out.println(balance);
                case 2 -> balance = balance + Deposite(); 
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                    default  -> System.out.println("INVALID CASE");

                    
            }
        }
        System.out.println("******************");
        System.out.println("Thank you for choosing BANK OF BRODAS");
        System.out.println("******************");
        scanner.close(); 
    }
static void showbalance(double balance) {

        System.out.printf("$%.2f\n" , balance);
    }
static double Deposite(){
    double amount ; 
    System.out.print("DEPOSIT amount: ");
    amount = scanner.nextDouble(); 
    if (amount<0){
        System.out.println("amount can't be negative");
        return 0; 
    }
    else{
        return amount ; 
    }
}
static double withdraw(double balance){
    double amount ; 
    System.out.print("Enter amount to be withdrawn: ");
     amount = scanner.nextDouble();

     if(amount>balance){
        System.out.println("INSUFFICIENT FUNDS");
        return 0;
     }
     else if ( amount < 0){
        System.out.println("Amount cannot be negative");
        return 0; 
    }
     else{
        return amount; 
     }
     

}

}
