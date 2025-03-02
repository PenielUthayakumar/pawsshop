package pawsshop;

public class Manager extends Cashier{
    
    private String managerNo;

    public Manager(String name, String contactNo, String username, String password, String managerNo){
        super(name, contactNo, username, password, "");
        this.managerNo = managerNo;
    }
    
    public Manager(){}

}
