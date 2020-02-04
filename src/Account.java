public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first,String last, double balance) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        acctNum=(int)(Math.random()*998)+1;
    }

    public Account() {
        this("","",0) ;
    }
    public Account(Account dup) {
        this(dup.first,dup.last,dup.balance);

    }
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public double getBalance() {
        return balance;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setFirst(String first) {
      this.first= first;
    }

    public void setLast(String last) {
        this.last= last;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }

    public boolean withdrawal(double withdrawalAmount) {
        if(withdrawalAmount<=balance) { /*Is this a potential issue can we get a 0 or unattended number.
            */
            balance -= withdrawalAmount;
            return true;
        }
        else {
            return false;
        }

    }

    public String toString() {
        return "Customer Name: " + first +" " +last + "\n"+
                "Account #: " +acctNum+ "\n"+
                "Current Balance: "+"$"+balance;

    }
}
