package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;
import org.hbrs.se1.ws21.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws21.uebung3.persistence.PersistenceStrategyStream;

import java.util.LinkedList;
import java.util.List;


public class Container  {

    private static final Container containerInstance =new Container();
     PersistenceStrategyStream<Member> pStream= new PersistenceStrategyStream<>();


    private Container(){

    }

    public static Container getContainerInstance() {
        return containerInstance;
    }

    LinkedList<Member> listemember = new LinkedList<>();
    private Member member;


    public void addMember(Member member) throws ContainerException {
        for (int i = 0; i < listemember.size(); i++){
            if (member.getID().equals(listemember.get(i).getID())) {
                throw new ContainerException(member);
            }
    }
        listemember.add(member);
    }


    public String deleteMember(Integer id) {

        // pour un element de Typ Member qui est dans la liste imprime tous les members
        for (Member member : listemember) {
            if (id.equals(member.getID())) {
                listemember.remove(member);
                return id + "gelöscht";
            }
        }
                return "Diese id gehört zu keinem Member.Bitte geben Sie eine neue id";

        }



        public int size(){
        return listemember.size();
        }

    public void store() throws PersistenceException {
        pStream.save(listemember);
    }

    public List<Member> getCurrentList(){
        return listemember;
    }




}
