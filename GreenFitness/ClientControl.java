/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GreenFitness;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Peter
 */
public class ClientControl {

    private String cid;
    private String cname;
    Vector<Client> client;

    public ClientControl(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
        client = new Vector();
    }

    public ClientControl() {
        client = new Vector();
    }

    public Client createClient(String cid, String cname) {
        Client c = new Client(cid, cname);
        client.add(c);
        return c;
    }

    public Client findClient(String id) {
        Enumeration mem = getClient();
        while (mem.hasMoreElements()) {            
            Client c = (Client) mem.nextElement();
            if (c.getCid().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public Client deleteClient(String id) {
                int i=0;
       Enumeration mem = getClient();       
        while (mem.hasMoreElements()) {
            i++;
            Client c = (Client) mem.nextElement();
             if (c.getCid().equals(id)) {
                client.remove(i);
                return c;
            }
        }        
        return null;
    }

    public void updateContactNumber(String id, String newNumber) {
        int i = chkClient(id);
        if (i != -1) {
            client.elementAt(i).setContactNumber(newNumber);
        }

    }

    public void addHours(String id, int hours) {
        int i = chkClient(id);
        if (i != -1) {
            client.elementAt(i).addHours(hours);
        }
    }

    public void deductHours(String id, int hours) {
        int i = chkClient(id);
        if (i != -1) {
            client.elementAt(i).deductHours(hours);
        }
    }

    public int chkClient(String id) {
        return client.indexOf(id);
    }

    public Enumeration getClient() {
        return client.elements();
    }
}
