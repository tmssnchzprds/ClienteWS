
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para suma complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suma"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suma", propOrder = {
    "n1",
    "n2"
})
public class Suma {

    protected int n1;
    protected int n2;

    /**
     * Obtiene el valor de la propiedad n1.
     * 
     */
    public int getN1() {
        return n1;
    }

    /**
     * Define el valor de la propiedad n1.
     * 
     */
    public void setN1(int value) {
        this.n1 = value;
    }

    /**
     * Obtiene el valor de la propiedad n2.
     * 
     */
    public int getN2() {
        return n2;
    }

    /**
     * Define el valor de la propiedad n2.
     * 
     */
    public void setN2(int value) {
        this.n2 = value;
    }

}
