public class AccountDriver {

    public static void main(String[]args) {
        Account account= new Account("Aron", "Bishop",50);
        Account account1= new Account(account);
    }
}
