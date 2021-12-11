/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author 刘欣卓
 */
public class AckemmaRole extends Role{
    
    public AckemmaRole(){
        this.type = Role.RoleType.Ackemma;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = Role.RoleType.Ackemma;
        return new AckemmaWorkAreaJPanel(mainScreen, userAccount, system);
    }
}