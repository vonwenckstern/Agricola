package com.google.gwt.aria.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GrabbedValue_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.aria.client.GrabbedValue instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.google.gwt.aria.client.GrabbedValue instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.google.gwt.aria.client.GrabbedValue[] values = com.google.gwt.aria.client.GrabbedValue.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.aria.client.GrabbedValue instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.aria.client.GrabbedValue_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.aria.client.GrabbedValue_FieldSerializer.deserialize(reader, (com.google.gwt.aria.client.GrabbedValue)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.aria.client.GrabbedValue_FieldSerializer.serialize(writer, (com.google.gwt.aria.client.GrabbedValue)object);
  }
  
}
