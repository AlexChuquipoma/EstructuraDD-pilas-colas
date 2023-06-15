/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.estructurad.pilas.colas;

import java.util.Arrays;

/**
 *
 * @author RODOLFO
 */
public class EstructuraDPilasColas {

    public static void main(String[] args) {
        
        //Instancias De Las Clases
        ColaTarea<String> colaTareas = new ColaTarea<>();
        ColaTarea<Integer> colasTareasInt = new ColaTarea<>();
        ColaTarea<String[]> colaTareasArreglo = new ColaTarea<>();
        ColaTarea<int[]> colaTareasArregloEnteros = new ColaTarea<>();
        
        //Clases Pila Tarea
        PilaTarea<Integer> pilasTarea = new PilaTarea<>();
        PilaTarea<String> pilasTareastring = new PilaTarea<>();
        PilaTarea<String[]> pilasTareaarreglo = new PilaTarea<>();
        PilaTarea<int[]> pilasTareaarregloenteros = new PilaTarea<>();
        PilaTarea<ColaTarea> pilasTareaColas = new PilaTarea<>();
        
        
        pilasTareaColas.agregarTarea(new Tarea(111,111));
        System.out.println("Colas Strings");
        
        //Insercion De Tareas a la cola
        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTareas.agregarTarea(new Tarea(5, "Tarea 5"));
        
        //Procesar las Tareas de la Cola<String>
        while(!colaTareas.estaVacia()){
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaProcesada.getId() + tareaProcesada.getAtributo());
        }
        
        System.out.println("Colas Enteros");
        colasTareasInt.agregarTarea(new Tarea(1,2));
        colasTareasInt.agregarTarea(new Tarea(2,3));
        colasTareasInt.agregarTarea(new Tarea(3,4));
        colasTareasInt.agregarTarea(new Tarea(4,5));
        colasTareasInt.agregarTarea(new Tarea(5,6));
        
        while(!colasTareasInt.estaVacia()){
            Tarea<Integer> tareapro = colasTareasInt.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareapro.getId() + tareapro.getAtributo());
        }        
        
        System.out.println("Colas de arreglos strings");
        colaTareasArreglo.agregarTarea(new Tarea(1,new String[]{"a","b"}));
        colaTareasArreglo.agregarTarea(new Tarea(2,new String[]{"c","d"}));
        colaTareasArreglo.agregarTarea(new Tarea(3,new String[]{"e","f"}));
        
        while(!colaTareasArreglo.estaVacia()){
            Tarea<String[]> tareaproc = colaTareasArreglo.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaproc.getId() + Arrays.toString(tareaproc.getAtributo()));
        } 
        
        
        System.out.println("Cola de arreglos enteros");
        colaTareasArregloEnteros.agregarTarea(new Tarea(1,new int[]{10,40}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(2,new int[]{20,50}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(3,new int[]{30,60}));
        
        while(!colaTareasArregloEnteros.estaVacia()){
            Tarea<int[]> tareaproce = colaTareasArregloEnteros.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaproce.getId() + Arrays.toString(tareaproce.getAtributo()));
        }
        
        System.out.println("Pilas de enteros");
        
        //Insercion de tareas a la pila
        pilasTarea.agregarTarea(new Tarea(1,1));
        pilasTarea.agregarTarea(new Tarea(2,2));
        pilasTarea.agregarTarea(new Tarea(3,3));
        pilasTarea.agregarTarea(new Tarea(4,4));
        pilasTarea.agregarTarea(new Tarea(5,5));
        
        while(!pilasTarea.estaVacia()){
            Tarea<Integer> tare = pilasTarea.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tare.getId() + tare.getAtributo());
        }
        
        System.out.println("Pilas strings");
        pilasTareastring.agregarTarea(new Tarea(1,"Pila"));
        pilasTareastring.agregarTarea(new Tarea(2,"Pila1"));
        pilasTareastring.agregarTarea(new Tarea(3,"Pila2"));
        
        
        while(!pilasTareastring.estaVacia()){
            Tarea<String> tarea = pilasTareastring.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea.getId() + tarea.getAtributo());
        }
        
        System.out.println("Pilas de arreglos strings");
        pilasTareaarreglo.agregarTarea(new Tarea(1,new String[]{"c","z"}));
        pilasTareaarreglo.agregarTarea(new Tarea(2,new String[]{"h","b"}));
        pilasTareaarreglo.agregarTarea(new Tarea(3,new String[]{"a","e"}));
        
        while(!pilasTareaarreglo.estaVacia()){
            Tarea<String[]> tarea1 = pilasTareaarreglo.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea1.getId() + Arrays.toString(tarea1.getAtributo()));
        }
        
        System.out.println("Pilas de arreglos enteros");
        
        pilasTareaarregloenteros.agregarTarea(new Tarea(1,new int[]{66,77}));
        pilasTareaarregloenteros.agregarTarea(new Tarea(2,new int[]{88,55}));
        pilasTareaarregloenteros.agregarTarea(new Tarea(3,new int[]{99,11}));
        
        while(!pilasTareaarregloenteros.estaVacia()){
            Tarea<int[]> tarea2 = pilasTareaarregloenteros.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea2.getId() + Arrays.toString(tarea2.getAtributo()));
        }
        
        pilasTareaColas.agregarTarea(new Tarea(1,colaTareas));
        
        while(!pilasTareaColas.estaVacia()){
            Tarea<ColaTarea> tarea3 = pilasTareaColas.procesarTarea();
            
            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea3.getId() + tarea3.getAtributo());
        }
    }
}

