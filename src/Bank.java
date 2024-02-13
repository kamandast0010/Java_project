import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private String bankLocation;
    private String bankType;
    protected List<Customers> bankCustomers;

    public Bank() {
    }

    public Bank(String bankName, String bankLocation, String bankType) {
        this.bankName = bankName;
        this.bankLocation = bankLocation;
        this.bankType = bankType;
    }

    //created a method to add customer in the bank
//    public void addCustomer();

//    public void addStaff(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("------------------------Enter Customer Information------------------------");
//        System.out.println("Enter staffId: ");
//        int staffId = scan.nextInt();
//        System.out.println("Enter staffName: ");
//        String staffName = scan.nextLine();
//        System.out.println("Enter staffEmail: ");
//        String staffEmail = scan.nextLine();
//        System.out.println("Enter staffDepartment: ");
//        String staffDepartment = scan.nextLine();
//        bankStaffs.add(new Staff(staffId,staffName,staffEmail,staffDepartment));
//    }
}

class Customers extends Bank {
    private int customerId;
    private String customerName;
    private int customerAccountNumber;
    private double accountBalance;
    private String customerEmail;
    protected int accountNumber;

    public Customers() {
    }

    public Customers(int customerId, String customerName, int customerAccountNumber, double accountBalance, String customerEmail) {
//        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAccountNumber = customerAccountNumber;
        this.accountBalance = accountBalance;
        this.customerEmail = customerEmail;

    }

    //    public int getCustomerId(){
//        return customerId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public int getCustomerAccountNumber() {
//        return customerAccountNumber;
//    }
//
//    public double getAccountBalance() {
//        return accountBalance;
//    }
//
//    public String getCustomerEmail() {
//        return customerEmail;
//    }
    public void addCustomer() {
        this.bankCustomers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        Scanner scan5 = new Scanner(System.in);
        Scanner scan6 = new Scanner(System.in);

        System.out.println("------------------------Enter Account Information------------------------");
        System.out.println("Enter Customer Id: ");
        try {
            customerId = scan.nextInt();
        } catch (Exception e) {
            System.out.println("wrong value..");
        }
        System.out.println("Enter Customer Name: ");
        try {
            customerName = scan2.nextLine();
        } catch (Exception e) {
            System.out.println("Wrong value");
        }
        System.out.println("Enter CustomerAccountNumber: ");
        try {
            customerAccountNumber = scan3.nextInt();
        } catch (Exception e) {
            System.out.println("wrong value");
        }
        System.out.println("Enter AccountBalance: ");
        try {
            accountBalance = scan4.nextDouble();
        } catch (Exception e) {
            System.out.println("wrong value");
        }
        System.out.println("Enter CustomerEmail: ");
        try {

        } catch (Exception e) {
            System.out.println("Wrong value..");
        }
        customerEmail = scan5.nextLine();

        bankCustomers.add(new Customers(customerId, customerName, customerAccountNumber, accountBalance, customerEmail));
    }

    public void displayCustomer(){
        for(Customers details:bankCustomers){
            System.out.println(details.toString());
        }
    }

    public void depositFunds() {
        System.out.println("------------------------Deposit Now------------------------");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Enter true to start and false to stop: ");
        boolean isDeposit = scanner3.nextBoolean();
        String quit;

        while (isDeposit) {
            System.out.println("Enter account Number: ");
            try {
                accountNumber = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Wrong value");
            }

            if (customerAccountNumber == accountNumber) {
                System.out.println("Enter deposit amount: ");
                double cash = 0;
                try {
                    cash = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("wrong value");
                }

                accountBalance += cash;
                System.out.println("Deposit successful, Your current balance is: " + accountBalance);
            } else {
                System.out.println("Account number not found..");
            }
            System.out.println("Enter quit to end program");
            quit = scanner2.nextLine();
            if (quit.equalsIgnoreCase("quit")) {
                break;
            }
        }
    }
//    public void displayInformation(){
//        System.out.println(
//                "customerId=" + customerId +
//                "\ncustomerName='" + customerName +
//                "\ncustomerAccountNumber=" + customerAccountNumber +
//                        "\naccountBalance=" + accountBalance +
//                        "\ncustomerEmail='" + customerEmail +
//                        "\naccountNumber=" + accountNumber
//                );
//
//        System.out.println(" ");
//
//
//    }

//    public void displayCustomers(){
//        for(Customers customers:bankCustomers){
//            System.out.println(customers);
//        }
//    }

    //......
    public void withdrawFunds(boolean isWithdrawMoney) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account Number: ");
        accountNumber = scanner.nextInt();

        if (customerAccountNumber == accountNumber) {
            while (isWithdrawMoney) {
                System.out.println("Enter Withdrawal Value: ");
                double withdrawMoney = scanner.nextDouble();
                if (withdrawMoney >= 20 && withdrawMoney < accountBalance) {
                    accountBalance -= withdrawMoney;
                    System.out.println("Withdrawal Successful: Balance = " + accountBalance);
                    break;
                } else {
                    System.out.println("Withdrawal Rejected insufficient funds or invalid value...");
                }
            }
        } else {
            System.out.println("Account Number not in the system");
        }

    }

}
