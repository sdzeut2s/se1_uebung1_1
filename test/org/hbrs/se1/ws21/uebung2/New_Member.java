package org.hbrs.se1.ws21.uebung2;

public class New_Member implements Member{

    Integer id;
    public New_Member(Integer id){
        this.id=id;
    }


    @Override
    public Integer getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Member (ID =" + this.id + ")";
    }
}
