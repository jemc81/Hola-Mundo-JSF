package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

@javax.faces.bean.ManagedBean
public class ManageBeanLista {
    
    private List<Cliente> lista;
    private int numeroElementos;

    public ManageBeanLista() {
    }
    @PostConstruct
    public void inicializar(){
       lista = new ArrayList<>();
       lista.add(new Cliente("Patricio Jauregui","poliza 01","Nissan",2018));
       lista.add(new Cliente("Tomas Denver","poliza 02","Ford",2017));
       lista.add(new Cliente("Washington Sousa","poliza 03","Zakura",2011));
       lista.add(new Cliente("Maximo Decimomeridio","poliza 04","Audi",2007));
       lista.add(new Cliente("Wilson Tabares","poliza 05","Volkswagen",2000));
    }
    
    public String navegar(){
        return "lista";
    }    

    /**
     * @return the lista
     */
    public List<Cliente> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }
    
    /**
     * @return the numeroElementos
     */
    public int getNumeroElementos() {
        numeroElementos = lista.size();
        return numeroElementos;
    }

    /**
     * @param numeroElementos the numeroElementos to set
     */
    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }
}
