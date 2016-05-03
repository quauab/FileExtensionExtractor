package com.gmail.ichglauben.fileextensionextractor.core.concretes;

import java.io.File;
import java.nio.file.Path;

import com.gmail.ichglauben.fileextensionextractor.core.abstracts.AbstractExtensionExtractor;

public class ExtensionExtractor extends AbstractExtensionExtractor {
	public ExtensionExtractor() {
		super();
	}

	public static String extract(Path path) {
		if (null != path) {
			return extractExtension(path);
		}
		return null;
	}

	public static String extract(File path) {
		if (null != path) {
			return extractExtension(path);
		}
		return null;
	}

	public static String extract(String path) {
		if (null != path) {
			return extractExtension(path);
		}
		return null;
	}

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

	public static String extract(File path, boolean withoutDot) {
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

	public static String extract(String path, boolean withoutDot) {
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

	public String toString() {
		return "File Extension Extractor";
	}
}
