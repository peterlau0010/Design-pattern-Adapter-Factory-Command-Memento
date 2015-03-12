import GoodHealth.*;
import GreenFitness.*;
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
public class CreateMember implements Command {

    
    Vector<Member> members;
    MemberCareAdapter memberCare;
    Member mem;
    public CreateMember(Vector<Member> ms,Member m) {
        this.members = ms;
        this.mem=m;
    }

    public void execute() {
        members.add(mem);    
    }

    @Override
    public void undo() {
        members.remove(mem);
    }
    public void redo(){
     members.add(mem);
    }
    public MemberCareAdapter getMemberCare() {
        return memberCare;
    }
   public String toString(){
	return "New  "+mem.getId();
}
}
