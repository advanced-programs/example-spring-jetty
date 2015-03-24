package zx.soft.example.utils;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import zx.soft.example.model.User;

public class CustomObjectSerializer extends JsonSerializer<User> {

	@Override
	public void serialize(User value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		jgen.writeStartObject();
		jgen.writeNumberField("id", value.getId());
		jgen.writeStringField("name", value.getName());
		jgen.writeNumberField("age", value.getAge());
		//		jgen.writeNumber(value.getId());
		//		jgen.writeString(value.getName());
		//		jgen.writeNumber(value.getAge());
		jgen.writeEndObject();
	}

	@Override
	public Class<User> handledType() {
		return User.class;
	}

}
