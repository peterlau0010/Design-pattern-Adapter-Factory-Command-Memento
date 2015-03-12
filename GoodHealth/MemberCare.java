/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoodHealth;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Peter
 */
public class MemberCare {

    private String name;
    private String id;
    Vector<Member> member;

    public MemberCare() {
        member = new Vector();
    }

    public Member createMember(String id, String name) {
        Member m = new Member(id, name);
        member.add(m);        
        return m;
    }

    public Member searchchMember(String id) {        
        Enumeration mem = getMember();       
        while (mem.hasMoreElements()) {
            Member m = (Member) mem.nextElement();
            if (m.getId().equals(id)) {
                return m;
            }
        }        
        return null;
    }

    public Member removeMember(String id) {
        int i=0;
       Enumeration mem = getMember();       
        while (mem.hasMoreElements()) {
            i++;
            Member m = (Member) mem.nextElement();
            if (m.getId().equals(id)) {
                member.remove(i);
                return m;
            }
        }        
        return null;
    }

    public void changePhoneNumber(String id, String newNumber) {
        int i = chkMember(id);
        if (i != -1) {
            member.elementAt(i).setPhoneNumber(newNumber);
        }
    }

    public void addPrepaidHours(String id, int hours) {
        int i = chkMember(id);
        if (i != -1) {
            member.elementAt(i).addPrepaidHours(hours);
        }
    }

    public void usePrepaidHours(String id, int hours) {
        int i = chkMember(id);
        if (i != -1) {
            member.elementAt(i).usePrepaidHours(hours);
        }
    }

    public int chkMember(String id) {
        return member.indexOf(id);
    }

    public Enumeration getMember() {
        return member.elements();
    }
}
