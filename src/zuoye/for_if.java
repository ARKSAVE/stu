package zuoye;

public class for_if {
    public static void main(String[] args) {
        int[][] two = new int[4][5];

        for (int l = 0; l < two.length; l++){
            for (int m = 0; m < two[l].length; m++){
                if (l *m ==0){
                    two[l][m] = m;
                }
                else{
                    two[l][m] = l+m;
                }

                System.out.print(two[l][m]);
            }
            System.out.println();
        }

    }

}
