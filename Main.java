
//Computer Class 
import java.util.Arrays;
import java.util.List;

interface Computer {

    void code();

}

class Laptop implements Computer {

    // @Override
    public void code() {
        System.out.println("Coding on a Laptop");
    }
}

class Desktop implements Computer {

    // @Override
    public void code() {
        System.out.println("Coding on a Desktop");
    }
}

class developer {

    public void develop(Computer comp) {
        comp.code();
    }
}

enum Status {
    ACTIVE, INACTIVE, PENDING, FAILED, SUCCESS
}

enum LaptopBrands {
    DELL(7000), HP(5000), APPLE(10000), ASUS(80000), ACER;

    private int price;

    private LaptopBrands(int price) {
        this.price = price;
    }

    private LaptopBrands() {
        int defaultPrice = 6000;
        this.price = defaultPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

// TODO: Create an interface called Machine with one method: String start()
interface Machine {

    String start();
}

// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface
abstract class Appliance implements Machine {

    private String name;

    protected Appliance(String name) {
        this.name = name;
    }

}

// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance {

    // public String name;
    public Fan(String name) {
        super(name);
    }

    public String start() {
        System.out.println("Fan is running");
        return "Fan started";
    }
}

// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance {

    public String name;

    public WashingMachine(String name) {
        super(name);
    }

    public String start() {
        System.out.println("Washing Machine is operating");
        return "Washing Machine started";
    }
}

// public class Exercise {
//     public static void main(String[] args) {
//         // TODO: Create objects of Fan and WashingMachine using interface references
//         // TODO: Print the result of start() for each object
//          Machine fan = new Fan("Fan");
//          Machine washer = new WashingMachine("Washing Machine");
//     }
// }
interface A {

    void display(int x);
}

class JoshException extends Exception {

    public JoshException(String string) {
        super(string);
    }

}

// class B extends Thread{
//     public void run (){
//         for(int i = 0; i < 100; i++){
//             System.out.println("Hi B");
//             try {
//                 Thread.sleep(2);
//             } catch (InterruptedException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }
class C extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi C");
        }
    }
}

// TODO: Define custom exception InvalidAgeException extending Exception
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }

}

class PrintTask implements Runnable {

    public void run() {
        for (int i = 1; i < 6; i++) {

            System.out.println(Thread.currentThread().getName()
                    + ": Running task " + i);
        }
    }
}

// class  tryCatchTest {
//   int i=0;
//   int j = 0;
//   int k = 8/i;
// }
class Main {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws InterruptedException {

        //    int num = 5;
        //    int nums[] = new int[5];
        // Map<String, Integer> Students = new HashMap<>();
        // List<Integer> nums = Arrays.asList(3, 5, 7, 4, 2, 6);
        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        // TODO: Print the original list
        System.out.println(products);
        // TODO: Filter names longer than 5 characters, convert to uppercase, sort, and collect into a list
        List<String> product = products.stream()
                .filter(n -> n.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        // TODO: Print the filtered list
        System.out.println(product);

        List<String> name = Arrays.asList("Jash", "Jey", "Paul");

        String names = name.stream()
                .filter(str -> str.contains("o"))
                .findFirst()
                .orElse("Not found");
        // .toList();

        // names.forEach(n -> System.out.println(n));
        List<String> test = Arrays.asList("Jash", "Jey", "Paul");

        // List<String> testname = test.stream()
        //         .map(n -> n.toUpperCase())
        //         .toList();
        List<String> testname = test.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(testname);

        // System.out.println(names);
        // nums.forEach(n -> System.out.println(n));
        // for (int n : nums) {
        //     System.out.println(n);
        // }
        // int result = nums.stream()
        //         .filter(n -> n % 2 == 0)
        //         .map(n -> n *= 2)
        //         .reduce(0, (c, e) -> c + e);
        // System.out.println(result);
        // int sum = 0; 
        // for (int n : nums) {
        //     if (n % 2 == 0) {
        //         n = n * 2;
        //         // sum = +n;
        //     }
        //     sum += n;
        // }
        // System.out.println(sum);
        // Students.put("Josh", 25);
        // Students.put("Jay", 89);
        // Students.put("Chris", 70);
        // Students.put("Shu", 25);
        // Students.put("Tuffic", 25);
        // // System.out.println(Students.keySet());
        // for (String name : Students.keySet()) {
        //     System.out.println(
        //             name + " : " + Students.get(name));
        // }
        // Set<Integer> nums = new TreeSet<>();
        // nums.add(5);
        // nums.add(55);
        // nums.add(54);
        // nums.add(65);
        // nums.add(55);
        // nums.add(7);
        // Iterator<Integer> values = nums.iterator();
        //  while (values.hasNext()) {
        //     System.out.println(values.next());
        // }
        // System.out.println(values.next());
        // System.out.println(nums);
        // for (int n : nums) {
        //     // int nu = (int) n;
        //     System.out.println(n);
        // }
        // // Runnable b = () -> {
        // //     for (int i = 0; i < 100; i++) {
        // //         System.out.println("Hi B");
        // //         try {
        // //             Thread.sleep(2);
        // //         } catch (InterruptedException ex) {
        // //             ex.printStackTrace();
        // //         }
        // //     }
        // // };
        // // Runnable c = () -> {
        // //     for (int i = 0; i < 100; i++) {
        // //         System.out.println("Hi C");
        // //         try {
        // //             Thread.sleep(2);
        // //         } catch (InterruptedException ex) {
        // //             ex.printStackTrace();
        // //         }
        // //     }
        // // };
        // Runnable task = new PrintTask();
        // Thread t1 = new Thread(task, "Worker-1");
        // Thread t2 = new Thread(task, "Worker-2");
        // t1.start();
        // t2.start();
        // t1.join();
        // t2.join();
        //  Runnable Worker_1 = () -> {
        //     for(int i = 1; i < 6; i++){
        //     System.out.println( " : Running task" + i); 
        // }};
        //  Worker_1.start();
        // QuestionService qs = new QuestionService();
        // qs.displayQuestions();
        // qs.printScore();
        // A obj = x -> System.out.println("Anonymous class implementation of abstract class A with value: " + x);
        // int i= 30;
        // int j = 0;
        // // int[] nums = new int[5];
        // // String str = "Joshua"; 
        // try {
        // j = 8/i;  
        // if( j==0)
        //    throw new JoshException("Josh did this shit");
        // } catch(ArithmeticException e){ 
        //        j = 8+1; // Avoid division by zero by using a default value
        //     System.out.println("Exception caught: Division by zero is not allowed." + e);
        // } catch(JoshException e){
        //     System.out.println("Something went wrong: " + e);
        // } 
        // public static void checkAge(int age) throws InvalidAgeException {
        //     // TODO: Throw custom exception if age < 18, else print "Access granted"
        //       if( age < 18){
        //         throw new InvalidAgeException("Age must be 18 or older");
        //       }
        //        System.out.println("Access granted");
        // }
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks
        //   try {
        //     checkAge(16);
        //   } catch (Exception e) {
        //        System.out.println(e);
        //   }
        //     // TODO: handle exception
        // System.out.println(j);
        // Status s = Status.FAILED;
        // System.out.println("Current Status: " + s);
        //  Status[] S = Status.values();
        //  for(Status s: S){
        //     System.out.println(s + ":"+ s.ordinal());
        //  }
        // Computer myLap = new Laptop();
        // Computer myDesk = new Desktop();
        // developer dev = new developer();
        // dev.develop(myDesk);
        // for(LaptopBrands lb : LaptopBrands.values()){
        //     System.out.println(lb + " : " + lb.getPrice());
        // }
        // TODO: Create objects of Fan and WashingMachine using interface references
        // TODO: Print the result of start() for each object
        //  Machine fan = new Fan("Fan");
        //  Machine washer = new WashingMachine("Washing Machine");
        //  System.out.println(fan.start());
        //  System.out.println(washer.start());
    }
}
