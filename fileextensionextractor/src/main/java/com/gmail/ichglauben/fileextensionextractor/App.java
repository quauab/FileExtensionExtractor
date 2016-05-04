package com.gmail.ichglauben.fileextensionextractor;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.gmail.ichglauben.fileextensionextractor.core.concretes.ExtensionExtractor;
import com.gmail.ichglauben.fileextensionextractor.utils.abstracts.CustomClass;

public class App extends CustomClass {
	public static void main(String[] args) {
//		ExtensionExtractor
		String img1 = "K:\\media\\graphics\\jpegs\\cats\\misc\\ocelot.jpg",
				img2 = "K:\\media\\graphics\\jpegs\\cats\\misc\\serval.jpg",
				img3 = "K:\\media\\graphics\\jpegs\\cats\\misc\\bobcat.jpg";
		String [] imgs = {img2,img1,img3};
		String ext = null, extNoDot = null;
		
		for (String img : imgs) {
			Path path = null;
			if (null != (path = Paths.get(img)) ) {
				if (path.toFile().exists() && null != (ext = ExtensionExtractor.extract(path)) && null != (extNoDot = ExtensionExtractor.extract(path,true)))
					print(path.getFileName() + "\tExt: " + ext + "\tExt No Dot: " + extNoDot);
			}
		}
	}
}
