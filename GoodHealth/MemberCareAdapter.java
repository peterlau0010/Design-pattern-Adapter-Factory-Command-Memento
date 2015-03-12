/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodHealth;

import GreenFitness.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Peter
 */
public class MemberCareAdapter extends MemberCare {

    ClientControl clientControl;
    
    public MemberCareAdapter() {
      
    }

    public MemberCareAdapter(ClientControl clientControl) {
        super();
        this.clientControl = clientControl;
      
    }

    public Member createMember(String id, String name) {
        return new MemberAdapter(clientControl.createClient(id, name));
    }

    public Member searchchMember(String id) {
        return new MemberAdapter(clientControl.findClient(id));
    }

    public Member removeMember(String id) {
        return new MemberAdapter(clientControl.deleteClient(id));
    }

    public void changePhoneNumber(String id, String newNumber) {
        clientControl.updateContactNumber(id, newNumber);
    }

    public void addPrepaidHours(String id, int hours) {
        clientControl.addHours(id, hours);
    }

    public void usePrepaidHours(String id, int hours) {
        clientControl.deductHours(id, hours);
    }
    
    public Enumeration getMember() {
        return clientControl.getClient();
    }
}
