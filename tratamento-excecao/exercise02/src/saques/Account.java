package saques;

public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    // Construtor
    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }
    
    // Getters and Setters
    public Integer getNumber() {
        return number;
    }
    
    public String getHolder() {
        return holder;
    }
    
    public Double getBalance() {
        return balance;
    }
    
    public Double getWithDrawLimit() {
        return withDrawLimit;
    }
    
    public void deposit(Double amount) {
        balance += amount;
    }
    
    public void withdraw(Double amount) {
        if (amount > withDrawLimit) {
            throw new IllegalArgumentException("Withdraw limit exceeded");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withDrawLimit="
                + withDrawLimit + "]";
    }
    
}
