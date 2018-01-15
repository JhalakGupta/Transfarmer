/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RawMaterial.RawMaterialsDirectory;
import Business.Role.Role;
import Business.Role.SupplierInventoryRole;
import java.util.ArrayList;

/**
 *
 * @author Janhavi
 */
public class SupplierInventoryOrganization extends Organization{
    private RawMaterialsDirectory rawMaterialsDirectory;
    
     public SupplierInventoryOrganization() {

        super(Organization.Type.SupplierInventory.getValue());
        this.rawMaterialsDirectory= new RawMaterialsDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierInventoryRole());
        return roles;
    }

    public RawMaterialsDirectory getRawMaterialsDirectory() {
        return rawMaterialsDirectory;
    }

    public void setRawMaterialsDirectory(RawMaterialsDirectory rawMaterialsDirectory) {
        this.rawMaterialsDirectory = rawMaterialsDirectory;
    }
    
    
     
}
