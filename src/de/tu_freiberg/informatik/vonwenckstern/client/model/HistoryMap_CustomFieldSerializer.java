package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;




public class HistoryMap_CustomFieldSerializer {
	
	public static void deserialize(SerializationStreamReader streamReader, HistoryMap instance) throws SerializationException {
		int number = streamReader.readInt();
		for(int i=0; i<number; i++) {
			int key = streamReader.readInt();
			instance.put(key, (Serializable) streamReader.readObject());
		}
	}

	public static HistoryMap instantiate(SerializationStreamReader streamReader) throws SerializationException {
		return new HistoryMap();
	}

	public static void serialize(SerializationStreamWriter streamWriter, HistoryMap instance) throws SerializationException {
		streamWriter.writeInt(instance.size());
		for(int key : instance.keySet()) {
			streamWriter.writeInt(key);
			streamWriter.writeObject(instance.get(key));
		}
	}
}
