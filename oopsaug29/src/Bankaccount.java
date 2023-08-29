public class Bankaccount {
    int presentmoney;
  private   int accountnumber;
  private   int balance;
  private   String owner;
  int deposit;
  int withdraw;

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Bankaccount(int accountnumber, int balance, String owner) {
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.owner = owner;
    }

    void totalamtdeposit(int deposit)
    {

    }
    void withdraw(int withdraw){

    }
}
