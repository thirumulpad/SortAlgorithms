public class test {

    public static void main(String[] args) {
        int[] array = {22, 8, -15, 45, 75, -22, 3};
        print(array);
        InsertionSortImpl sortimpl = new InsertionSortImpl();
        sortimpl.sort(array);
        System.out.println("***************");
        print(array);
    }

    private static void print(int[] array) {

        for (int integer : array) {
            System.out.print(integer + " ");
        }
    }
}
