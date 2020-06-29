/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitycheck;

public class Program {
    public static void main(String[] args) {
         ScannerUI scannerUi = new ScannerUI();
            KeyCardCheck keyCardCheck = new KeyCardCheck(scannerUi);
            PinCodeCheck pinCodeCheck = new PinCodeCheck(scannerUi);
            SecurityManager manager = new SecurityManager (keyCardCheck, pinCodeCheck);
            manager.Check();
    }
}
