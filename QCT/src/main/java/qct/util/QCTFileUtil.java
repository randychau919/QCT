package qct.util;

import org.apache.commons.io.FileUtils;

public class QCTFileUtil extends FileUtils {
	/**
	 * Get input source file path
	 * 
	 * @retun projectPath
	 */
	public static String getProjectPath() {
		String projectPath = System.getProperty("user.dir");
		return projectPath;
	}
}