package securitycheck;

public class PinCodeCheck extends SecurityCheck {
    ISecurityUI securityUI;
    public PinCodeCheck(ISecurityUI securityUI)
    {
        this.securityUI = securityUI;
    }

    private boolean IsValid(int pin)
    {
        return true;
    }
        
    @Override
    public boolean ValidateUser() {
       int pin = securityUI.RequestPinCode();
       if (IsValid(pin))
       {
        return true;
       }

       return false;
    }
    
}
