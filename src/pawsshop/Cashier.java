package pawsshop;

public class Cashier extends User{
    
    private String cashierNo;

    public Cashier(String name, String contactNo, String username, String password, String cashierNo){
        super(name, contactNo, username, password);
        this.cashierNo = cashierNo;
    }
    
    // So that Manager can access attributes of User
    public Cashier(){}

}
