package qct.system;

import org.springframework.stereotype.Component;

@Component
public class SystemInfo {
	public static final String JQUERY_VERSION_3_5_0 = "3.5.0";

	public static final String AXIOS_VERSION_0_20_0 = "0.20.0";

	public static final String POPPER_VERSION_2_5_3 = "2.5.3";

	public static final String BOOTSTRAP_VERSION_4_5_3 = "4.5.3";

	public static final String VUE_VERSION_2_6_11 = "2.6.11";

	public static final String DROPZONE_VERSION_5_7_0 = "5.7.0";

	public static final String VUE2_DROPZONE_VERSION_3_6_0 = "3.6.0";

	public static final String VEE_VALIDATE_VERSION_2_2_15 = "2.2.15";

	/*
	 * Get Jquery version
	 */
	public static String getJqueryVersion() {
		return JQUERY_VERSION_3_5_0;
	}

	/*
	 * Get Axios version
	 */
	public static String getAxiosVersion() {
		return AXIOS_VERSION_0_20_0;
	}

	/*
	 * Get Popper version
	 */
	public static String getPopperVersion() {
		return POPPER_VERSION_2_5_3;
	}

	/*
	 * Get Bootstrap version
	 */
	public static String getBootstrapVersion() {
		return BOOTSTRAP_VERSION_4_5_3;
	}

	/*
	 * Get Vue version
	 */
	public static String getVueVersion() {
		return VUE_VERSION_2_6_11;
	}

	/*
	 * Get Dropzone version
	 */
	public static String getDropzoneVersion() {
		return DROPZONE_VERSION_5_7_0;
	}

	/*
	 * Get Vue2 Dropzone version
	 */
	public static String getVue2DropzoneVersion() {
		return VUE2_DROPZONE_VERSION_3_6_0;
	}

	/*
	 * Get Vee Validate version
	 */
	public static String getVeeVidateVersion() {
		return VEE_VALIDATE_VERSION_2_2_15;
	}
}