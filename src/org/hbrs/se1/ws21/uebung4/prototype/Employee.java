package org.hbrs.se1.ws21.uebung4.prototype;

public class Employee implements java.io.Serializable, Comparable {

    private String vorname;
    private String name;
    private Integer pid;
    private String abteilung;
    private String expertisen;
    private String rolle;

    public Employee(Integer pid, String vorname, String name, String rolle, String abteilung, String expertisen) {
        this.pid = pid;
        this.name = name;
        this.vorname = vorname;
        this.rolle = rolle;
        this.abteilung = abteilung;
        this.expertisen = expertisen;
    }

    public Employee(){};

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getExpertisen() {
        return expertisen;
    }
    public void setExpertisen(String expertisen){this.expertisen=expertisen;}

    @Override
    public int compareTo(Object o) {
        return 0; // Werte: 0, 1, -1 --> Pid vergleichen!
    }
}

