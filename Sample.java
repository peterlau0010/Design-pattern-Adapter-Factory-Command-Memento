import GoodHealth.Member;
import GoodHealth.*;
import GreenFitness.Client;
import GreenFitness.ClientControl;
import java.awt.Shape;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
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
public class Sample {

    public static void main(String[] args) {
        Vector<Member> member = new Vector<Member>();
        // Stack<Command> history = new Stack<Command>();
        InputStreamReader is = new InputStreamReader(System.in);
        Stack<Command> Uhistory = new Stack<Command>();
        Stack<Command> Rhistory = new Stack<Command>();

        BufferedReader br = new BufferedReader(is);
        System.out.println("GrantFiness Control System");
        MemberCareAdapter memberCareAdapter = new MemberCareAdapter(new ClientControl());
        MemberCare memberCare = new MemberCare();
        while (true) {
            try {

                System.out.println("n = create member, d = diplay member details, a = add hours, s = spend hours,");
                System.out.println("c = change phone number, u = undo, r= redo, l = list undo/redo, q = quit system");
                System.out.println("[n|d|a|s|c|u|r|l|q]\nPlease enter command:");
                String line = br.readLine();
                Command c;
                CommandFactory f;

                switch (line) {
                    case "n":
                        String company = "";
                        System.out.print("Enter company code(gh/gf): ");
                        company = br.readLine();
                        company = company.toUpperCase();
                        if (company.equals("GH")) {
                            f = new CreateMemberFactory();
                            f.setMember(member);
                            f.setMemberCare(memberCare);
                            c = f.Create();
                            c.execute();
                            Uhistory.push(c);
                        } else if (company.equals("GF")) {
                            f = new CreatreMemberAdapterFactory();
                            f.setMember(member);
                            f.setMemberCare(memberCareAdapter);
                            c = f.Create();
                            c.execute();
                            Uhistory.push(c);
                        }

                        break;
                    case "d":
                         f = new DisplayMemberFactory();
                            f.setMember(member);
                            f.setMemberCare(memberCare);
                            f.setMemberCareAdapter(memberCareAdapter);
                            c = f.Create();
                            c.execute();

                        break;
                    case "c":
                        f = new ChangePhoneNumberFactory();
                        f.setMember(member);
                        f.setMemberCare(memberCareAdapter);
                        c = f.Create();
                        c.execute();
                        Uhistory.push(c);
                        break;
                    case "a":
                        f = new AddHourFactory();
                        f.setMember(member);
                        f.setMemberCare(memberCareAdapter);
                        c = f.Create();
                        c.execute();
                        Uhistory.push(c);
                        break;
                    case "s":
                        try {
                            f = new SpendHourFactory();
                            f.setMember(member);
                            f.setMemberCare(memberCareAdapter);
                            c = f.Create();
                            c.execute();
                            Uhistory.push(c);
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid number of hours (member’s hours < hours to be spent). ");
                        }
                    case "r":
                        c = Rhistory.pop();
                        Uhistory.push(c);
                        c.redo();
                        break;
                    case "u":
                        c = Uhistory.pop();
                        Rhistory.push(c);
                        c.undo();
                        break;
                    case "l":
                        c = new List(Uhistory, Rhistory);
                        c.execute();
                        break;
                    case "asd":
                        break;
                }

            } catch (Exception e) {
                System.out.println("Main :" + e.getMessage());
            }
            System.out.println();
        }
    }
}
