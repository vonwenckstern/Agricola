package de.tu_freiberg.informatik.vonwenckstern.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Images extends ClientBundle {
	
	public static class Util {
		private static Images images = GWT.create(Images.class); // do not set it to null, and load if we need it, because we need it for sure
		public static Images getInstance() {
			return images;
		}
	}
	
	@Source("clear.cache.gif")
	ImageResource clear();
	
	@Source("DSC06140.JPG")
	ImageResource pottery();
	
	@Source("DSC06141.JPG")
	ImageResource basketMaker();
	
	@Source("DSC06142.JPG")
	ImageResource cookery2();
	
	@Source("DSC06143.JPG")
	ImageResource firePlace();
	
	@Source("DSC06144.JPG")
	ImageResource fountain();
	
	@Source("DSC06145.JPG")
	ImageResource cookery();
	
	@Source("DSC06146.JPG")
	ImageResource clayOven();
	
	@Source("DSC06147.JPG")
	ImageResource stoneOven();
	
	@Source("DSC06148.JPG")
	ImageResource joinery();
	
	@Source("DSC06149.JPG")
	ImageResource firePlace2();
	
	@Source("DSC06150.JPG")
	ImageResource sheep();
	
	@Source("DSC06151.JPG")
	ImageResource acquisition();
	
	@Source("DSC06152.JPG")
	ImageResource fence();
	
	@Source("DSC06153.JPG")
	ImageResource seedingBacking();
	
	@Source("DSC06154.JPG")
	ImageResource familyAddition();
	
	@Source("DSC06155.JPG")
	ImageResource stone();
	
	@Source("DSC06156.JPG")
	ImageResource restauration();
	
	@Source("DSC06157.JPG")
	ImageResource boar();
	
	@Source("DSC06158.JPG")
	ImageResource vegetable();
	
	@Source("DSC06159.JPG")
	ImageResource stone2();
	
	@Source("DSC06160.JPG")
	ImageResource cow();
	
	@Source("DSC06161.JPG")
	ImageResource plowingField();
	
	@Source("DSC06162.JPG")
	ImageResource familyAddition2();
	
	@Source("DSC06163.JPG")
	ImageResource restauration2();
	
	@Source("DSC06164.JPG")
	ImageResource wood();
	
	@Source("DSC06165.JPG")
	ImageResource beggarCard();
	
	@Source("DSC06166.JPG")
	ImageResource clayTwo();
	
	@Source("DSC06167.JPG")
	ImageResource woodTwo();
	
	@Source("DSC06170.JPG")
	ImageResource reedStoneFood();
	
	@Source("DSC06171.JPG")
	ImageResource cabaret();
	
//	@Source("DSC06172.JPG")
	@Source("bild3.jpg")
	ImageResource playerField();
	
	//@Source("DSC06174.JPG")
	@Source("bild5.jpg")
	ImageResource rounds8To14();
	
	//@Source("DSC06175.JPG")
	@Source("bild4.jpg")
	ImageResource cardField();
	
	//@Source("DSC06176.JPG")
	@Source("bild6.jpg")
	ImageResource rounds1To7();
	
	//@Source("DSC06177.JPG")
	@Source("bild2.jpg")
	ImageResource bigAcquisitionsField();
	
	@Source("DSC06178.JPG")
	ImageResource gamePhases();
	
	@Source("acker.JPG")
	ImageResource fieldMarker();
	
	@Source("cover.JPG")
	ImageResource cover();
	
	@Source("gemuese.png")
	ImageResource vegetableStone();
	
	@Source("getreide.png")
	ImageResource grainStone();

	@Source("holz.png")
	ImageResource woodStone();

	@Source("holzhaus.jpg")
	ImageResource woodHouse();
	
	@Source("steinhaus.jpg")
	ImageResource stoneHouse();

	@Source("kind_rosa.JPG")
	ImageResource childRosa();
	
	@Source("kind_blau.png")
	ImageResource childBlue();
	
	@Source("kind_gruen.JPG")
	ImageResource childGreen();
	
	@Source("kind_rot.JPG")
	ImageResource childRed();
	
	@Source("haus_rosa.JPG")
	ImageResource houseRosa();
	
	@Source("haus_blau.JPG")
	ImageResource houseBlue();
	
	@Source("haus_gruen.JPG")
	ImageResource houseGreen();
	
	@Source("haus_rot.JPG")
	ImageResource houseRed();

	@Source("lehm.png")
	ImageResource clayStone();

	@Source("lehmhaus.JPG")
	ImageResource clayHouse();

	@Source("nw.png")
	ImageResource foodMarker();

	@Source("rind.JPG")
	ImageResource cowMarker();

	@Source("schaaf.JPG")
	ImageResource sheepMarker();
	
	@Source("schwein.JPG")
	ImageResource boarMarker();
	
	@Source("stein.png")
	ImageResource stoneStone();
	
	@Source("schilf.png")
	ImageResource reedStone();
	
	@Source("boarIcon.JPG")
	ImageResource boarIcon();
	
	@Source("sheepIcon.JPG")
	ImageResource sheepIcon();
	
	@Source("cowIcon.JPG")
	ImageResource cowIcon();
	
	@Source("vegetableIcon.png")
	ImageResource vegetableIcon();
	
	@Source("grainIcon.JPG")
	ImageResource grainIcon();
	
	@Source("clayIcon.png")
	ImageResource clayIcon();
	
	@Source("stoneIcon.png")
	ImageResource stoneIcon();
	
	@Source("woodIcon.png")
	ImageResource woodIcon();
	
	@Source("reedIcon.png")
	ImageResource reedIcon();
}
