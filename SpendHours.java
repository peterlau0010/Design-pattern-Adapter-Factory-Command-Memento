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
public class SpendHours implements Command {
    Member mem;
    int hours;
    Caretaker OldCt = new Caretaker();
    Caretaker NewCt = new Caretaker();

    //Caretaker ct = new Caretaker();

    public SpendHours() {

    }

    SpendHours(Member mem,int hours) {
        this.mem=mem;
        this.hours=hours;
    }

    /**
     *
     * @throws Exception
     */
    @Override
    public void execute() throws Exception {
        OldCt.saveAddHours(mem);
        mem.usePrepaidHours(hours);
    }

    public void undo() {
        System.out.println("Spend Hours undo");
        NewCt.saveAddHours(mem);
        OldCt.undo();

    }

    public void redo() {
        System.out.println("Spend Hours redo");
        OldCt.saveAddHours(mem);
        NewCt.undo();
    }

    public String toString() {
        return "Spend Hours :" + mem.getId() + " " + hours;
    }
}
