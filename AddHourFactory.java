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
public class AddHourFactory implements CommandFactory {

    Vector<Member> members;
    Member member;
    int intIndex;
    int hours;
    String index;
    String Add;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    MemberCare membercare;

    @Override
    public Command Create() {
        try {
            System.out.print("Enter index: ");
            index = br.readLine();
            intIndex = Integer.parseInt(index);
            System.out.print("Enter Added Hours: ");
            Add = br.readLine();
            hours = Integer.parseInt(Add);
            member = members.elementAt(intIndex);
        } catch (Exception e) {
            System.out.println("*** " + e.getMessage());
        }
        return new AddHour(member,hours);
    }

    public void setMember(Vector mc) {
        this.members = mc;
    }

    public void setMemberCare(MemberCare mc) {
        this.membercare = mc;
    }

    @Override
    public void setMemberCareAdapter(MemberCareAdapter memberCareAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
