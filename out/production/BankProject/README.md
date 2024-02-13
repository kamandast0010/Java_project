public void depositFund() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Deposit Value: ");
double cash = scanner.nextDouble();
if (cash >= 20) {
accountBalance += cash;
System.out.println("Funds deposited.Your New balance is: " + accountBalance);
} else {
System.out.println("Minimum deposit fund is 20: ....");
}
}

    public void withdrawFunds(boolean isWithdrawMoney) {

        Scanner scanner = new Scanner(System.in);
        while(isWithdrawMoney){
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

    }