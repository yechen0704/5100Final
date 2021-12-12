/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CompensatorRole.CompensatorWorkAreaJPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;

/**
 *
 * @author 刘欣卓
 */
public class CompensatorRole extends Role{
    
    public CompensatorRole(){
        this.type = RoleType.Compensator;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.Compensator;
        return new CompensatorWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
