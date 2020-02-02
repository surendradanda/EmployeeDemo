package employee.appconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScans( value = {@ComponentScan("employee.dao"),@ComponentScan("employee.service"),@ComponentScan("employee.servicereadonly")}) 

public class AppConfig {

}
