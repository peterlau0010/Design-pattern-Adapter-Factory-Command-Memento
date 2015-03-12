
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
public class CreatreMemberAdapterFactory implements CommandFactory{
    MemberCare membercare;
    
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    String line;
    String company = "";
    Member member;
     
    Vector<Member> members;
    
    @Override
    public Command Create() {
        try {
            System.out.print("Enter id, name, phone number, hours:");
            line = br.readLine();
            String[] parts = line.split(",");              
                member = membercare.createMember(parts[0], parts[1]);
                member.setPhoneNumber(parts[2]);
                member.addPrepaidHours(Integer.parseInt(parts[3]));
                System.out.print("Created new member record");
            

        } catch (Exception e) {
            System.out.println("Create " + e.getMessage());
        }        
        return new CreateMemberAdapter(members,member);
    }

    
       public void setMemberCare(MemberCare mc){
        this.membercare=mc;
    }

    @Override
    public void setMember(Vector v) {
        members=v;
    }

    @Override
    public void setMemberCareAdapter(MemberCareAdapter memberCareAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
