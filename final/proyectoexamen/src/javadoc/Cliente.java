package javadoc;

import javadoc.CuentaBancaria;
import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase representa a un cliente del banco con datos personales y su cuenta bancaria
 * version 1.0. 12/03/2024
 * @author AntonioValeroMaldonado
 */
public class Cliente{
    private String nombre;
    private String apellido;
    private String id;
    private List<CuentaBancaria> cuentas;

    /**
     * Constructor de la clase Cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param id Identificación del cliente.
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * @return El apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente.
     * @param apellido  apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la identificación del cliente.
     * @return La identificación del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece la identificación del cliente.
     * @param id La nueva identificación del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene una copia de la lista de cuentas asociadas al cliente.
     * devuelve copia de la lista de cuentas.
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Agrega una cuenta bancaria a la lista de cuentas.
     * @param cuenta La cuenta bancaria a agregar.
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta); // Agrega la cuenta a la lista de cuentas del cliente.
    }

    /**
     * Cierra una cuenta bancaria del cliente.
     * @param numeroCuenta El número de cuenta.
     * @return true si se cerró la cuenta , false en el otro caso.
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Retorna un formato del producto final del cliente.
     * @return Una cadena del producto final del cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}

