class BankAccount {
    private final String accountNumber;
    private final int pin;
    private double balance;
    private double credit;

    public BankAccount(String accountNumber, int pin, double balance, double credit) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.credit = credit;
    }

    public boolean verification(String inputAccountNumber, int inputPin) {
        return accountNumber.equals(inputAccountNumber) && pin == inputPin;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit succeed,  your balance is " + balance);
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal succeed, your balance is " + balance);
        } else {
            System.out.println("Withdrawal failed, insufficient balance");
        }
    }

    public void convertCreditToCash(double amount) {
        balance += amount*1000;
        credit -= amount;
        System.out.println("Credit conversion succeed");
        System.out.println("Your balance is " + balance);
        System.out.println("Your credit is "+ credit);
    }

    public double getBalance() {
        return balance;
    }

    public double getCredit(){
        return credit;
    }
}