public class Client {
    private double balance;
    private String clientName;
    private String accountType;

    public Client(double balance, String clientName, String accountType){
        setBalance(balance);
        setClientName(clientName);
        setAccountType(accountType);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientName() {
        return clientName;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return String.format("""
                ********************************
                Nombre del cliente: %s
                Tipo de cuenta: %s
                balance: %.2f
                ********************************
                """, clientName, accountType, balance);
    }
}
