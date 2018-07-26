package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BigAcquisitions_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions[] values = de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions)object);
  }
  
}
