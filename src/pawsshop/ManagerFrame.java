package pawsshop;

/**
 *
 * @author Peniel
 */
public class ManagerFrame extends CashierFrame{
       
    public ManagerFrame(LoginForm loginForm){
        super(loginForm);
        // Overrides the welcome label in the CashierFrame
        setLabelText("Welcome to the Manager's Dashboard");
    }
}
