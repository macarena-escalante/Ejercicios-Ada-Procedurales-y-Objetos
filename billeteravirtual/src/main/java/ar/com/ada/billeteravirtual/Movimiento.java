package ar.com.ada.billeteravirtual;

import java.util.*;

import javax.persistence.*;
/**
 * Movimiento
 */
@Entity
@Table(name= "movimiento")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int movimientoId;
    private Date fechaMovimiento;
    private Coordenada ubicacion;
    private double importe;
    private String tipoDeOperacion;
    private String conceptoDeOperacion;
    private String detalle;
    private int estado;
    private int deUsuario_id;
    private int aUsuario_id;
    private Usuario deUsuario;
    private Usuario aUsuario;
    private Cuenta cuentaDestino;
    private Cuenta cuentaOrigen;
    private int cuentaDestino_id;
    private int cuentaOrigen_id;
    
    
    @ManyToOne
    @JoinColumn(name = "cuenta_id", referencedColumnName = "cuenta_id")
    //@MapsId
    private Cuenta cuenta;





}