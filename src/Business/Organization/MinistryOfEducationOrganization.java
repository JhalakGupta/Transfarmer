/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MinistryOfEducationRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author AMY
 */
public class MinistryOfEducationOrganization extends Organization {
     public MinistryOfEducationOrganization() {
         
        super(Organization.Type.MinistryOfEducation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MinistryOfEducationRole());
        return roles;
    }
}
