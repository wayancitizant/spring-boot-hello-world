package sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@RestController
public class Hello2Controller {

	@RequestMapping("/hello")
    public ResponseEntity<?> hello() {
 
        StringBuilder sb = new StringBuilder("Hello Controller 2");
        return ResponseEntity.ok().body(sb.toString());

    }
}
