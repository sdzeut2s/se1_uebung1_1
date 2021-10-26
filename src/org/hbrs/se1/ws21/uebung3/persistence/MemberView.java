package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Member;

import java.util.LinkedList;

public class MemberView {

    public void dump(LinkedList<Member> listemember) {

        for(Member member : listemember){
            System.out.println(member.toString());

        }
    }
}
