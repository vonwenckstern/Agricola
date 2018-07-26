package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Rounds8To14Model_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelBoar(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelBoar;
  }-*/;
  
  private static native void setModelBoar(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelBoar = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelCow(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelCow;
  }-*/;
  
  private static native void setModelCow(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelCow = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelFamily(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelFamily;
  }-*/;
  
  private static native void setModelFamily(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelFamily = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelPlowSow(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelPlowSow;
  }-*/;
  
  private static native void setModelPlowSow(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelPlowSow = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelRestauration(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelRestauration;
  }-*/;
  
  private static native void setModelRestauration(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelRestauration = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelStone(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelStone;
  }-*/;
  
  private static native void setModelStone(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelStone = value;
  }-*/;
  
  private static native de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel getModelVegetable(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) /*-{
    return instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelVegetable;
  }-*/;
  
  private static native void setModelVegetable(de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance, de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel value) 
  /*-{
    instance.@de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model::modelVegetable = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) throws SerializationException {
    setModelBoar(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelCow(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelFamily(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelPlowSow(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelRestauration(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelStone(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    setModelVegetable(instance, (de.tu_freiberg.informatik.vonwenckstern.client.model.BigFieldModel) streamReader.readObject());
    
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model instance) throws SerializationException {
    streamWriter.writeObject(getModelBoar(instance));
    streamWriter.writeObject(getModelCow(instance));
    streamWriter.writeObject(getModelFamily(instance));
    streamWriter.writeObject(getModelPlowSow(instance));
    streamWriter.writeObject(getModelRestauration(instance));
    streamWriter.writeObject(getModelStone(instance));
    streamWriter.writeObject(getModelVegetable(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.Rounds8To14Model)object);
  }
  
}
