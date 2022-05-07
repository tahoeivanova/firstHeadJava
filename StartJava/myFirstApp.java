public class myFirstApp {
    public static void main(String[] args) {
        int day = 19;
        day = day / 2;
        String month = "March";
        double d = Math.random();
        System.out.print("Random is " + d);
        System.out.print("Hello Java! " + day + " " + month + '\n');

        int x = 10;
        while (x > 0) {
            x = x - 1;
            System.out.print(x);
        }

        for (int loop=0; loop<10; loop++) {
            System.out.print(loop);
        }

        if ((x == 0) & (month.equals("March"))) {
            System.out.print("OK");
        }
        else {
            System.out.print("Condition failed");

        }
    }
}