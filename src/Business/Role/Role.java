/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author janhavi
 */
public abstract class Role {

    public enum RoleType {
        SupplierAdmin("SupplierAdmin"),
        Farmers("Famers"),
        RawMaterialSupplier("RawMaterial Supplier"),
        ServiceAdmin("ServiceAdmin"),
        CarrierRole("Carrier Service Role"),
        LogisticsAdminRole("LogisticsAdminRole"),
        TransporterRole("TransporterRole"),
        ThirdpartyRole("ThirdpartyRole"),
        CustomerRole("CustomerRole"),
        GovermentAdmin("GovermentAdmin"),
        BankingRole("Banking Role"),
        DoctorRole("Doctor Role"),
        HospitalAdminRole("Hospital Admin Role"),
        FarmerHelpDeskAdminRole("FarmerHelpDesk Admin Role"),
        MinistryOfEducationRole("MinistryOfEducationRole"),
        MedicineInventoryRole("MedicineInventory"),
        SupplierInventoryRole("SupplierInventoryRole"),
        MedicineSupplierRole("MedicineSupplierRole"),
        MedicineSupplierRoleAdmin("MedicineSupplierAdminRole"),
        MarketAdminRole("MarketAdminRole"),
        FarmerRole("FarmerRole"),
        FarmerHelpDeskRole("FarmerHelpDeskRole"),
        FarmerAdminRole("FarmerAdminRole"),
        SystemAdminRole("SystemAdminRole");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
