import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascale_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            List<Integer> row = new ArrayList<>();

            for (int columnIndex = 0; columnIndex <= rowIndex; columnIndex++) {
                if (columnIndex == 0 || columnIndex == rowIndex) {
                    row.add(1);
                } else {
                    int value = triangle.get(rowIndex - 1).get(columnIndex - 1)
                            + triangle.get(rowIndex - 1).get(columnIndex);
                    row.add(value);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int numRows = scanner.nextInt();

        if (numRows < 0) {
            System.out.println("Number of rows cannot be negative.");
        } else {
            List<List<Integer>> triangle = generate(numRows);

            for (List<Integer> row : triangle) {
                System.out.println(row);
            }
        }

        scanner.close();
    }
}
