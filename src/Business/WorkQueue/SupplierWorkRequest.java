/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.RawMaterial.RawMaterial;

/**
 *
 * @author janhavi
 */
public class SupplierWorkRequest extends WorkRequest{
    
    private RawMaterial rawMaterial;

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(RawMaterial rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

   
    
    
}
