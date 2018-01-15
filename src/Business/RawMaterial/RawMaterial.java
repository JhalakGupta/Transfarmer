package Business.RawMaterial;


import Business.Enterprise.Enterprise;
import Business.Organization.OrganizationDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janhavi
 */
public class RawMaterial {

    int quantity;
    private RawMaterialType rawMaterialType;
    String name;
    public RawMaterial() {

       

    }

    public enum RawMaterialType {
        Fertilizers("Fertilizers"), Pesticides("Pesticides"), Seeds("Seeds");

        private String value;

        private RawMaterialType(String value) {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public RawMaterialType getRawMaterialType() {
        return rawMaterialType;
    }

    public void setRawMaterialType(RawMaterialType rawMaterialType) {
        this.rawMaterialType = rawMaterialType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
