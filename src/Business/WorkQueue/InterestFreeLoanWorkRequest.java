/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import javax.swing.ImageIcon;

/**
 *
 * @author jhalak
 */
public class InterestFreeLoanWorkRequest extends WorkRequest{
    private String name;
    private String gender;
    private int age;
    private String address;
    private int amount;
    private boolean isLoanApplied;
    private String monthlyIncome;
    private boolean isAgriLand;
    private boolean isCurrentIncome;
    private boolean  isLoanUsed;
      ImageIcon image;

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
      
      

    public boolean IsAgriLand() {
        return isAgriLand;
    }

    public void setIsAgriLand(boolean isAgriLand) {
        this.isAgriLand = isAgriLand;
    }

    public boolean IsCurrentIncome() {
        return isCurrentIncome;
    }

    public void setIsCurrentIncome(boolean isCurrentIncome) {
        this.isCurrentIncome = isCurrentIncome;
    }

    public boolean IsLoanUsed() {
        return isLoanUsed;
    }

    public void setIsLoanUsed(boolean isLoanUsed) {
        this.isLoanUsed = isLoanUsed;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean getIsLoanApplied() {
        return isLoanApplied;
    }

    public void setIsLoanApplied(boolean isLoanApplied) {
        this.isLoanApplied = isLoanApplied;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }
    
    
}
