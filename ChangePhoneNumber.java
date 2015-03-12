import GoodHealth.Member;
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
public class ChangePhoneNumber implements Command {

    Member mem;
    int index;
    String phone;

    Caretaker OldCt = new Caretaker();
    Caretaker NewCt = new Caretaker();

    public ChangePhoneNumber() {
    }

    ChangePhoneNumber(Member mem, String Num) {
        this.mem = mem;
        phone = Num;

    }

    public void execute() {        
        OldCt.saveCustomer(mem);
        mem.setPhoneNumber(phone);

    }

    public void undo() {
        NewCt.saveCustomer(mem);
        OldCt.undo();

    }

    public void redo() {
        OldCt.saveCustomer(mem);
        NewCt.undo();

    }

    public String toString() {
        return "Change Phone Number " + mem.getId() + " " + phone;
    }
}
