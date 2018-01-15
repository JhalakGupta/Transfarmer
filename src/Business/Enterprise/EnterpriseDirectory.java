/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author janhavi
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Farmers) {
            enterprise = new FarmersEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Supplier) {
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);

        } else if (type == Enterprise.EnterpriseType.ServiceProvider) {
            enterprise = new ServiceProviderEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Logistics) {
            enterprise = new LogisticsEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Market) {
            enterprise = new MarketEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Goverment) {
            enterprise = new GovermentEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.FarmerHelpDesk) {
            enterprise = new FarmerHelpDesk(name);
            enterpriseList.add(enterprise);

        } else if (type == Enterprise.EnterpriseType.MedicineSupplier) {
            enterprise = new MedicineSupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }

}
