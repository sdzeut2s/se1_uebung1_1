package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Container;
import org.hbrs.se1.ws21.uebung2.Member;
import org.hbrs.se1.ws21.uebung2.New_Member;
import org.hbrs.se1.ws21.uebung2.exception.ContainerException;

import java.util.LinkedList;

// Ich habe die Strategy Design Pattern benutzt.

public class Client {

    //Memberobj erzeugen
    public static void main(final String[] ARGS) throws ContainerException {
        final Container c=Container.getContainerInstance();
        Member m1= new New_Member(1);
        Member m2= new New_Member(2);
        Member m3= new New_Member(3);
        Member m4= new New_Member(4);
        //in Container hinzufügen
        c.addMember(m1);
        c.addMember(m2);
        c.addMember(m3);
        c.addMember(m4);

        //auflisten
        LinkedList<Member> mlist=new LinkedList<>();
        mlist.add(m1);
        mlist.add(m2);
        mlist.add(m3);
        mlist.add(m4);
        MemberView memberView = new MemberView();
        memberView.dump(mlist);
    }
}
