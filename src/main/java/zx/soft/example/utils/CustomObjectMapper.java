package zx.soft.example.utils;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.CustomSerializerFactory;
import org.springframework.stereotype.Component;

import zx.soft.example.model.User;

@Component
public class CustomObjectMapper extends ObjectMapper {

	public CustomObjectMapper() {
		CustomSerializerFactory sf = new CustomSerializerFactory();
		sf.addSpecificMapping(User.class, new CustomObjectSerializer());
		this.setSerializerFactory(sf);
	}

}