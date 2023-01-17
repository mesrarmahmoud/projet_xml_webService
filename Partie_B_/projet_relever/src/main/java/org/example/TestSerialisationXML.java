package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class TestSerialisationXML {
    public static void main(String[] args) {
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Relever.class);

            Operation op1 = new Operation(typeOperation.DEBIT, new Date(), 9400,"description 1");
            Operation op2 = new Operation(typeOperation.CREDIT, new Date(), 4000,"description 2");
            Operation op3 = new Operation(typeOperation.CREDIT, new Date(), 3400,"description 3");
            Operation op4 = new Operation(typeOperation.DEBIT, new Date(), 500,"description 4");


            Operations operations = new Operations(new Date(2021,01,01),new Date(2021,01,30));
            operations.listOperations.add(op1);
            operations.listOperations.add(op2);
            operations.listOperations.add(op3);
            operations.listOperations.add(op4);

            Relever relever = new Relever("049488847384773849",new Date(),14000.00, operations);

            Marshaller marshaller =jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(relever, new File("relever.xml"));

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }




    }
}
