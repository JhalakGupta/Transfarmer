/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Event.Event;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author AMY
 */
public class EducationEventsWorkRequest extends WorkRequest{
    
    private Event event;
    private double claimedMoney;
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public double getClaimedMoney() {
        return claimedMoney;
    }

    public void setClaimedMoney(double claimedMoney) {
        this.claimedMoney = claimedMoney;
    }
    
    
}
