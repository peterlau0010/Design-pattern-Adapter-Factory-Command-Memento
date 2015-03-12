/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Peter
 */
import GoodHealth.*;
import java.util.*;

public interface CommandFactory {

    public Command Create();

    public void setMemberCare(MemberCare mc);

    public void setMember(Vector v);

    public void setMemberCareAdapter(MemberCareAdapter memberCareAdapter);
}
