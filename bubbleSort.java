
public class bubbleSort {

	 public static void main(String args[]) {
	        int[] v = {33, 12, 93, -8, 3, 6};
	        int aux = 0;
	        int i = 0;

	        System.out.println("Vetor original: ");
	        for (i = 0; i < v.length; i++) {
	            System.out.println(" " + v[i]);
	        }
	        System.out.println(" ");

	        for (i = v.length-1; i > -1; i--) {
	            for (int j = 0; j <= i; j++) {
	                if (v[j] > v[i]) {
	                    aux = v[j];
	                    v[j] = v[i];
	                    v[i] = aux;
	                }
	            }
	        }
	        System.out.println("Vetor organizado: ");
	        for (i = 0; i < v.length; i++) {
	            System.out.println(v[i]);
	}
	}

}
