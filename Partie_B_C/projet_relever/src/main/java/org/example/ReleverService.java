package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.eclipse.persistence.internal.oxm.schema.model.List;

import java.util.Date;

@WebService(serviceName = "ReleverWS")
public class ReleverService {
    @WebMethod(operationName = "Relever")
    public Relever getRelever(@WebParam(name = "RIB") String RIB) {

        Operation op1 = new Operation(typeOperation.DEBIT, new Date(), 9400,"description 1");
        Operations operations = new Operations(new Date(2021,01,01),new Date(2021,01,30));
        operations.listOperations.add(op1);


        return new Relever(RIB, new Date(), 1400.00 , operations);
    }

}
