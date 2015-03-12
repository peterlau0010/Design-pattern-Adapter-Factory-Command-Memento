import GoodHealth.Member;
import GoodHealth.MemberCare;
import GoodHealth.MemberCareAdapter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
public class DisplayMemberFactory implements CommandFactory {

    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    String id;
    Vector<Member> members;
    MemberCare membercare;
    MemberCareAdapter membercareAdapter;

    @Override
    public Command Create() {
        try {
            System.out.println("Enter id(* to display all)");
            id = br.readLine();
        } catch (Exception e) {
            System.out.println("execute " + e.getMessage());
        }
        return new DisplayMember(members, membercare, membercareAdapter, id);
    }

    public void setMemberCareAdapter(MemberCareAdapter membercareAdapter) {
        this.membercareAdapter = membercareAdapter;
    }

    public void setMemberCare(MemberCare membercare) {
        this.membercare = membercare;
    }

    public void setMember(Vector mc) {
        this.members = mc;
    }

}
