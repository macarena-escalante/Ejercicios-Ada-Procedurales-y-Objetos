package ar.com.ada.billeteravirtual;

import java.util.*;

import javax.persistence.*;

/**
 * Movimiento
 */
@Entity
@Table(name = "movimiento")
public class Movimiento {
    @Id
    @Column(name = "movimiento_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movimientoId;
    @Column(name="fecha_movimiento")
    private Date fechaMovimiento;
    // private Coordenada ubicacion;
    private double importe;
    @Column(name= "tipo_de_operacion")
    private String tipoDeOperacion;
    @Column(name="concepto_de_operacion")
    private String conceptoDeOperacion;
    private String detalle;
    private int estado;
    @Column(name="de_usuario_id")
    private int deUsuarioId;
    @Column(name="a_usuario_id")
    private int aUsuarioId;
    // private Usuario deUsuario;
    // private Usuario aUsuario;
    // private Cuenta cuentaDestino;
    // private Cuenta cuentaOrigen;
    @Column(name="cuenta_destino_id")
    private int cuentaDestinoId;
    @Column(name="cuenta_origen_id")
    private int cuentaOrigenId;

    @ManyToOne
    @JoinColumn(name = "cuenta_id", referencedColumnName = "cuenta_id")
    // @MapsId
    private Cuenta cuenta;

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoDeOperacion() {
        return tipoDeOperacion;
    }

    public void setTipoDeOperacion(String tipoDeOperacion) {
        this.tipoDeOperacion = tipoDeOperacion;
    }

    public String getConceptoDeOperacion() {
        return conceptoDeOperacion;
    }

    public void setConceptoDeOperacion(String conceptoDeOperacion) {
        this.conceptoDeOperacion = conceptoDeOperacion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    /*
     * public Usuario getDeUsuario() { return deUsuario; }
     * 
     * public void setDeUsuario(Usuario deUsuario) { this.deUsuario = deUsuario; }
     * 
     * public Usuario getaUsuario() { return aUsuario; }
     * 
     * public void setaUsuario(Usuario aUsuario) { this.aUsuario = aUsuario; }
     * 
     * public Cuenta getCuentaDestino() { return cuentaDestino; }
     * 
     * public void setCuentaDestino(Cuenta cuentaDestino) { this.cuentaDestino =
     * cuentaDestino; }
     * 
     * public Cuenta getCuentaOrigen() { return cuentaOrigen; }
     * 
     * public void setCuentaOrigen(Cuenta cuentaOrigen) { this.cuentaOrigen =
     * cuentaOrigen; }
     * 
     * /**
     * 
     * @param movimiento the usuario to set
     */

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;

    }

    /**
     * @return the usuario
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public int getDeUsuarioId() {
        return deUsuarioId;
    }

    public void setDeUsuarioId(int deUsuarioId) {
        this.deUsuarioId = deUsuarioId;
    }

    public int getaUsuarioId() {
        return aUsuarioId;
    }

    public void setaUsuarioId(int aUsuarioId) {
        this.aUsuarioId = aUsuarioId;
    }

    public int getCuentaDestinoId() {
        return cuentaDestinoId;
    }

    public void setCuentaDestinoId(int cuentaDestinoId) {
        this.cuentaDestinoId = cuentaDestinoId;
    }

    public int getCuentaOrigenId() {
        return cuentaOrigenId;
    }

    public void setCuentaOrigenId(int cuentaOrigenId) {
        this.cuentaOrigenId = cuentaOrigenId;
    }

}