package com.google.gwt.validation.client.impl;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ConstraintOrigin_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.validation.client.impl.ConstraintOrigin instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.google.gwt.validation.client.impl.ConstraintOrigin instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.google.gwt.validation.client.impl.ConstraintOrigin[] values = com.google.gwt.validation.client.impl.ConstraintOrigin.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.validation.client.impl.ConstraintOrigin instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.validation.client.impl.ConstraintOrigin_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.validation.client.impl.ConstraintOrigin_FieldSerializer.deserialize(reader, (com.google.gwt.validation.client.impl.ConstraintOrigin)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.validation.client.impl.ConstraintOrigin_FieldSerializer.serialize(writer, (com.google.gwt.validation.client.impl.ConstraintOrigin)object);
  }
  
}
