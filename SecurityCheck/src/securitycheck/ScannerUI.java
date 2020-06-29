/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securitycheck;

import java.util.Scanner;

public class ScannerUI implements ISecurityUI{
    public String RequestKeyCard()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Slide your key card");
            return in.nextLine();
        }

        public int RequestPinCode()
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your pin code:");
            return in.nextInt();
        }
}
