/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ServiceAdminRole;
import Business.Role.SupplierAdminRole;
import java.util.ArrayList;

/**
 *
 * @author jhalak
 */
public class ServiceAdminOrganization extends Organization {
    
      public ServiceAdminOrganization () {
        super(Organization.Type.ServiceAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ServiceAdminRole());
        return roles;
    }
     
}
