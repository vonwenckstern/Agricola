package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class SmallFieldModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getBottomFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::bottomFence;
  }-*/;
  
  private static native void setBottomFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::bottomFence = value;
  }-*/;
  
  private static native int getChildCount(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::childCount;
  }-*/;
  
  private static native void setChildCount(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::childCount = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard getField(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::field;
  }-*/;
  
  private static native void setField(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::field = value;
  }-*/;
  
  private static native int getLeftFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::leftFence;
  }-*/;
  
  private static native void setLeftFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::leftFence = value;
  }-*/;
  
  private static native int getPersonsAtWork(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::personsAtWork;
  }-*/;
  
  private static native void setPersonsAtWork(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::personsAtWork = value;
  }-*/;
  
  private static native int getPersonsCount(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::personsCount;
  }-*/;
  
  private static native void setPersonsCount(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::personsCount = value;
  }-*/;
  
  private static native int getRightFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::rightFence;
  }-*/;
  
  private static native void setRightFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::rightFence = value;
  }-*/;
  
  private static native boolean getSelectable(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::selectable;
  }-*/;
  
  private static native void setSelectable(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, boolean value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::selectable = value;
  }-*/;
  
  private static native int getTopFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::topFence;
  }-*/;
  
  private static native void setTopFence(de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel::topFence = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) throws SerializationException {
    setBottomFence(instance, streamReader.readInt());
    setChildCount(instance, streamReader.readInt());
    setField(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.FieldCard) streamReader.readObject());
    setLeftFence(instance, streamReader.readInt());
    setPersonsAtWork(instance, streamReader.readInt());
    setPersonsCount(instance, streamReader.readInt());
    setRightFence(instance, streamReader.readInt());
    setSelectable(instance, streamReader.readBoolean());
    setTopFence(instance, streamReader.readInt());
    
    de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel instance) throws SerializationException {
    streamWriter.writeInt(getBottomFence(instance));
    streamWriter.writeInt(getChildCount(instance));
    streamWriter.writeObject(getField(instance));
    streamWriter.writeInt(getLeftFence(instance));
    streamWriter.writeInt(getPersonsAtWork(instance));
    streamWriter.writeInt(getPersonsCount(instance));
    streamWriter.writeInt(getRightFence(instance));
    streamWriter.writeBoolean(getSelectable(instance));
    streamWriter.writeInt(getTopFence(instance));
    
    de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.SmallFieldModel)object);
  }
  
}
