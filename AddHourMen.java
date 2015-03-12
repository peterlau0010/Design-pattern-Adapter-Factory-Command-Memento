
import GoodHealth.Member;
import GoodHealth.MemberAdapter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author a1
 */
class AddHourMen implements Memento {

    Member m;
    int prepaidHours;

    public AddHourMen(Member m) {
        this.m = m;

        prepaidHours = m.getPrepaidHours();

    }

    @Override
    public void restore() {
        
            
            m.setPrepaidHours(this.prepaidHours);
       
    }

}
