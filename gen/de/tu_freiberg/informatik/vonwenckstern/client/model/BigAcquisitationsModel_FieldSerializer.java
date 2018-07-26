package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BigAcquisitationsModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] getModels(de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel::models;
  }-*/;
  
  private static native void setModels(de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel::models = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel instance) throws SerializationException {
    setModels(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[]) streamReader.readObject());
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel instance) throws SerializationException {
    streamWriter.writeObject(getModels(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitationsModel)object);
  }
  
}
