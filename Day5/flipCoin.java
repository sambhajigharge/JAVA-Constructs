
public class flipCoin {

        static final double count = 10;
    public static void main(String[] args) {

                int head = 0;
                int tail = 0;

                for (int i = 1; i <= 10; i++) {
                    if (Math.random() < 0.5) {
                        head++;
                        System.out.println("Heads");
                    }
                    else {
                        tail++;
                        System.out.println("Tails");
                    }

                }

                System.out.println("Number of Heads :" + head);
                System.out.println("Number of Tails :" + tail);

                double headpercent = (double)head/count*100;
                double tailpercent = (double)tail/count*100;

                System.out.println("Percentage of Heads :" + headpercent);
                System.out.println("Percentage of Tails :" + tailpercent);

    }

}
