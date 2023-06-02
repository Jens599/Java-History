public class Nine {
    public static void main(String[] args) {
        function("overload");
        function();
    }

    private static void function(String s) {
        System.out.println("Function One");
    }
    private static void function() {
        System.out.printf("function Two");
    }
}
