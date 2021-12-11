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
public class AnnouncerRole extends Role{
    
    public AnnouncerRole(){
        this.type = RoleType.Announcer;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.Announcer;
        return new AnnouncerWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
