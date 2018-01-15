/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author janhavi
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {
        SupplierAdmin("Supplier Admin Organization"),
        RawMaterial("RawMaterial Organization"),
        Farmer("Farmer Organization"),
        ServiceAdmin("Service Admin Organization"),
        Carrier("Carrier Organization"),
        SupplierInventory("Supplier Inventory Organization"),
        LogisticsAdmin("Logistics Admin Organization"),
        Transport("Transport Organization"),
        Thirdparty("Thirdparty Organization"),
        Customer("Customer Organization"),
        MarketAdmin("Market Admin Organization"),
        GovermentAdmin("Goverment Admin Organization"),
        Banking("Banking Organization"),
        HospitalAdmin("Hospital Admin"),
        FarmerHelpDesk("FarmerHelpDesk Admin Organization"),
        Callcentre("Call Centre Organization"),
        Doctor("Doctor Organization"),
        MinistryOfEducation("Ministry of Education Organization"),
        MedicineInventory("MedicineInventory Organization"),
        Medicine("Medicine Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
