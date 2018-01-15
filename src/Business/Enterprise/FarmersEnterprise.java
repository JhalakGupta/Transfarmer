/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author janhavi
 */
public class FarmersEnterprise extends Enterprise{

    public FarmersEnterprise(String name) {
        super(name, EnterpriseType.Farmers);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
