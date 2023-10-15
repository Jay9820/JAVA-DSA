class pattern1 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                if (j <= i)

                    System.out.print("*");
                else
                    System.out.println(" ");

            }

        }
    }
}