
package proxy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ReleverService", targetNamespace = "http://example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReleverService {


    /**
     * 
     * @param rib
     * @return
     *     returns proxy.Relever
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRelever", targetNamespace = "http://example.org/", className = "proxy.GetRelever")
    @ResponseWrapper(localName = "getReleverResponse", targetNamespace = "http://example.org/", className = "proxy.GetReleverResponse")
    @Action(input = "http://example.org/ReleverService/getReleverRequest", output = "http://example.org/ReleverService/getReleverResponse")
    public Relever getRelever(
        @WebParam(name = "RIB", targetNamespace = "")
        String rib);

}
