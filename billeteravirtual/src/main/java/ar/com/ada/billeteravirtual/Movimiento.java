package ar.com.ada.billeteravirtual;
import java.util.*;
/**
 * Movimiento
 */
public class Movimiento {

    private int movimientoId;
    private Date fechaMovimiento;
    private Coordenada ubicacion;
    private double importe;
    private String tipoDeOperacion;
    private String conceptoDeOperacion;
    private String detalle;
    private int estado;
    private int deUsuarioId;
    private int aUsuarioId;
    private Usuario deUsuario;
    private Usuario aUsuario;
    private Cuenta cuentaDestino;
    private Cuenta cuentaOrigen;
    private int cuentaDestinoId;
    private int cuentaOrigenId;
    



}