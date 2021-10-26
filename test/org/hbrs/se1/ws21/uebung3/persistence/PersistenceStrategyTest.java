package org.hbrs.se1.ws21.uebung3.persistence;

import org.hbrs.se1.ws21.uebung2.Container;
import org.hbrs.se1.ws21.uebung2.Member;
import org.hbrs.se1.ws21.uebung2.New_Member;
import org.hbrs.se1.ws21.uebung2.exception.ContainerException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PersistenceStrategyTest {

    PersistenceStrategyMongoDB<Member> persistenceStrategyMongoDB = new PersistenceStrategyMongoDB<>();
    PersistenceStrategyStream<Member> persistenceStrategyStream = new PersistenceStrategyStream<>();
    List<Member> memberList = new ArrayList<>();
    Container container = Container.getContainerInstance();
    Container container2 = Container.getContainerInstance();
    New_Member m1 = new New_Member(1);
    New_Member m2 = new New_Member(2);
    New_Member m3 = new New_Member(3);

    @Test
    void TestaufNull() throws ContainerException {
        container.addMember(m1);
        container2.addMember(m2);
        container2.addMember(m3);

        assertEquals(3, container.size());
    }

    @Test
    void PersistenceStrategyMongoDBTest() {

        assertThrows(java.lang.UnsupportedOperationException.class,()->{
            persistenceStrategyMongoDB.openConnection();
        });

        assertThrows(java.lang.UnsupportedOperationException.class,()->{
            persistenceStrategyMongoDB.closeConnection();
        });

        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        assertThrows(java.lang.UnsupportedOperationException.class, () -> {
            persistenceStrategyMongoDB.save(memberList);
        });

        assertThrows(java.lang.UnsupportedOperationException.class,()->{
            persistenceStrategyMongoDB.load();
        });
    }

    @Test
    void LocationTest() {
        persistenceStrategyStream.setLocation("");
        assertThrows(PersistenceException.class, ()->{ persistenceStrategyStream.save(memberList);});
    }

    @Test
    void SzenarioTest() throws ContainerException {
        assertEquals(0, container.size());

        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);
        assertEquals(3, container.size());
        assertThrows(PersistenceException.class, ()->{container.store();});
        assertEquals(3, container.size());

        container.deleteMember(1);
        container.deleteMember(2);
        container.deleteMember(3);
        assertEquals(0, container.size());

        assertThrows(PersistenceException.class, ()->{
            persistenceStrategyStream.load();
            assertEquals(3, container.size());
        });
    }

}