/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FarmerHelpDeskRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deekshithav
 */
public class CallCentreOrganization extends Organization {

    public CallCentreOrganization() {
        super(Organization.Type.Callcentre.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmerHelpDeskRole());
        return roles;
    }

}
