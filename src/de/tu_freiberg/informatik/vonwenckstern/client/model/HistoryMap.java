package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;
import java.util.HashMap;

/**
 * HM is shortform of history map, this name is so short, because it will get serialized into the URL
 * @author wencky
 *
 */
public class HistoryMap extends HashMap<Integer, Serializable> implements Serializable {
	private static final long serialVersionUID = 1L;

}
