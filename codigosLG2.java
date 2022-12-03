/*MARIANA CRISTINA SENA SILVA - SP3065677 - 213B*/
/*houve a implemantação das sementes em cada código, como solicitado, através do coamando rnd.setSeed(número da semente), entretando os ódigos abaixo foram as bases
usadas na realizção dos experimentos*/

/*BubbleSort*/
public class BubbleSort {
  public void ordenar(int[] a) {
    for(int i = 0; i < a.length - 1; i++) {
      for(int j = 0; j < v.length - 1 - i; j++) {
        if(a[j] > a[j + 1]) {
          int aux = v[j];
          a[j] = a[j + 1];
          a[j + 1] = aux;
          }
        }
      }
    }
  }
  
  
/*SelectioSort*/
public class SelectionSort{
  public void SelectionSort(int []a){
    int n = a.length;         
    for (int i = 0; i < n-1; i++)
    {
        int x = i;
        int min = a[i];          
        for (int j = i+1; j < n; j++)
        {
            if (a[j] < a[x])
            {
                index = j;
                min = a[j];
            }
        }
        int t = a[x];         
        a[index] = a[i];
        a[i] = t;
    }
  }
}


/*InsertionSort*/
public class InsertionSort{
  public void InsertionSort(int[] a) {
      for (int j = 1; j < a.length; j++) {
         int b = a[j];
         int i = j - 1;
         while (i >= 0 && a[i] > b) {
            a[i+1] = a[i];
            i -= 1;
         }
         a[i+1] = b;
      }
      return a;
    }
}


/*ShellSort*/
public class ShellSort {
	public static void ordenar(int[] a){
	    int i , j , temp, size = a.length;
	    
	    int incremento = 1;
	    while(b < size) {
	        incremento = 3 * b + 1;
	    }
	    while (b > 1) {
	        b = 3;
	        
	        for(i = b; i < size; i++) {
	            temp = a[i];
	            j = i - b;
	            while (j >= 0 && temp < a[j]) {
	                a[j + b] = a[j];
	                j -= b;
	            }
	            a[j + b] = temp;
	        }
	    }	    
	}	
}


/*MergeSort*/
public class MergeSort {

	public static MergeSort(int[] a,int lo,int hi) {
		
		if(lo==hi) {
			int[] ba=new int[1];
			ba[0]=a[lo];
			return ba;
		}
		
		int mid=(lo+hi)/2;
		int a1[]=MergeSort(a,lo,mid);
		int a2[]=MergeSort(a,mid+1,hi);
		return merge(a1,a2);
	}
	
	public static int[] merge(int[] a1,int[] a2) {
		int i=0,j=0,k=0;
		int n=a1.length;
		int m=a2.length;
		int[] a3=new int[m+n];
		while(i<n && j<m) {
			if(a1[i]<a2[j]) {
				a3[k]=a1[i];
				i++;
			}
			else {
				a3[k]=a2[j];
				j++;
			}
			k++;
		}
		
		while(i<n) {
			a3[k]=a1[i];
			i++;
			k++;
		}
		
		while(j<m) {
			a3[k]=a2[j];
			j++;
			k++;
		}
		
		return a3;
		
	  }
  }
  
  
  /*QuickSort*/
 public class QuickSort{
  	private static int QuickSort(int[] vetor, int a, int b) {
		int pivo = vetor[a];
		int i = a + 1;
		while (i <= b) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[b])
				fim--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[b];
				vetor[b] = troca;
				i++;
				b--;
			}
		}
		vetor[a] = vetor[b];
		vetor[b] = pivo;
		return b;
	}
}
