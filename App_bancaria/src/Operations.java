public class Operations {
    private Client client;
    public Operations(Client newClient){
        this.client = newClient;
    }

    public double getBalance(){
        return this.client.getBalance();
    }

    public void deposit(double depositAmount){
        this.client.setBalance(this.client.getBalance() + depositAmount);
    }

    public void withdrawal(double withdrawalAmount){
        double prevewBalance = this.client.getBalance();
        if(this.withdrawalValidation(withdrawalAmount)){
            this.client.setBalance(prevewBalance - withdrawalAmount);
        }else{
            System.out.println("Error: El monto ingresado excede su saldo");
        }
    }

    private boolean withdrawalValidation(double withdrawalAmount){
        return !(this.client.getBalance() < withdrawalAmount);
    }


}
