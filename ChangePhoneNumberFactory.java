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
public class ChangePhoneNumberFactory implements CommandFactory {
    Vector<Member> members;
    Member mem;
    MemberCare membercare;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    int i;
    String index;
    int hours;
    String Num;

    @Override
    public Command Create() {
        try {
            System.out.print("Enter index: ");
            index = br.readLine();
            i = Integer.parseInt(index);
            System.out.print("Enter New Phone Number: ");
            Num = br.readLine();
            mem = members.elementAt(i);
        } catch (Exception e) {
            System.out.println("*** " + e.getMessage());
        }
        return new ChangePhoneNumber(mem,Num);
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
