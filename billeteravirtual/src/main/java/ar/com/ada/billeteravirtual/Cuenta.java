package ar.com.ada.billeteravirtual;

import java.util.*;

import javax.persistence.*;
/**
 * Cuenta
 */
@Entity
@Table(name= "cuenta")

public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String moneda;
    private double saldo;
    private double saldoDisponible;
   // private String movimiento2;
    private int cuenta_id;

    private List<Movimiento> movimientos = new ArrayList<Movimiento>();

    @ManyToOne
    @JoinColumn(name = "billetera_id", referencedColumnName = "billetera_id")
    //@MapsId
    private Billetera billetera;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List movimiento;
}