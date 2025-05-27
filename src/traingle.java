public class traingle {
    public static void main(String[] args) {
        int row,column,noofRows=6;
            for(row=0;row<noofRows;row++){
                for(column=2*(noofRows-row);column>2;column--){
                    System.out.print(" ");
                }
                for (column=0;column<=row;column++){
                    System.out.print("* ");
            }
                System.out.println();
        }
    }
}