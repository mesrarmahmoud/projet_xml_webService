
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetRelever_QNAME = new QName("http://example.org/", "getRelever");
    private final static QName _GetReleverResponse_QNAME = new QName("http://example.org/", "getReleverResponse");
    private final static QName _Operation_QNAME = new QName("http://example.org/", "operation");
    private final static QName _Operations_QNAME = new QName("http://example.org/", "operations");
    private final static QName _Relever_QNAME = new QName("http://example.org/", "relever");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRelever }
     * 
     * @return
     *     the new instance of {@link GetRelever }
     */
    public GetRelever createGetRelever() {
        return new GetRelever();
    }

    /**
     * Create an instance of {@link GetReleverResponse }
     * 
     * @return
     *     the new instance of {@link GetReleverResponse }
     */
    public GetReleverResponse createGetReleverResponse() {
        return new GetReleverResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     * @return
     *     the new instance of {@link Operations }
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link Relever }
     * 
     * @return
     *     the new instance of {@link Relever }
     */
    public Relever createRelever() {
        return new Relever();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelever }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRelever }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getRelever")
    public JAXBElement<GetRelever> createGetRelever(GetRelever value) {
        return new JAXBElement<>(_GetRelever_QNAME, GetRelever.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReleverResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReleverResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getReleverResponse")
    public JAXBElement<GetReleverResponse> createGetReleverResponse(GetReleverResponse value) {
        return new JAXBElement<>(_GetReleverResponse_QNAME, GetReleverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operations }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "operations")
    public JAXBElement<Operations> createOperations(Operations value) {
        return new JAXBElement<>(_Operations_QNAME, Operations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Relever }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Relever }{@code >}
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "relever")
    public JAXBElement<Relever> createRelever(Relever value) {
        return new JAXBElement<>(_Relever_QNAME, Relever.class, null, value);
    }

}
