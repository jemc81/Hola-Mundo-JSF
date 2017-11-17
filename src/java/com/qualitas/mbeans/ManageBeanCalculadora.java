package com.qualitas.mbeans;

@javax.faces.bean.ManagedBean
public class ManageBeanCalculadora {

    private int numero1;
    private int numero2;
    private int resultado;
    
    public ManageBeanCalculadora() {
    }
    
    public String metodoNavegacion(){
        resultado = numero1 + numero2;
        return "resultado";
    }
    
    /**
     * @return the numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
