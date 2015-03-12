/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
import GoodHealth.Member;
import java.util.*;

public class Caretaker {

    Stack<Memento> undoList = new Stack();
    Memento Mt;

    public Caretaker() {

    }

  

    public void saveAddHours(Member c) {
        Mt = new AddHourMen(c);
       

        undoList.push(Mt);
    }

    public void saveCustomer(Member c) {
        Mt = new CustomerMem(c);
        undoList.push(Mt);
    }

    public void undo() {
        Mt = undoList.pop();
        Mt.restore();
    }

}
