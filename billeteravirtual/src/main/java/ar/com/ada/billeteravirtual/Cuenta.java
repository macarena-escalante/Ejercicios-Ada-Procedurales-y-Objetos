package ar.com.ada.billeteravirtual;

import java.util.*;
/**
 * Cuenta
 */
public class Cuenta {

    private String moneda;
    private double saldo;
    private double saldoDisponible;
    private String movimiento;
    private int CuentaId;

    private List<Movimiento> movimientos = new ArrayList<Movimiento>();
}