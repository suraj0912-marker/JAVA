import java.util.Optional;

public class testingOptional {
    public static void main(String[] args) {
      // creating optional object
        Optional<String>optionalEmpty=Optional.empty();
        Optional<String>optionalof=Optional.of("java");
        Optional<String>optionalNullable=Optional.ofNullable(null);



        // checking presence value
        if (optionalof.isPresent()) {
            System.out.println("value is present" + optionalof.get());
        }
            // using orElse to provide a fallback
            String orExample=optionalEmpty.orElse("default value");
        System.out.println("using orElse"+orExample);



    }
}
