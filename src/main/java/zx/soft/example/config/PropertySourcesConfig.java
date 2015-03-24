package zx.soft.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class PropertySourcesConfig {

	public static class Config {
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
			pspc.setLocations(PROPERTIES);
			return pspc;
		}
	}

	private static final Resource[] PROPERTIES = new ClassPathResource[] { new ClassPathResource("conf.properties"), };

}