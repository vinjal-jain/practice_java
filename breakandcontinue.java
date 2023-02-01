public class breakandcontinue {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
            System.out.println("GREAT");
            if (i == 2) {
                System.out.println("ENDING LOOP NOW");
                break;

            }
        }
        for (int i = 0; i < 7; i++) {
            if (i == 2) {
                System.out.println("ending");
                continue;
            }
                System.out.println(i);
                System.out.println("GREAT");
            }

    }

}
