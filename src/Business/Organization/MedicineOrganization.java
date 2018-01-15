/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicineSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deekshithav
 */
public class MedicineOrganization extends Organization {

    public MedicineOrganization() {
        super(Organization.Type.Medicine.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicineSupplierRole());
        return roles;
    }

}
