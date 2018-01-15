/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CarrierServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jhalak
 */
public class CarrierOrganization extends Organization {

    public CarrierOrganization() {

        super(Organization.Type.Carrier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CarrierServiceRole());
        return roles;
    }

}
