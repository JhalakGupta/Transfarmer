/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Farmer.FarmerAnalysisJPanel;

/**
 *
 * @author janhavi
 */
public class FarmerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        // return new FarmerWorkAreaJPanel(userProcessContainer, account, (FarmerOrganization)organization, enterprise,business);
        return new FarmerAnalysisJPanel(userProcessContainer, account, (FarmerOrganization) organization, enterprise, business);
    }

    @Override
    public String toString() {
        return RoleType.FarmerRole.getValue();
    }
}
