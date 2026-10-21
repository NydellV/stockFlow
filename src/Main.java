public class Main {
    public static void main(String[]args){
        Product breaker = new Product(" Circuit Breaker", 25.99, 50);

        System.out.println(breaker.getName());
        System.out.println(breaker.getPrice());
        System.out.println(breaker.getQuantity());

        Product wire = new Product("Copper Wire", 89.99, 100);

        System.out.println(wire.getName());
        System.out.println(wire.getPrice());
        System.out.println(wire.getQuantity());

    }
}
