import com.example.dot.demo.test.Customer;

@SpringBootApplication
public class DemoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }

    @Bean
    public Customer customer(@Autowired String address) {
        return new Customer("Claire WitPro", address);
    }
}