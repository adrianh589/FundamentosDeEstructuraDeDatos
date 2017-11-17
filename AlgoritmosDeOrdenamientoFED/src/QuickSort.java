public class QuickSort {
        
        public static void main(String[] args) {
        	int[] numbers = {4,6,1,2,98,4,24};
        	int pivote;
        	int aux;
        	
        	for(int izq=0; izq<numbers.length;izq++) {
        		pivote=numbers[izq];
        		for(int der =izq + 1; der<numbers.length;der++) {
        			if(numbers[der]<numbers[izq]) {
        				aux=numbers[der];
        				numbers[der]=numbers[izq];
        				numbers[izq]=aux;
        			}
        		}
        	}
        	
        	for(int i =0;i<numbers.length;i++) {
        	System.out.print(numbers[i]+" ");
        	}
        }
        
}