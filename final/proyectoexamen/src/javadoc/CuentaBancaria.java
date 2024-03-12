package javadoc;



  /**
 * Esta clase representa una cuenta bancaria con sus metodos y constructores
 * @version 1.0. 12/03/2024
 * @author AntonioValeroMaldonado
 */
public class CuentaBancaria {
    /**
     * Campos privados para almacenar la información de la cuenta,
     * Numero de cuenta,Saldo de la cuenta,Propietario de la cuenta
     */
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;
    /**
     * Constructor para inicializar la cuentaBancaria
     * @param numeroCuenta
     * @param saldo
     * @param propietario
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    /**
     * Obitiene el numero de la cuenta.
     * @return el numero de la cuenta
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Establece el numero de la cuenta
     * @param numeroCuenta
     * Crea nuevo numero de cuenta
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * @return el saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo
     * Define el saldo final
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el propietario
     * @return el propietario asignado
     */
    public Cliente getPropietario() {
        return propietario;
    }

    /**
     * Establece el propietario
     * Define el prpietario con sus cambios
     * @param propietario
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    /**
     * Método para depositar dinero en la cuenta
     * @param cantidad
     * Incrementa el dinero de la cuenta
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    /**
     * Metodo para poder retirar dinero de la cuenta
     * @param cantidad
     * @return true si la cantidad retirada es menor que el que hay en la cuenta
     * @return false si la cantidad es mayor que lo que hay en la cuenta
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false; //
    }

    /**
     * Utiliza un metodo llamado toString para documentar el final de la operacion con todo actualizado
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }

    
}
