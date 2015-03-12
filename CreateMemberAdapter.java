import GoodHealth.Member;
import GoodHealth.MemberCareAdapter;
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
class CreateMemberAdapter implements Command {

    Vector<Member> members;
    MemberCareAdapter memberCare;
    Member mem;

    public CreateMemberAdapter(Vector<Member> members, Member member) {
        this.members = members;
        this.mem = member;
    }

    @Override
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
      public String toString(){
	return "New  "+mem.getId();
}
}
