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
public class CustomerMem implements Memento{
Member m;
     String id;
     int prepaidHours;
     String name;
     String phoneNumber;
	
public CustomerMem(Member m){
this.m=m;

phoneNumber=m.getPhoneNumber();
	
		
}

public void restore(){
m.setPhoneNumber(this.phoneNumber);


}

}
