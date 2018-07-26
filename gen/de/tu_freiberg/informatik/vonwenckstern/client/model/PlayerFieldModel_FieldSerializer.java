package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlayerFieldModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] getAcquisitations(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::acquisitations;
  }-*/;
  
  private static native void setAcquisitations(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::acquisitations = value;
  }-*/;
  
  private static native boolean getAllowBasketMaker(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::allowBasketMaker;
  }-*/;
  
  private static native void setAllowBasketMaker(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::allowBasketMaker = value;
  }-*/;
  
  private static native boolean getAllowJoinery(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::allowJoinery;
  }-*/;
  
  private static native void setAllowJoinery(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::allowJoinery = value;
  }-*/;
  
  private static native boolean getAllowPottery(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::allowPottery;
  }-*/;
  
  private static native void setAllowPottery(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::allowPottery = value;
  }-*/;
  
  private static native int getFenceId(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::fenceId;
  }-*/;
  
  private static native void setFenceId(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::fenceId = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel[] getFields(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::fields;
  }-*/;
  
  private static native void setFields(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel[] value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel::fields = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) throws SerializationException {
    setAcquisitations(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[]) streamReader.readObject());
    setAllowBasketMaker(instance, streamReader.readBoolean());
    setAllowJoinery(instance, streamReader.readBoolean());
    setAllowPottery(instance, streamReader.readBoolean());
    setFenceId(instance, streamReader.readInt());
    setFields(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel[]) streamReader.readObject());
    instance.round = streamReader.readInt();
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel instance) throws SerializationException {
    streamWriter.writeObject(getAcquisitations(instance));
    streamWriter.writeBoolean(getAllowBasketMaker(instance));
    streamWriter.writeBoolean(getAllowJoinery(instance));
    streamWriter.writeBoolean(getAllowPottery(instance));
    streamWriter.writeInt(getFenceId(instance));
    streamWriter.writeObject(getFields(instance));
    streamWriter.writeInt(instance.round);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerFieldModel)object);
  }
  
}
