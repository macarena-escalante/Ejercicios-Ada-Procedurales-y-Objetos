package ar.com.ada.billeteravirtual;

import java.util.*;

import javax.persistence.*;

/**
 * Billetera
 */
@Entity
@Table(name= "billetera")
public class Billetera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int billetera_id;
    private List<Cuenta> cuentas = new ArrayList<Cuenta>();
    
    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "persona_id")
    //@MapsId
    private Persona persona;

    @OneToMany(mappedBy = "billetera", cascade = CascadeType.ALL)
    private List cuenta;

    public int getbilletera_id() {
        return billetera_id;
    }
}