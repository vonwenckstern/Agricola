package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BigFieldModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getVisible(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel::visible;
  }-*/;
  
  private static native void setVisible(de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel::visible = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel instance) throws SerializationException {
    setVisible(instance, streamReader.readBoolean());
    
    de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel instance) throws SerializationException {
    streamWriter.writeBoolean(getVisible(instance));
    
    de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel)object);
  }
  
}
