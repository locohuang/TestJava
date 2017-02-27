/**
 * Created by Administrator on 2017/2/27.
 */
public class TestArray {
    public static void main(String[] args) {
        //int array[] = new int[5];
        int[]array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        //System.out.println(array[0]+"  " +array[1]+ " "+array[2]);

        int[][] arr = new int[2][3];
        arr[0][0]=1;arr[0][1]=2;arr[0][2]=3;
        arr[1][0]=4;arr[1][1]=5;arr[1][2]=6;
        /*System.out.println(arr[0][0]+ " " +arr[0][1]+" "+arr[0][2]);
        System.out.println(arr[1][0]+ " " +arr[1][1]+" "+arr[1][2]);*/

        int[][] arr2 = new int[3][];
        arr2[0] = new int[1];
        arr2[1] = new int[2];
        arr2[2] = new int[3];
        for(int i = 0;i<3;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
