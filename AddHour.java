import GoodHealth.Member;
import java.util.*;
import java.io.*;

public class AddHour implements Command {

    Vector<Member> members;
    Member member;
    int index;
    int hours;
    Caretaker OldCt = new Caretaker();
    Caretaker NewCt = new Caretaker();

    //Caretaker ct = new Caretaker();
    public AddHour() {
    }

    public AddHour(Member member, int hours) {
        this.member = member;
        this.hours = hours;
    }

    public void execute() throws Exception {
        member.addPrepaidHours(hours);
        OldCt.saveAddHours(member);
    }

    public void undo() {
        System.out.println("Add Hours undo");
        NewCt.saveAddHours(member);
        OldCt.undo();

    }

    public void redo() {

        System.out.println("Add Hours redo");
        OldCt.saveAddHours(member);
        NewCt.undo();
    }

    public String toString() {
        return "Add  hours :" + member.getId() + " " + hours;
    }
}
