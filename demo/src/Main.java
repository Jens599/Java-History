public class Main {
    public static void main(String[] args) {
        long h = 0, t = 0;
        for (int j = 2; j > 0; j--){
            for (int i = 1000000000; i > 0; i--){
                if (Math.random() > 0.5)
                    h++;
                else
                    t++;
            }
            System.out.println("Heads: " + h);
            System.out.println("Tails: " + t);
            System.out.println("Ratio: " + (double)h/t);
        }
        }
    }