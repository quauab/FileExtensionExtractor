package com.gmail.ichglauben.fileextensionextractor.core.concretes;

import java.io.File;
import java.nio.file.Path;

import com.gmail.ichglauben.fileextensionextractor.core.abstracts.AbstractExtensionExtractor;
/**	
 * Concrete class that extends the AbstractExtensionExtractor class. Use this class to extract the extension from a file. This class provides
 * 6 overloaded methods to accomplish this task.
 *	@see java.io.File
 *	@see java.nio.file.Path
 *	@author	Rick Walker
 *	@version 0.1
 *	@since 5/8/2016
*/
public class ExtensionExtractor extends AbstractExtensionExtractor {
	/**Single default constructor that overrides it's parent*/
	public ExtensionExtractor() {
		super();
	}

	/**Use this method to extract the extension of the file referenced by this Path.
	 * @param path - <b><i>Path</i></b> The absolute Path
	 * @return <b><i>String</i></b> The file's extension, including the dot*/
	public static String extract(Path path) {
		if (null != path) {
			return extractExtension(path);
		}
		return null;
	}

	/**Use this method to extract the extension of this File.
	 * @param file - <b><i>File</i></b> The absolute File
	 * @return <b><i>String</i></b> The file's extension, including the dot*/
	public static String extract(File path) {
		if (null != path) {
			return extractExtension(path);
		}
		return null;
	}

	/**Use this method to extract the extension from the file at the end of this file-path.
	 * @param filePath - <b><i>String</i></b> The absolute file path
	 * @return <b><i>String</i></b> The file's extension, including the dot*/
	public static String extract(String filePath) {
		if (null != filePath) {
			return extractExtension(filePath);
		}
		return null;
	}

	/**Use this method to extract the extension of the file referenced by this Path.
	 * @param path - <b><i>Path</i></b> The absolute Path
	 * @param withoutDot <b><i>boolean</i></b> If true, return the extension without the dot
	 * @return <b><i>String</i></b> The file's extension, excluding the dot*/
	public static String extract(Path path, boolean withoutDot) {
		if (null != path) {
			if (withoutDot) {
				String ext = null;
				if (null != (ext = extractExtension(path))) {
					int dot = ext.lastIndexOf(".");
					if (dot != -1) {
						return ext.substring(dot + 1);
					}
				}
			} else {
				return extractExtension(path);
			}
		}
		return null;
	}

	/**Use this method to extract the extension of this File.
	 * @param file - <b><i>File</i></b> The absolute File
	 * @param withoutDot - <b><i>boolean</i></b> If true, return the extension without the dot
	 * @return <b><i>String</i></b> The file's extension, excluding the dot*/
	public static String extract(File file, boolean withoutDot) {
		if (null != file) {
			if (withoutDot) {
				String ext = null;
				if (null != (ext = extractExtension(file))) {
					int dot = ext.lastIndexOf(".");
					if (dot != -1) {
						return ext.substring(dot + 1);
					}
				}
			} else {
				return extractExtension(file);
			}
		}
		return null;
	}

	/**Use this method to extract the extension from the file at the end of this file-path.
	 * @param filePath - <b><i>String</i></b> The absolute file path
	 * @param withoutDot - <b><i>boolean</i></b> If true, return the extension without the dot
	 * @return <b><i>String</i></b> The file's extension, excluding the dot*/
	public static String extract(String filePath, boolean withoutDot) {
		if (null != filePath) {
			if (withoutDot) {
				String ext = null;
				if (null != (ext = extractExtension(filePath))) {
					int dot = ext.lastIndexOf(".");
					if (dot != -1) {
						return ext.substring(dot + 1);
					}
				}
			} else {
				return extractExtension(filePath);
			}
		}
		return null;
	}

	public String toString() {
		return "File Extension Extractor";
	}
}
