package zx.soft.example.utils;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Component
public class JacksonFix {

	private RequestMappingHandlerAdapter annotationMethodHandlerAdapter;
	private CustomObjectMapper objectMapper;

	@PostConstruct
	public void init() {
		List<HttpMessageConverter<?>> messageConverters = annotationMethodHandlerAdapter.getMessageConverters();
		for (HttpMessageConverter<?> messageConverter : messageConverters) {
			if (messageConverter instanceof MappingJackson2HttpMessageConverter) {
				MappingJackson2HttpMessageConverter m = (MappingJackson2HttpMessageConverter) messageConverter;
			}
		}
	}

	// this will exist due to the <mvc:annotation-driven/> bean
	@Autowired
	public void setAnnotationMethodHandlerAdapter(RequestMappingHandlerAdapter annotationMethodHandlerAdapter) {
		this.annotationMethodHandlerAdapter = annotationMethodHandlerAdapter;
	}

	@Autowired
	public void setObjectMapper(CustomObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

}
