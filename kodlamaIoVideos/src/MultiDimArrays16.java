public class MultiDimArrays16 {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities [0][0] ="istanbul";
        cities [0][1] ="tekirdag";
        cities [0][2] ="edirne";
        cities [1][0] ="izmir";
        cities [1][1] ="balikesir";
        cities [1][2] ="aydin";
        cities [2][0] ="nigde";
        cities [2][1] ="ankara";
        cities [2][2] ="yozgat";

        for(int i=0; i<=2; i++){
            System.out.println("-------");
            for (int j =0; j<=2; j++){
                System.out.println(cities[i][j]);
            }
        }

    }


}
