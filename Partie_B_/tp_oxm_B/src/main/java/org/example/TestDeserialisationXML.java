package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class TestDeserialisationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Relever.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Relever relever = (Relever) unmarshaller.unmarshal(new File("relever.xml"));
        System.out.println(relever.toString());
    }
}
