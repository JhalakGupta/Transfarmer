/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BankingRole;
import Business.Role.CarrierServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jhalak
 */
public class BankingOrganization extends Organization {

    public BankingOrganization() {

        super(Organization.Type.Banking.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new BankingRole());
        return roles;
    }
}
