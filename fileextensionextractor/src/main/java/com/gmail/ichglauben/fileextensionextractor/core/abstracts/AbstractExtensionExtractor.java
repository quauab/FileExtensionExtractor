package com.gmail.ichglauben.fileextensionextractor.core.abstracts;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.gmail.ichglauben.fileextensionextractor.utils.abstracts.CustomClass;

public class AbstractExtensionExtractor extends CustomClass {
	public AbstractExtensionExtractor() {
		super();
	}

	protected static String extractExtension(String file_path) {
		if (null != file_path && (!file_path.isEmpty()) && (file_path.length() > 0)) {
			Path path = Paths.get(file_path);
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
