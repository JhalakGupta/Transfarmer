/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MedicineOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MedicineSupplier.MedicineSupplierJPanel;

/**
 *
 * @author deekshithav
 */
public class MedicineSupplierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        //return new LabAssistantWorkAreaJPanel(userProcessContainer, account, organization, business);
        //return null;
        return new MedicineSupplierJPanel(userProcessContainer, account, (MedicineOrganization) organization, enterprise, business);

    }

}
