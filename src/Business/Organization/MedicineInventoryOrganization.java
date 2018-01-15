/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Medicine.MedicineDirectory;
import Business.Role.MedicineInventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author deekshithav
 */
public class MedicineInventoryOrganization extends Organization {

    private MedicineDirectory medicineDirectory;

    public MedicineInventoryOrganization() {

        super(Organization.Type.MedicineInventory.getValue());
        this.medicineDirectory = new MedicineDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicineInventoryRole());
        return roles;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

}
