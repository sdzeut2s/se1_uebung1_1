package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.InvalidApplicationException;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    Container container= new Container();
    Member m1= new New_Member(1);
    Member m2= new New_Member(2);
    Member m3= new New_Member(1);

    Member member;


    @Test
    void addMember() throws ContainerException {
        container.addMember(m1);
        container.addMember(m2);

        assertThrows(ContainerException.class, ()-> {
            container.addMember(m3);
        });
        container.deleteMember(2);
        container.deleteMember(5);

        assertEquals(1, container.size());
    }

    @Test
    void deleteMember() {
        container.deleteMember(2);
    }

    @Test
    void dump() {
    }

    @Test
    void size() {
        assertEquals(0, container.size());
    }


}