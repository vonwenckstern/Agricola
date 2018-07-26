package com.versatile.gwt.serializer.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PrimitivesWhiteList_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Boolean get_Boolean(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Boolean;
  }-*/;
  
  private static native void set_Boolean(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Boolean value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Boolean = value;
  }-*/;
  
  private static native java.lang.Boolean[] get_Booleans(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Booleans;
  }-*/;
  
  private static native void set_Booleans(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Boolean[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Booleans = value;
  }-*/;
  
  private static native java.lang.Byte get_Byte(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Byte;
  }-*/;
  
  private static native void set_Byte(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Byte value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Byte = value;
  }-*/;
  
  private static native java.lang.Byte[] get_Bytes(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Bytes;
  }-*/;
  
  private static native void set_Bytes(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Byte[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Bytes = value;
  }-*/;
  
  private static native java.lang.Double get_Double(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Double;
  }-*/;
  
  private static native void set_Double(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Double value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Double = value;
  }-*/;
  
  private static native java.lang.Double[] get_Doubles(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Doubles;
  }-*/;
  
  private static native void set_Doubles(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Double[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Doubles = value;
  }-*/;
  
  private static native java.lang.Float get_Float(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Float;
  }-*/;
  
  private static native void set_Float(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Float value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Float = value;
  }-*/;
  
  private static native java.lang.Float[] get_Floats(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Floats;
  }-*/;
  
  private static native void set_Floats(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Float[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Floats = value;
  }-*/;
  
  private static native java.lang.Long get_Long(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Long;
  }-*/;
  
  private static native void set_Long(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Long value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Long = value;
  }-*/;
  
  private static native java.lang.Long[] get_Longs(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Longs;
  }-*/;
  
  private static native void set_Longs(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Long[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Longs = value;
  }-*/;
  
  private static native java.lang.Short get_Short(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Short;
  }-*/;
  
  private static native void set_Short(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Short value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Short = value;
  }-*/;
  
  private static native java.lang.Short[] get_Shorts(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Shorts;
  }-*/;
  
  private static native void set_Shorts(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Short[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_Shorts = value;
  }-*/;
  
  private static native boolean get_boolean(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_boolean;
  }-*/;
  
  private static native void set_boolean(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, boolean value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_boolean = value;
  }-*/;
  
  private static native boolean[] get_booleans(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_booleans;
  }-*/;
  
  private static native void set_booleans(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, boolean[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_booleans = value;
  }-*/;
  
  private static native byte get_byte(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_byte;
  }-*/;
  
  private static native void set_byte(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, byte value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_byte = value;
  }-*/;
  
  private static native byte[] get_bytes(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_bytes;
  }-*/;
  
  private static native void set_bytes(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, byte[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_bytes = value;
  }-*/;
  
  private static native char get_char(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_char;
  }-*/;
  
  private static native void set_char(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, char value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_char = value;
  }-*/;
  
  private static native java.lang.Character get_character(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_character;
  }-*/;
  
  private static native void set_character(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Character value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_character = value;
  }-*/;
  
  private static native java.lang.Character[] get_characters(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_characters;
  }-*/;
  
  private static native void set_characters(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Character[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_characters = value;
  }-*/;
  
  private static native char[] get_chars(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_chars;
  }-*/;
  
  private static native void set_chars(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, char[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_chars = value;
  }-*/;
  
  private static native double get_double(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_double;
  }-*/;
  
  private static native void set_double(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, double value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_double = value;
  }-*/;
  
  private static native double[] get_doubles(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_doubles;
  }-*/;
  
  private static native void set_doubles(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, double[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_doubles = value;
  }-*/;
  
  private static native float get_float(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_float;
  }-*/;
  
  private static native void set_float(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, float value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_float = value;
  }-*/;
  
  private static native float[] get_floats(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_floats;
  }-*/;
  
  private static native void set_floats(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, float[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_floats = value;
  }-*/;
  
  private static native int get_int(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_int;
  }-*/;
  
  private static native void set_int(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, int value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_int = value;
  }-*/;
  
  private static native java.lang.Integer get_integer(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_integer;
  }-*/;
  
  private static native void set_integer(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Integer value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_integer = value;
  }-*/;
  
  private static native java.lang.Integer[] get_integers(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_integers;
  }-*/;
  
  private static native void set_integers(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, java.lang.Integer[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_integers = value;
  }-*/;
  
  private static native int[] get_ints(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_ints;
  }-*/;
  
  private static native void set_ints(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, int[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_ints = value;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native long get_long(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_long;
  }-*/;
  
  @com.google.gwt.core.client.UnsafeNativeLong
  private static native void set_long(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, long value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_long = value;
  }-*/;
  
  private static native long[] get_longs(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_longs;
  }-*/;
  
  private static native void set_longs(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, long[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_longs = value;
  }-*/;
  
  private static native short get_short(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_short;
  }-*/;
  
  private static native void set_short(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, short value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_short = value;
  }-*/;
  
  private static native short[] get_shorts(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) /*-{
    return instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_shorts;
  }-*/;
  
  private static native void set_shorts(com.versatile.gwt.serializer.client.PrimitivesWhiteList instance, short[] value) 
  /*-{
    instance.@com.versatile.gwt.serializer.client.PrimitivesWhiteList::_shorts = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) throws SerializationException {
    set_Boolean(instance, (java.lang.Boolean) streamReader.readObject());
    set_Booleans(instance, (java.lang.Boolean[]) streamReader.readObject());
    set_Byte(instance, (java.lang.Byte) streamReader.readObject());
    set_Bytes(instance, (java.lang.Byte[]) streamReader.readObject());
    set_Double(instance, (java.lang.Double) streamReader.readObject());
    set_Doubles(instance, (java.lang.Double[]) streamReader.readObject());
    set_Float(instance, (java.lang.Float) streamReader.readObject());
    set_Floats(instance, (java.lang.Float[]) streamReader.readObject());
    set_Long(instance, (java.lang.Long) streamReader.readObject());
    set_Longs(instance, (java.lang.Long[]) streamReader.readObject());
    set_Short(instance, (java.lang.Short) streamReader.readObject());
    set_Shorts(instance, (java.lang.Short[]) streamReader.readObject());
    set_boolean(instance, streamReader.readBoolean());
    set_booleans(instance, (boolean[]) streamReader.readObject());
    set_byte(instance, streamReader.readByte());
    set_bytes(instance, (byte[]) streamReader.readObject());
    set_char(instance, streamReader.readChar());
    set_character(instance, (java.lang.Character) streamReader.readObject());
    set_characters(instance, (java.lang.Character[]) streamReader.readObject());
    set_chars(instance, (char[]) streamReader.readObject());
    set_double(instance, streamReader.readDouble());
    set_doubles(instance, (double[]) streamReader.readObject());
    set_float(instance, streamReader.readFloat());
    set_floats(instance, (float[]) streamReader.readObject());
    set_int(instance, streamReader.readInt());
    set_integer(instance, (java.lang.Integer) streamReader.readObject());
    set_integers(instance, (java.lang.Integer[]) streamReader.readObject());
    set_ints(instance, (int[]) streamReader.readObject());
    set_long(instance, streamReader.readLong());
    set_longs(instance, (long[]) streamReader.readObject());
    set_short(instance, streamReader.readShort());
    set_shorts(instance, (short[]) streamReader.readObject());
    
  }
  
  public static com.versatile.gwt.serializer.client.PrimitivesWhiteList instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.versatile.gwt.serializer.client.PrimitivesWhiteList();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.versatile.gwt.serializer.client.PrimitivesWhiteList instance) throws SerializationException {
    streamWriter.writeObject(get_Boolean(instance));
    streamWriter.writeObject(get_Booleans(instance));
    streamWriter.writeObject(get_Byte(instance));
    streamWriter.writeObject(get_Bytes(instance));
    streamWriter.writeObject(get_Double(instance));
    streamWriter.writeObject(get_Doubles(instance));
    streamWriter.writeObject(get_Float(instance));
    streamWriter.writeObject(get_Floats(instance));
    streamWriter.writeObject(get_Long(instance));
    streamWriter.writeObject(get_Longs(instance));
    streamWriter.writeObject(get_Short(instance));
    streamWriter.writeObject(get_Shorts(instance));
    streamWriter.writeBoolean(get_boolean(instance));
    streamWriter.writeObject(get_booleans(instance));
    streamWriter.writeByte(get_byte(instance));
    streamWriter.writeObject(get_bytes(instance));
    streamWriter.writeChar(get_char(instance));
    streamWriter.writeObject(get_character(instance));
    streamWriter.writeObject(get_characters(instance));
    streamWriter.writeObject(get_chars(instance));
    streamWriter.writeDouble(get_double(instance));
    streamWriter.writeObject(get_doubles(instance));
    streamWriter.writeFloat(get_float(instance));
    streamWriter.writeObject(get_floats(instance));
    streamWriter.writeInt(get_int(instance));
    streamWriter.writeObject(get_integer(instance));
    streamWriter.writeObject(get_integers(instance));
    streamWriter.writeObject(get_ints(instance));
    streamWriter.writeLong(get_long(instance));
    streamWriter.writeObject(get_longs(instance));
    streamWriter.writeShort(get_short(instance));
    streamWriter.writeObject(get_shorts(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.versatile.gwt.serializer.client.PrimitivesWhiteList_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.versatile.gwt.serializer.client.PrimitivesWhiteList_FieldSerializer.deserialize(reader, (com.versatile.gwt.serializer.client.PrimitivesWhiteList)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.versatile.gwt.serializer.client.PrimitivesWhiteList_FieldSerializer.serialize(writer, (com.versatile.gwt.serializer.client.PrimitivesWhiteList)object);
  }
  
}
