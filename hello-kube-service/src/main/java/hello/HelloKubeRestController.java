package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
class HelloKubeRestController {

    @GetMapping(path = "/hello")
    public HelloResponse getHelloResponse() {
        log.info("Responding with Hello Kube!");
        return new HelloResponse("Hello Kube!");
    }

}
