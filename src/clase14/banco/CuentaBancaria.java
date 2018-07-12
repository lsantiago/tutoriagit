/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase14.banco;

/**
 *
 * @author SantiagoQuiñones
 */
public class CuentaBancaria {
    // atributos
    private int numeroCuenta;
    private String tipo;
    private String propietario;
    private float saldo;
    private boolean estado;

    // métodos especiales
    public CuentaBancaria() {
    }
    
    public CuentaBancaria(int numeroCuenta, String cadena, String propietario, float saldo, boolean estado) {
        this.numeroCuenta = numeroCuenta;
        this.tipo = cadena;
        this.propietario = propietario;
        this.saldo = saldo;
        this.estado = estado;
    }

    
    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String abrirCuenta(String tipo){
        if(tipo.equals("CC")){
            setSaldo(50f);
        }else if(tipo.equals("CA")){
            setSaldo(150f);
        }else{
            return "tipo de cuenta incorreto.";
        }
        
        setTipo(tipo);
        setEstado(true);
        
        return "cuenta abierta correctamente";
    }
    
    public String cerrarCuenta(){
        if(getSaldo() > 0){
            return "cuenta tiene dinero, " + getSaldo();
        }else if(getSaldo() < 0){
            return "cuenta en debito";
        }else{
            setEstado(false);
        }
        
        return "cuenta cerrada correctamente";
    }
    
    public String depositar(float valor){
        if(getEstado()){
            // this.saldo = this.saldo + valor;
            setSaldo(getSaldo() + valor);
        }else{
            return "imposible realizar deposito";
        }
        
        return String.format("deposito realizado en la cuenta de %s", 
                getPropietario());
                
    }
    
    public String retirar(float valor){
        if(getEstado()){
            if(getSaldo() > valor){
                setSaldo(getSaldo() - valor);
            }else{
                return "saldo insuficiente";
            }
        }else{
            return "imposible realizar retiro de cuenta cerrada";
        }
        
        return "retiro realizado en la cuenta de " + getPropietario();
    }
    
    
    public String pagarMensualidad(){
        float valor = 0.0f;
        
        if(getTipo().equals("CC")){
            valor = 12;
        }else if(getTipo().equals("CA")){
            valor = 20;
        }
        
        if(getEstado()){
            if(getSaldo() > valor){
                setSaldo(getSaldo() - valor);
            }else{
                return "saldo insuficiente";
            }
            
            return "pago realizado con éxito";
        }
        
        return "imposible pagar";
    }

    public String estadoActual() {
        return "CuentaBancaria{" + "\nnumeroCuenta=" + numeroCuenta + 
                ", \ntipo=" + tipo + ", \npropietario=" + propietario + 
                ", \nsaldo=" + saldo + ", \nestado=" + estado + '}';
    }
    
    
    
}
