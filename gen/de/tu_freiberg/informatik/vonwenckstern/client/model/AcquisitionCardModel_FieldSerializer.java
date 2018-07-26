package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AcquisitionCardModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions getAcquisition(de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel::acquisition;
  }-*/;
  
  private static native void setAcquisition(de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel::acquisition = value;
  }-*/;
  
  private static native boolean getSelectable(de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel::selectable;
  }-*/;
  
  private static native void setSelectable(de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel::selectable = value;
  }-*/;
  
  private static native boolean getVisible(de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel::visible;
  }-*/;
  
  private static native void setVisible(de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel::visible = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance) throws SerializationException {
    setAcquisition(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigAcquisitions) streamReader.readObject());
    setSelectable(instance, streamReader.readBoolean());
    setVisible(instance, streamReader.readBoolean());
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel instance) throws SerializationException {
    streamWriter.writeObject(getAcquisition(instance));
    streamWriter.writeBoolean(getSelectable(instance));
    streamWriter.writeBoolean(getVisible(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel)object);
  }
  
}
