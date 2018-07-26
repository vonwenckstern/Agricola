package de.tu_freiberg.informatik.vonwenckstern.client.model;

import java.io.Serializable;

public class BigAcquisitationsModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private AcquisitionCardModel[] models = new AcquisitionCardModel[] { new AcquisitionCardModel(BigAcquisitions.BA_FIRE_PLACE), new AcquisitionCardModel(BigAcquisitions.BA_FIRE_PLACE2), new AcquisitionCardModel(BigAcquisitions.BA_COOKERY), new AcquisitionCardModel(BigAcquisitions.BA_COOKERY2), new AcquisitionCardModel(BigAcquisitions.BA_FOUNTAIN),
			new AcquisitionCardModel(BigAcquisitions.BA_CLAY_OVEN), new AcquisitionCardModel(BigAcquisitions.BA_STONE_OVEN), new AcquisitionCardModel(BigAcquisitions.BA_JOINERY), new AcquisitionCardModel(BigAcquisitions.BA_POTTERY), new AcquisitionCardModel(BigAcquisitions.BA_BASKET_MAKER)};
	
	public void update(BigAcquisitationsModel model) {
		if(model == null) return;
		for(int i=0; i<10; i++) {
			models[i].setAcquisition(model.models[i].getAcquisition());
			models[i].setVisible(model.models[i].isVisible());
		}
	}
	
	public void setModel(int id, AcquisitionCardModel m) {
		models[id] = m;
	}
	
	public AcquisitionCardModel getModel(int id) {
		return models[id];
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof BigAcquisitationsModel))
			return false;
		BigAcquisitationsModel bm = (BigAcquisitationsModel)o;
		return models[0].equals(bm.getModel(0)) &&models[1].equals(bm.getModel(1)) && models[2].equals(bm.getModel(2)) && models[3].equals(bm.getModel(3)) && models[4].equals(bm.getModel(4)) && models[5].equals(bm.getModel(5)) &&
				models[6].equals(bm.getModel(6)) && models[7].equals(bm.getModel(7)) && models[8].equals(bm.getModel(8)) && models[9].equals(bm.getModel(9));
	}
	
	public BigAcquisitationsModel clone() {
		BigAcquisitationsModel model = new BigAcquisitationsModel();
		for(int i=0; i<10; i++) {
			model.setModel(i, new AcquisitionCardModel(models[i].getAcquisition(), models[i].isVisible()));
		}
		return model;
	}
}
