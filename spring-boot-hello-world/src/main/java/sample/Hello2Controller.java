package sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@RestController
public class Hello2Controller {

	private final FeatureManager manager;
	public static final Feature HELLO_WORLD2 = new NamedFeature("HELLO_WORLD2");
	public Hello2Controller(FeatureManager manager) {
		this.manager = manager;
	}
	
	@RequestMapping("/hello")
    public ResponseEntity<?> hello() {
 
        StringBuilder sb = new StringBuilder("Hello Controller 2");
        if (manager.isActive(HELLO_WORLD2)) {
            return ResponseEntity.ok().body(sb.toString());
        }       
        return ResponseEntity.ok().body("Hello World 2 -- 404 Not Found");

    }
}
