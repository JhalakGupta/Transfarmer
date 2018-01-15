/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.FarmerRole;
import Business.Role.RawMaterialSupplierRole;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author janhavi
 */
public class RawMaterialsOrganization extends Organization{
 
    
    public RawMaterialsOrganization() {
        super(Organization.Type.RawMaterial.getValue());
  
    }

      
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RawMaterialSupplierRole());
        return roles;
    }
     
}