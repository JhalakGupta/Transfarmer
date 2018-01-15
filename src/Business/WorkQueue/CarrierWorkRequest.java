/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author jhalak
 */
public class CarrierWorkRequest extends WorkRequest {
    private String typeOfProvider;
    private String typeOfPlan;
    private int cost;

    public String getTypeOfProvider() {
        return typeOfProvider;
    }

    public void setTypeOfProvider(String typeOfProvider) {
        this.typeOfProvider = typeOfProvider;
    }

    public String getTypeOfPlan() {
        return typeOfPlan;
    }

    public void setTypeOfPlan(String typeOfPlan) {
        this.typeOfPlan = typeOfPlan;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
}
