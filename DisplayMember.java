import GoodHealth.Member;
import GoodHealth.MemberAdapter;
import GoodHealth.MemberCare;
import GoodHealth.MemberCareAdapter;
import GreenFitness.Client;
import GreenFitness.ClientControl;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Peter
 */
public class DisplayMember implements Command {

    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    String id;
    Vector<Member> members;
    MemberCare membercare;
    MemberCareAdapter membercareAdapter;

    DisplayMember(Vector<Member> members, MemberCare membercare, MemberCareAdapter membercareAdapter, String id) {
        this.members = members;
        this.membercare = membercare;
        this.membercareAdapter = membercareAdapter;
        this.id = id;
    }

    @Override
    public void execute() {
        try {
            if (id.equals("*")) {
                Enumeration m = members.elements();
                System.out.println("Member informtion");
                System.out.printf("%-5s %-25s %-15s %-7s %n", "ID", "Name", "Phone Number", "Hours");
                while (m.hasMoreElements()) {
                    Member mem = ((Member) m.nextElement());
                    System.out.printf("%-5s %-25s %-15s %-7s %n", mem.getId(), mem.getName(), mem.getPhoneNumber(), mem.getPrepaidHours());
                }
            } else {
                Member member = null;
                member = membercare.searchchMember(id);

                if (member != null) {
                    System.out.println("Member informtion");
                    System.out.println("ID: " + member.getId());
                    System.out.println("Name: " + member.getName());
                    System.out.println("Phone: " + member.getPhoneNumber());
                    System.out.println("Hours: " + member.getPrepaidHours());
                } else {
                    member = membercareAdapter.searchchMember(id);
                    System.out.println("Member informtion");
                    System.out.println("ID: " + member.getId());
                    System.out.println("Name: " + member.getName());
                    System.out.println("Phone: " + member.getPhoneNumber());
                    System.out.println("Hours: " + member.getPrepaidHours());
                }
            }
        } catch (Exception e) {
            System.out.println("execute " + e.getMessage());
        }
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void redo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
