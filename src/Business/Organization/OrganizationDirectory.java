/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.RawMaterial.getValue())) {
            organization = new RawMaterialsOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Farmer.getValue())) {
            organization = new FarmerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.SupplierInventory.getValue())) {
            organization = new SupplierInventoryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Carrier.getValue())) {
            organization = new CarrierOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Transport.getValue())) {
            organization = new TransportOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Thirdparty.getValue())) {
            organization = new ThirdpartyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Customer.getValue())) {
            organization = new CustomerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Banking.getValue())) {
            organization = new BankingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.MinistryOfEducation.getValue())) {
            organization = new MinistryOfEducationOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Callcentre.getValue())) {
            organization = new CallCentreOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.MedicineInventory.getValue())) {
            organization = new MedicineInventoryOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Medicine.getValue())) {
            organization = new MedicineOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
