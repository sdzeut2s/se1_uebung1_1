package org.hbrs.se1.ws21.uebung2;

import org.hbrs.se1.ws21.uebung2.exception.ContainerException;

import java.util.LinkedList;


public class Container implements Member {

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
            } else {
                return "Diese id gehört zu keinem Member.Bitte geben Sie eine neue id";
            }
        }
            return null;
        }

        public void dump() {

            for(Member member : listemember){
                System.out.println(member.toString());

            }
        }

        public int size(){
        return listemember.size();
        }


    @Override
    public Integer getID() {
        return this.member.getID();
    }

    @Override
    public String toString() {
        return "Member (ID =" + this.member.getID() + ")";
    }

}
