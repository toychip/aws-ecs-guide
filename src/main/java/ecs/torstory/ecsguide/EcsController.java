package ecs.torstory.ecsguide;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcsController {

    private static final Logger log = LoggerFactory.getLogger(EcsController.class);

    @GetMapping("/test")
    public ResponseEntity<String> teat() {
        log.info("test! Hello");
        return ResponseEntity.ok("test success");
    }

    @GetMapping("/health")
    public ResponseEntity<String> health() {
        log.info("health! Hello");
        return ResponseEntity.ok("healt success");
    }
}
