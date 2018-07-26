package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PlayerResourceModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native int getBeggerCards(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::beggerCards;
  }-*/;
  
  private static native void setBeggerCards(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::beggerCards = value;
  }-*/;
  
  private static native int getClayCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::clayCount;
  }-*/;
  
  private static native void setClayCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::clayCount = value;
  }-*/;
  
  private static native int getFenceCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::fenceCount;
  }-*/;
  
  private static native void setFenceCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::fenceCount = value;
  }-*/;
  
  private static native int getFoodCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::foodCount;
  }-*/;
  
  private static native void setFoodCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::foodCount = value;
  }-*/;
  
  private static native int getGrainCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::grainCount;
  }-*/;
  
  private static native void setGrainCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::grainCount = value;
  }-*/;
  
  private static native int getPersonsCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::personsCount;
  }-*/;
  
  private static native void setPersonsCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::personsCount = value;
  }-*/;
  
  private static native int getReedCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::reedCount;
  }-*/;
  
  private static native void setReedCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::reedCount = value;
  }-*/;
  
  private static native int getStableCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::stableCount;
  }-*/;
  
  private static native void setStableCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::stableCount = value;
  }-*/;
  
  private static native int getStoneCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::stoneCount;
  }-*/;
  
  private static native void setStoneCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::stoneCount = value;
  }-*/;
  
  private static native int getVegetableCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::vegetableCount;
  }-*/;
  
  private static native void setVegetableCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::vegetableCount = value;
  }-*/;
  
  private static native int getWoodCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::woodCount;
  }-*/;
  
  private static native void setWoodCount(de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance, int value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel::woodCount = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) throws SerializationException {
    setBeggerCards(instance, streamReader.readInt());
    setClayCount(instance, streamReader.readInt());
    setFenceCount(instance, streamReader.readInt());
    setFoodCount(instance, streamReader.readInt());
    setGrainCount(instance, streamReader.readInt());
    setPersonsCount(instance, streamReader.readInt());
    setReedCount(instance, streamReader.readInt());
    setStableCount(instance, streamReader.readInt());
    setStoneCount(instance, streamReader.readInt());
    setVegetableCount(instance, streamReader.readInt());
    setWoodCount(instance, streamReader.readInt());
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel instance) throws SerializationException {
    streamWriter.writeInt(getBeggerCards(instance));
    streamWriter.writeInt(getClayCount(instance));
    streamWriter.writeInt(getFenceCount(instance));
    streamWriter.writeInt(getFoodCount(instance));
    streamWriter.writeInt(getGrainCount(instance));
    streamWriter.writeInt(getPersonsCount(instance));
    streamWriter.writeInt(getReedCount(instance));
    streamWriter.writeInt(getStableCount(instance));
    streamWriter.writeInt(getStoneCount(instance));
    streamWriter.writeInt(getVegetableCount(instance));
    streamWriter.writeInt(getWoodCount(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.PlayerResourceModel)object);
  }
  
}
