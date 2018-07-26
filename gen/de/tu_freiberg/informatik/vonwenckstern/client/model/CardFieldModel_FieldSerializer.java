package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CardFieldModel_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelCabaret(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelCabaret;
  }-*/;
  
  private static native void setModelCabaret(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelCabaret = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel getModelFood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelFood;
  }-*/;
  
  private static native void setModelFood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelFood = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel getModelGrain(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelGrain;
  }-*/;
  
  private static native void setModelGrain(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelGrain = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel getModelHouse(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelHouse;
  }-*/;
  
  private static native void setModelHouse(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelHouse = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelOneWood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelOneWood;
  }-*/;
  
  private static native void setModelOneWood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelOneWood = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel getModelPlowField(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelPlowField;
  }-*/;
  
  private static native void setModelPlowField(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelPlowField = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelReedStoneFood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelReedStoneFood;
  }-*/;
  
  private static native void setModelReedStoneFood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelReedStoneFood = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel getModelStartPlayer(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelStartPlayer;
  }-*/;
  
  private static native void setModelStartPlayer(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelStartPlayer = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelTwoClay(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelTwoClay;
  }-*/;
  
  private static native void setModelTwoClay(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelTwoClay = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelTwoWood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelTwoWood;
  }-*/;
  
  private static native void setModelTwoWood(de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel::modelTwoWood = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) throws SerializationException {
    setModelCabaret(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelFood(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel) streamReader.readObject());
    setModelGrain(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel) streamReader.readObject());
    setModelHouse(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel) streamReader.readObject());
    setModelOneWood(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelPlowField(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel) streamReader.readObject());
    setModelReedStoneFood(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelStartPlayer(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BaseFieldModel) streamReader.readObject());
    setModelTwoClay(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelTwoWood(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel instance) throws SerializationException {
    streamWriter.writeObject(getModelCabaret(instance));
    streamWriter.writeObject(getModelFood(instance));
    streamWriter.writeObject(getModelGrain(instance));
    streamWriter.writeObject(getModelHouse(instance));
    streamWriter.writeObject(getModelOneWood(instance));
    streamWriter.writeObject(getModelPlowField(instance));
    streamWriter.writeObject(getModelReedStoneFood(instance));
    streamWriter.writeObject(getModelStartPlayer(instance));
    streamWriter.writeObject(getModelTwoClay(instance));
    streamWriter.writeObject(getModelTwoWood(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.CardFieldModel)object);
  }
  
}
