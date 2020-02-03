public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first,String last, double balance) {
        this.first = first;
        this.last = last;
        this.balance = balance;
        acctNum=(int)(Math.random()*999)+1;
    }
    public Account(Account dup) {
        this()
    }
}
