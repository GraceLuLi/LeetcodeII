
public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		int i = 0;
		int j = 0;
		while(j < A.length){
			if(A[j] != elem){
				A[i++] = A[j++];
			}else{
				j++;
			}
		}
		return i;
	}
}
