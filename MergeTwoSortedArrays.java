public class MergeTwoSortedArrays{
    public void merge(int A[], int m, int B[], int n) {
        int len;
        len = m+n;
        int aindex = m-1;
        int bindex = n-1;
        int i=len-1;
        while(i>=0)
        {
            if(aindex<0)
            {
                A[i--]=B[bindex--];
            }
            else if(bindex<0)
            {
                A[i--]=A[aindex--];
            }
            else if(A[aindex]>B[bindex])
            {
                A[i--]=A[aindex--];
            }
            else if(A[aindex]<B[bindex])
            {
                A[i--]=B[bindex--];
            }
            else if(A[aindex]==B[bindex])
            {
                A[i--]=A[aindex--];
                A[i--]=B[bindex--];
            }
            
        }
        
        
    }
}
