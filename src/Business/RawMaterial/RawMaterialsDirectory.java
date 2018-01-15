/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RawMaterial;


import java.util.ArrayList;

/**
 *
 * @author jhalak
 */
public class RawMaterialsDirectory {
    private ArrayList<RawMaterial> rawMaterialList;
    
    public RawMaterialsDirectory(){
        rawMaterialList= new ArrayList<>();
                
    }

    public ArrayList<RawMaterial> getRawMaterialList() {
        return rawMaterialList;
    }

    public void setRawMaterialList(ArrayList<RawMaterial> rawMaterialList) {
        this.rawMaterialList = rawMaterialList;
    }
    
       public RawMaterial addRawMaterial() {
          
        RawMaterial RawMaterial = new RawMaterial();
        this.rawMaterialList.add(RawMaterial);
        return RawMaterial;
    }
    
   
}
