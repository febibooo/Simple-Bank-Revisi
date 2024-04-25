class BankSystem {
    public static void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public static void withdrawal(BankAccount account, double amount) {
        account.withdrawal(amount);
    }

    public static void convertCreditToCash(BankAccount account, double amount) {
        account.convertCreditToCash(amount);
    }
}