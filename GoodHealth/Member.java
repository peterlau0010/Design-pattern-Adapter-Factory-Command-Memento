/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodHealth;

/**
 *
 * @author Peter
 */
public class Member {
    private String id;
    public int prepaidHours;
    private String name;
    private String phoneNumber;
    
    public Member(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Member(){}

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }



    /**
     * @return the prepaidHours
     */
    public int getPrepaidHours() {
        return prepaidHours;
    }

     public void setPrepaidHours(int i) {
         prepaidHours=i;
    }
    /**
     * @param prepaidHours the prepaidHours to set
     */


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }



    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public void addPrepaidHours(int prepaidHours) {
        this.prepaidHours += prepaidHours;
    }
    
    public void usePrepaidHours(int prepaidHours) {
        this.prepaidHours -= prepaidHours;
    }
}
