/**
 * Declaration of Two Dimenstional Array - 
 * int [][]a = new int[4][5]
 * 
 *        _______________        a[i][0]  a[i][1] a[i][1] a[i][3] a[i][4]
 *       |      []a[0] --|------>  []      []      []       []      []
 *       |      []a[1] --|------>  []      []      []       []      [] 
 * a---> |      []a[2] --|------>  []      []      []       []      []  
 *       |      []a[3] --|------>  []      []      []       []      [] 
 *       |_______________|
 */         

/**
 * Declaration of Two Dimenstional Array - 
 * int [][]a = new int[4][]
 * 
 *        _______________        
 *       |      []a[0] --|------>  null
 *       |      []a[1] --|------>  null
 * a---> |      []a[2] --|------>  null    a[i][0] -> is invalid syntax error
 *       |      []a[3] --|------>  null
 *       |_______________|
 */         

/**
 * Declaration of Two Dimenstional Array - 
 * int [][]a = new int[4][]
 * a[0] = new int[8]
 * a[2] = new int[4]
 * 
 *        _______________        a[i][0]  a[i][1] a[i][2] a[i][3] a[i][4] a[i][5]  a[i][6] a[i][7]
 *       |      []a[0] --|------>  []      []      []       []      []       []      []      []       
 *       |      []a[1] --|------>  null
 * a---> |      []a[2] --|------>  []      []      []       []      []  
 *       |      []a[3] --|------>  null
 *       |_______________|
 */         




public class TwoDimenstionalArray
{
    public static void main(String args[]){
        // int[][] arr = new int[4][5];
        // int arr1[][] = new int[3][4];

        /**
         * int [][]a = new int[][]; // this is an error
         * int [][]a = new int[][4]; // this is an error
         * int [][]a = new int[4][]; // this is not an error
         */

        // int [][]a = new int[4][];
        // a[0] = new int[5];
        // a[1] = new int[5];
        // a[2] = new int[5];
        // a[3] = new int[8];

        // a[0][0] = 0;
        // a[3][7] = 1;
        // System.out.println(a[0][0]);
        // System.out.println(a[3][7]);


        /** Initialization of 2d Array -  */
        // int [][]a = new int[][]{{1,2},{3,4},{5,6},{6,7}};
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.println(a[i][j]);
        //     }
        // }


        // int [][]a = new int[4][];
        // int [][]b = null;
        // int []c = null;
        // b = new int[4][];
        // b[0] = new int[6];

        // System.out.println(a[0]);
        // System.out.println(b);
        // System.out.println(b[0]);
        // System.out.println(b[1]);

        // System.out.println(a[0][0]);

        // int [][]a = new int[4][];
        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);

        int [][]a = new int[4][];
        a[0] = new int[1];
        a[1] = new int[1];
        a[2] = new int[1];
        a[3] = new int[1];
        a[0] = new int[5];
        a[1] = new int[10];
        a[2] = new int[20];
        a[3] = new int[100];
        System.out.println("Length => "+a.length);
        System.out.println("a[0] Length => "+a[0].length);
        System.out.println("a[1] Length => "+a[1].length);
        System.out.println("a[2] Length => "+a[2].length);
        System.out.println("a[3] Length => "+a[3].length);
    }
}