public class Tester{
  public static void main(String[] args){
    BankAccount A = new BankAccount(1010101, "testing");
    BankAccount B = new BankAccount(1011, "SUPERSTRONGPASSWORD");
    System.out.println(A.getBalance());
    System.out.println(A.getAccountID());
    A.setPassword("?");
    //System.out.println(A.getPassword());
    A.setPassword("YES");
    //System.out.println(A.getPassword());
    System.out.println(A.getBalance());
    System.out.println(A.deposit(1000));
    System.out.println(A.getBalance());
    System.out.println(A.withdraw(1000));
    System.out.println(A.getBalance());
    System.out.println(A.toString());
    System.out.println();
    System.out.println(A.deposit(-100));
    System.out.println(A.getBalance());
    System.out.println(A.deposit(0));
    System.out.println(A.getBalance());
    System.out.println(A.withdraw(1000));
    System.out.println(A.getBalance());
    System.out.println(A.withdraw(-1000));
    System.out.println(A.getBalance());
    System.out.println(A.withdraw(0));
    System.out.println(A.getBalance());
    System.out.println(A.toString());
    System.out.println();
    A.deposit(1000);
    System.out.println(A.getBalance());
    System.out.println(B.getBalance());
    System.out.println(A.transferTo(B, 1000, "YES"));
    System.out.println(A.getBalance());
    System.out.println(B.getBalance());
  }
}
