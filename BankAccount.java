public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String pass){
    balance = 0;
    accountID = ID;
    password = pass;

    System.out.println(ID);
    System.out.println(pass);
  }

}
