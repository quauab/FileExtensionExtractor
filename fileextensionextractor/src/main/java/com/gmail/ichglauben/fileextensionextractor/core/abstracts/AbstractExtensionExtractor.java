package com.gmail.ichglauben.fileextensionextractor.core.abstracts;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.gmail.ichglauben.fileextensionextractor.utils.abstracts.CustomClass;
/**	
 * Abstract class used to extract a file's extension. This class provides 3 overloaded static methods to accomplish this task.
 *	@see java.io.File
 *	@see java.nio.file.Path
 *	@see java.nio.file.Paths
 *	@author	Rick Walker
 *	@version 0.1
 *	@since 5/8/2016
*/
public abstract class AbstractExtensionExtractor extends CustomClass {
	/**Single default constructor*/
	public AbstractExtensionExtractor() {
		super();
	}

	/**Use this method to extract the extension from the file at the end of this file path.
	 * @param filePath - <b><i>String</i></b> The file at the end of this path
	 * @return <b><i>String</i></b> The file's extension, including the dot*/
	protected static String extractExtension(String filePath) {
		if (null != filePath && (!filePath.isEmpty()) && (filePath.length() > 0)) {
			Path path = Paths.get(filePath);
			if (path.toFile().exists() && path.toFile().isFile()) {
				String name = path.getFileName().toString();
				int index = name.lastIndexOf(".");
				if (index != -1) {
					return name.substring(index);
				}
			}
		}
		return null;
	}

	/**Use this method to extract the extension from this Path.
	 * @param path - <b><i>Path</i></b> The absolute Path
	 * @return <b><i>String</i></b> The file's extension, including the dot*/
	protected static String extractExtension(Path path) {
		if (null != path) {
			if (path.toFile().exists() && path.toFile().isFile()) {
				String name = path.getFileName().toString();
				int index = name.lastIndexOf(".");
				if (index != -1) {
					return name.substring(index);
				}
			}
		}
		return null;
	}

	/**Use this method to extract the extension from this File.
	 * @param file - <b><i>File</i></b> The absolute File
	 * @return <b><i>String</i></b> The file's extension, including the dot*/
	protected static String extractExtension(File file) {
		if (null != file) {
			if (file.exists() && file.isFile()) {
				String name = file.toPath().getFileName().toString();
				int index = name.lastIndexOf(".");
				if (index != -1) {
					return name.substring(index);
				}
			}
		}
		return null;
	}

	public String toString() { return "Abstract File Extension Extractor"; }
}
