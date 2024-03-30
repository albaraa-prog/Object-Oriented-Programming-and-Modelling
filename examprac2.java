class week5 {
  protected int accountId;
  protected String owner;
  protected double balance;

  void basevalue (int accountId, String owner, double d){
    this.accountId = accountId;
    this.owner = owner;
    this.balance = d;
  }

  void displayValues(){
    System.out.println("Account ID: "+ accountId);
    System.out.println("Owner Name: "+ owner);
    System.out.println("balance: "+ balance);
  }

}


public class examprac2 {
    public void main(String args[]){
        week5 huh = new week5();
        huh.basevalue(23111, "Al Baraa Al Harthi", 0.200);
        huh.displayValues();

    }

    
}