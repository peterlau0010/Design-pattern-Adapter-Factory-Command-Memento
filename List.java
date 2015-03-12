import GoodHealth.Member;
import java.util.Stack;
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
public class List implements Command {

    Stack<Command> Uhistory;
    Stack<Command> Rhistory;

    public List(Stack<Command> u, Stack<Command> r) {
        Uhistory = u;
        Rhistory = r;
    }

    public void execute() {
          System.out.println("Undo List");
        for (int i = 0; i < Uhistory.size(); i++) {
           
            System.out.println(Uhistory.elementAt(i).toString());
        }
         if(Uhistory.size()==0){
                    System.out.println("Empty");
            }
              System.out.println("Redo List");
        for (int i = 0; i < Rhistory.size(); i++) {
           
            System.out.println(Rhistory.elementAt(i).toString());
        }
         if(Rhistory.size()==0){
                    System.out.println("Empty");
            }
    }

    public void undo() {
    }

    public void redo() {
    }
}
