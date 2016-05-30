package util;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/**
 * Factory necessaria para o adaptador {@link ClassTypeAdapter}
 *
 * @see ClassTypeAdapter
 */
public class ClassTypeAdapterFactory implements TypeAdapterFactory {

	@Override
	@SuppressWarnings("unchecked")
	public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
		if (!Class.class.isAssignableFrom(typeToken.getRawType()))
			return null;
		return (TypeAdapter<T>) new ClassTypeAdapter();
	}
}
