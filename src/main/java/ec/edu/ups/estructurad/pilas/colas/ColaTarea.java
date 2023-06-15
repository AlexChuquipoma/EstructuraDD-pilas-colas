/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructurad.pilas.colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author RODOLFO
 */
public class ColaTarea<T> {
    
    private Queue<Tarea<T>> colaTareas;

    public ColaTarea() {
        colaTareas = new LinkedList<>();
    }

    public ColaTarea(Queue<Tarea<T>> colaTareas) {
        colaTareas = new LinkedList<>();
    }
    
    public void agregarTarea(Tarea<T> tarea){
        colaTareas.offer(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        return colaTareas.poll();
    }
    
    public boolean estaVacia(){
        return colaTareas.isEmpty();
    }  
}
