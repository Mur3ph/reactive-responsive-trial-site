package ie.murph.sports.clinic.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
	 private static final String[] CLASSSPATH_RESOURCE_LOCATIONS = {
	    		"classpath:/images",
	    		"classpath:/resources/images",
	    		"classpath:/css",
	    		"classpath:/resources/css"
	 };
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	registry.addViewController("/header").setViewName("common-file-includes/header");
    	registry.addViewController("/nav-bar-top").setViewName("common-file-includes/nav-bar-top");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/users").setViewName("users/list");
        registry.addViewController("/login").setViewName("login");
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
    	registry.addResourceHandler("/**")
    			.addResourceLocations(CLASSSPATH_RESOURCE_LOCATIONS);
	}
}