package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BaseFieldModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.Child getChild(de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel::child;
  }-*/;
  
  private static native void setChild(de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.Child value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel::child = value;
  }-*/;
  
  private static native int getRessourceCount(de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel::ressourceCount;
  }-*/;
  
  private static native void setRessourceCount(de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel::ressourceCount = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instance) throws SerializationException {
    setChild(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.Child) streamReader.readObject());
    setRessourceCount(instance, streamReader.readInt());
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel instance) throws SerializationException {
    streamWriter.writeObject(getChild(instance));
    streamWriter.writeInt(getRessourceCount(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel)object);
  }
  
}
