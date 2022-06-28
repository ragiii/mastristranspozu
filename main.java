public class Matris {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        int[][] d=new int[2][3];
    
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            
        }

        for(int i=0; i<d.length;i++)
        {
            for(int j=0; j<d[i].length; j++){
                d[i][j]=a[j][i];
                System.out.print(d[i][j] + " ");
            }
            
            
        }
        System.out.println();
        
    }
   
    
}
