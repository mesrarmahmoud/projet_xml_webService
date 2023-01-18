package org.example;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@XmlRootElement(name = "relever")
@XmlAccessorType(XmlAccessType.FIELD)

public class Relever {
    @XmlAttribute
    private String RIB;
    @XmlElement
    private Date dateRelever;
    @XmlElement
    private Double solde;
    @XmlElement
    private Operations operations;
    public Relever() {
    }

    public Relever(String RIB, Date dateRelever, Double solde, Operations operations) {
        this.RIB = RIB;
        this.dateRelever = dateRelever;
        this.solde = solde;
        this.operations = operations;
    }

    public String getRIB() {
        return RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public Date getDateRelever() {
        return dateRelever;
    }

    public void setDateRelever(Date dateRelever) {
        this.dateRelever = dateRelever;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "Relever{" +
                "RIB='" + RIB + '\'' +
                ", dateRelever=" + dateRelever +
                ", solde=" + solde +
                ", operations=" + operations +
                '}';
    }
}