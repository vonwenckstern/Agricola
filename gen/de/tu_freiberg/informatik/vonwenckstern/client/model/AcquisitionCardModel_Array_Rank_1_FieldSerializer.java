package de.tu_freiberg.informatik.vonwenckstern.client.model;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AcquisitionCardModel_Array_Rank_1_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int size = streamReader.readInt();
    return new de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[size];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[] instance) throws SerializationException {
    com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel_Array_Rank_1_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel_Array_Rank_1_FieldSerializer.deserialize(reader, (de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[])object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel_Array_Rank_1_FieldSerializer.serialize(writer, (de.tu_freiberg.informatik.vonwenckstern.client.model.AcquisitionCardModel[])object);
  }
  
}
