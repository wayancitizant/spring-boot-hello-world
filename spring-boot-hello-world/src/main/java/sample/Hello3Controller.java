package sample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.Feature;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.util.NamedFeature;

@RestController
public class Hello3Controller {

	private final FeatureManager manager;
	public static final Feature HELLO_WORLD3 = new NamedFeature("HELLO_WORLD3");
	public Hello3Controller(FeatureManager manager) {
		this.manager = manager;
	}
	
	@RequestMapping("/hello3")
    public ResponseEntity<?> hello() {
 
        StringBuilder sb = new StringBuilder("Hello Controller 3");
        if (manager.isActive(HELLO_WORLD3)) {
            return ResponseEntity.ok().body(sb.toString());
        }       
        return ResponseEntity.ok().body("Hello World 3 -- 404 Not Found");

    }
}
