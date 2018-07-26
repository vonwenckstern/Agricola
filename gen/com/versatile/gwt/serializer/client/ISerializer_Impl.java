package com.versatile.gwt.serializer.client;

import com.versatile.gwt.serializer.client.stream.StringSerializationStreamWriter;
import com.versatile.gwt.serializer.client.stream.StringSerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.SerializationException;

public class ISerializer_Impl implements com.versatile.gwt.serializer.client.ISerializer {
  private static final com.versatile.gwt.serializer.client.ISerializer_TypeSerializer SERIALIZER = new com.versatile.gwt.serializer.client.ISerializer_TypeSerializer();
  
  
  public String serialize(Object object) {try {
      StringSerializationStreamWriter streamWriter = new StringSerializationStreamWriter(SERIALIZER);
      streamWriter.writeObject(object);
      return streamWriter.toString();
    } catch (SerializationException ex) {
      throw new RuntimeException(ex.getMessage(), ex);
    }
  }
  
  public <T> T deserialize(String object) {try {
      StringSerializationStreamReader streamReader = new StringSerializationStreamReader(SERIALIZER);
      streamReader.prepare(object);
      return (T) streamReader.readObject();
    } catch (SerializationException ex) {
      throw new RuntimeException(ex.getMessage(), ex);
    }
  }
  
  public boolean isSerializable(Class<?> clazz) {return SERIALIZER.getSerializationSignature(clazz) != null;
  }
  
  public String getSerializationSignature(Class<?> clazz) {return SERIALIZER.getSerializationSignature(clazz);
  }
}
