public class BankTester{
  public static void main(String[] args){
    BankAccount A = new BankAccount(1010101, "testing");
    System.out.println(A.getBalance());
    System.out.println(A.getAccountID());
    A.setPassword("?");
    System.out.println(A.getPassword());
    System.out.println(A.deposit(1000));
    System.out.println(A.getBalance());
    System.out.println(A.withdraw(1000));
    System.out.println(A.getBalance());
    System.out.println(A.toString());
  }
}
