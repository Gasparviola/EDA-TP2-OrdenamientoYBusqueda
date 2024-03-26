
import java.util.Random;

//Ejercicio 1
//Definir una clase ordenamiento que contenga el atributo datos (un array de
//enteros) en el cual se agregarán los métodos:
//Carga(): que llena el arreglo con 10000 números aleatorios.
//Muestra()
//bubbleSort()
//insertionSort()
//shellSort()
//El método main() de la clase principal, tiene que crear un objeto de la clase
//ordenamiento e invocar a los métodos y mostrar el arreglo antes y después de
//ordenar.

public class Ordenamiento {
        private int[] datos;
        
        public Ordenamiento(){
            datos = new int[10000];
        }
        
        public void carga() {
            //Generamos numeros unicos, que no se repitan
            Random rand = new Random();
            boolean[] usado = new boolean[10000];
                for (int i = 0; i < 10000; i++) {
                // datos[i] = rand.nextInt(10000); // Llena el arreglo con números aleatorios entre 0 y 9999 Pero pueden ser repetidos
                    int num;
                    do{
                        num = rand.nextInt(10000) + 1; // Genera números aleatorios entre 1 y 10000
                    }while(usado[num - 1]); // Si el número ya ha sido usado, genera uno nuevo
                datos[i] = num;
                usado[num - 1] = true;
            }
         }
        
        public void muestra() {
            for (int i = 0; i < datos.length; i++) {
                System.out.print(datos[i] + ", ");
            }
            System.out.println();
        }
        
        public void bubbleSort() {
            int n = datos.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (datos[j] > datos[j + 1]) {
                        int temp = datos[j];
                        datos[j] = datos[j + 1];
                        datos[j + 1] = temp;
                    }
                }
            }
        }
        
        public void insertionSort() {
            int n = datos.length;
                for (int i = 1; i < n; ++i) {
                    int key = datos[i];
                    int j = i - 1;
                    while (j >= 0 && datos[j] > key) {
                        datos[j + 1] = datos[j];
                        j = j - 1;
                    }
                    datos[j + 1] = key;
                }
        }
        
        public void shellSort() {
            int n = datos.length;
                for (int gap = n / 2; gap > 0; gap /= 2) {
                    for (int i = gap; i < n; i += 1) {
                        int temp = datos[i];
                        int j;
                        for (j = i; j >= gap && datos[j - gap] > temp; j -= gap)
                            datos[j] = datos[j - gap];
                        datos[j] = temp;
                    }
                }
        }
                      
        //Ejercicio 2
        //Agregue 2 métodos busquedaBinari() y busquedaLineal()
        
        public int busquedaBinaria(int elemento) {
            int inicio = 0;
            int fin = datos.length - 1;
                while (inicio <= fin) {
                    int medio = inicio + (fin - inicio) / 2;
                    if (datos[medio] == elemento) {
                        return medio; // Elemento encontrado
                    } else if (datos[medio] < elemento) {
                        inicio = medio + 1; // El elemento está en la mitad derecha
                    } else {
                        fin = medio - 1; // El elemento está en la mitad izquierda
                    }
                }
            return -1; // Elemento no encontrado
        }

            public int busquedaLineal(int elemento) {
                for (int i = 0; i < datos.length; i++) {
                    if (datos[i] == elemento) {
                        return i; // Elemento encontrado
                    }
                }
                return -1; // Elemento no encontrado
            }
                 
}
