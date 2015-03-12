/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenFitness;

/**
 *
 * @author Peter
 */
public class Client {

    private String cid;
    public int remainingHours;
    private String cname;
    private String contactNumber;

    public Client(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @return the remainingHours
     */
    public int getRemainingHours() {
        return remainingHours;
    }
       public void setRemainingHours(int i) {
         remainingHours=i;
    }
    /**
     * @param remainingHours the remainingHours to set
     */
    public void addHours(int remainingHours) {
        this.remainingHours += remainingHours;
    }

    public void deductHours(int remainingHours) {
        this.remainingHours -= remainingHours;
    }

    /**
     * @return the cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
