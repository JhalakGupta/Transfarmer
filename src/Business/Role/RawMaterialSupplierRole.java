/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.RawMaterialsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
//import UserInterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.RawMaterialSupplier.RawMaterialSupplierJPanel;

/**
 *
 * @author raunak
 */
public class RawMaterialSupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
        //return null;
        return new RawMaterialSupplierJPanel(userProcessContainer, account, (RawMaterialsOrganization)organization, enterprise, business);
        
        
    }
    
}
