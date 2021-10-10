package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    Container container= new Container();
    Member member;


    @Test
    void addMember() throws ContainerException {
        container.addMember(member);
    }

    @Test
    void deleteMember() {
    }

    @Test
    void dump() {
    }

    @Test
    void size() {
    }

    @Test
    void getID() {
    }
}