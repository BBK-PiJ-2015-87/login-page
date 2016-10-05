package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingResource {

    private static final String template = "Hello, %s";
    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/greetingJson")
    public Greeting greetingJson(@RequestParam(value = "name", required = false, defaultValue = "Olga") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
