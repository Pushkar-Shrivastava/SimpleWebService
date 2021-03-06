package com.example.newwebservice;

import javax.persistence.*;

@Entity
@Table(name= "employee")
@NamedStoredProcedureQueries(value=
        {
        @NamedStoredProcedureQuery(
                name= "procedure-one",
                procedureName= "SpEmployeefindAll"
        ),
        @NamedStoredProcedureQuery(
                name= "procedure-two",
                procedureName= "SpEmployeefindByDepartment",
                parameters= {
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "emp_department", type= String.class)
        }),
        @NamedStoredProcedureQuery(
                name= "procedure-third",
                procedureName= "SpEmployeefindCountByDesignation",
                parameters= {
                @StoredProcedureParameter(mode= ParameterMode.IN, name= "emp_designation", type= String.class),
                @StoredProcedureParameter(mode= ParameterMode.OUT, name= "designation_count", type= Integer.class)
        })

})
public class Employee {
    @Id
    private int eid;
    private String ename;
    private String edesig;
    private String edept;
    private int esal;


    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEdesig() {
        return edesig;
    }

    public void setEdesig(String edesig) {
        this.edesig = edesig;
    }

    public String getEdept() {
        return edept;
    }

    public void setEdept(String edept) {
        this.edept = edept;
    }

    public int getEsal() {
        return esal;
    }

    public void setEsal(int esal) {
        this.esal = esal;
    }
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", edesig=" + edesig + ", edept=" + edept + ", esal="
                + esal + "]";
    }
}
