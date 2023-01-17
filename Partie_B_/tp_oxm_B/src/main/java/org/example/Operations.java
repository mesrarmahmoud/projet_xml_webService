package org.example;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@XmlRootElement
public class Operations {
    @XmlAttribute
    private Date dateDebut ;
    @XmlAttribute
    private Date dateFin;
    @XmlElement
    public List<Operation> listOperations = new ArrayList<>();

    @Override
    public String toString() {
        return "Operations{" +
                "dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", listOperations=" + listOperations +
                '}';
    }

    public Operations() {
    }

    public Operations(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
}
