public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pass){
    balance = 0;
    accountID = ID;
    password = pass;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  /*public String getPassword(){
    return password;
  }*/

  public void setPassword(String newPass){
    password = newPass;
  }

  public boolean deposit(double amount){
    if (amount >= 0){
      balance = balance + amount;
      return true;
    }
    else{
      return false;
    }
  }

  public boolean withdraw(double amount){
    if (amount >= 0 && amount <= balance){
      balance = balance - amount;
      return true;
    }
    else{
      return false;
    }
  }

  public String toString(){
    return (accountID + "\t" + balance);
  }

}
