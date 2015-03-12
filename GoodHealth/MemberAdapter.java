/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodHealth;
import GreenFitness.*;
import java.util.*;
/**
 *
 * @author Peter
 */
public class MemberAdapter extends Member{
    public Client client;

    public MemberAdapter(Client client) {
        super();
        this.client=client;
        
    }
    
    public MemberAdapter(){        
    }
    public String getId() {
        return client.getCid();
    }
    
     public int getPrepaidHours() {
        return client.getRemainingHours();
    }

     public void setPrepaidHours(int i) {
         client.setRemainingHours(i);
    }
        
    public String getName() {
        return client.getCname();
    }



    public String getPhoneNumber() {
        return client.getContactNumber();
    }


    public void setPhoneNumber(String phoneNumber) {
        client.setContactNumber(phoneNumber);
    }

    
    public void addPrepaidHours(int prepaidHours) {
        client.addHours(prepaidHours);
    }
    
    public void usePrepaidHours(int prepaidHours) {
        client.deductHours(prepaidHours);
    }
}
