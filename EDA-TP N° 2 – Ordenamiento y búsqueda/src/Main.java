
public class Main {

    public static void main(String[] args) {
        
            Ordenamiento ordenamiento = new Ordenamiento();
            
            System.out.println("Arreglo antes de ordenar: ");
            ordenamiento.carga();
            ordenamiento.muestra();
            System.out.println("");
            
            // Ordenamos usando bubble sort
            long startTime = System.nanoTime();
            ordenamiento.bubbleSort();
            long endTime = System.nanoTime();
            System.out.println("Tiempo de demora Bubble Sort: " + (endTime - startTime));
            System.out.println("Arreglo despues de ordenar usando BubbleSort: ");
            ordenamiento.muestra();
            System.out.println("");
            
            // Restauramos el arreglo a su estado original
            ordenamiento.carga();
            
            // Ordenamos usando Insertion Sort
            long startTime2 = System.nanoTime();
            ordenamiento.insertionSort();
            long endTime2 = System.nanoTime();
            System.out.println("Tiempo de demora Insertion Sort: " + (endTime2 - startTime2));  
            System.out.println("Arreglo despues de ordenar usando Insertion Sort:");
            ordenamiento.muestra();
            System.out.println("");
            
        
            // Restauramos el arreglo a su estado original
            ordenamiento.carga();
            
            // Ordenamos usando Shell Sort
            long startTime3 = System.nanoTime();
            ordenamiento.shellSort();
            long endTime3 = System.nanoTime();
             System.out.println("Tiempo de demora Shell Sort: " + (endTime3 - startTime3));
            System.out.println("Arreglo despues de ordenar con Shell Sort:");
            ordenamiento.muestra();
            
            // Prueba de búsqueda binaria
            System.out.println("");
            System.out.println("Busqueda Binaria:");
            int elementoABuscar = 35;// Poner un numero que desees buscar en el arreglo
            
            int indiceBinario = ordenamiento.busquedaBinaria(elementoABuscar);
            if(indiceBinario != - 1){
                System.out.println("El elemento " + elementoABuscar + " se encuentra en el indice: " + indiceBinario);
            }else{
                System.out.println("El elemento " + elementoABuscar + " no se  encontro en el arreglo");
            }
            
            // Prueba de búsqueda lineal
            System.out.println("");
            System.out.println("Busqueda Lineal:");
            
            int indiceLineal = ordenamiento.busquedaLineal(elementoABuscar);
            if(indiceLineal != - 1){
                System.out.println("El elemento " + elementoABuscar + " se encuentra en el indice: " + indiceLineal);
            }else{
                System.out.println("El elemento " + elementoABuscar + " no se encontro en el arreglo");
            }
            
            
            
    }
    
}
