/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.MinistryOfEducationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Education.EducationEventManagerWorkAreaJPanel;
import userinterface.LogisticsAdminRole.LogisticsAdminWorkAreaJPanel;

/**
 *
 * @author AMY
 */
public class MinistryOfEducationRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EducationEventManagerWorkAreaJPanel(userProcessContainer,account,(MinistryOfEducationOrganization)organization,enterprise,business);
       
      
    }
    
}
