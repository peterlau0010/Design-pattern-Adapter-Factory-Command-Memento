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
public class SpendHourFactory implements CommandFactory {

    Vector<Member> members;
    MemberCare membercare;
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    int i;
    int hours;
    String index;
    String spends;
    Member mem;
    @Override
    public Command Create() {
        try {
            System.out.print("Enter index: ");
            index = br.readLine();
            i = Integer.parseInt(index);
            System.out.print("Enter Spends Hours: ");
            spends = br.readLine();
            hours = Integer.parseInt(spends);
            mem = members.elementAt(i);
            if (hours > mem.getPrepaidHours()) {
                throw new Exception();
            }
        } catch (Exception e) {
        }
        return new SpendHours(mem,hours);
    }

    public void setMember(Vector mc) {
        this.members = mc;
    }

    public void setMemberCare(MemberCare mc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMemberCareAdapter(MemberCareAdapter memberCareAdapter) {
        
    }

}
