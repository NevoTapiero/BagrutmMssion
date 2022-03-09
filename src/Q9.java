public class Q9 {
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        int row, col, finalnum = 0;
        for (int i = 0;i < a.length;i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int)(Math.random() * (1 - 0 + 1) - 0);
            }
        }
        for (int t = 0;t < a.length;t++) {
            System.out.println("");
            for (int e = 0; e < a.length; e++)
                System.out.printf("[" + (a[t][e]) + "]");
        }
        row = (int)(Math.random()*(10 - 1 + 1) + 1);
        col = (int)(Math.random()*(10 - 1 + 1) + 1);
        System.out.println("");
        System.out.println("row = " + row + " col = " + col);
        finalnum = number(a, row, col);
        System.out.println(finalnum);
    }
    public static int number(int[][]a, int row, int col){
        int num1 = 0,num2 = 0,num3 = 0;
        System.out.println(a[row][col]);
        for (int j = 0;j < a.length;j++)
            num1 = num1 + a[row][j];

        for (int i = 0;i < a.length;i++)
            num2 = num2 + a[i][col];
        System.out.println(num1);
        System.out.println(num2);
        if (num2 == num1)
            num3 = 1;
        return num3;
    }
}