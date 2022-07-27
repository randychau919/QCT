package qct.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import qct.system.SystemInfo;
import qct.util.QCTFileUtil;

@Configuration
public class QCTWebMvcConfig implements WebMvcConfigurer {
	// https://gist.github.com/pavankjadda/8d17d697f86c1b80cc06c39cec74c87e
	protected static final String[] RESOURCE_LOCATION = {
			"classpath:/META-INF/resources/", "classpath:/resources/",
			"classpath:/static/" };

	/*********** Resource path ***********/
	protected String cssPath = "classpath:/static/css/";

	protected String libPath = "classpath:/static/lib/";

	protected String imgPath = "classpath:/static/img/";

	protected String scriptPath = "classpath:/static/script/";

	/*********** Javascript source path ***********/
	protected String jqueryPath = "classpath:/static/lib/jquery/"
			+ SystemInfo.getJqueryVersion() + "/";

	protected String axiosPath = "classpath:/static/lib/axios/"
			+ SystemInfo.getAxiosVersion() + "/";

	protected String vuePath = "classpath:/static/lib/vue/"
			+ SystemInfo.getVueVersion() + "/";

	protected String popperPath = "classpath:/static/lib/popper/"
			+ SystemInfo.getPopperVersion() + "/";

	protected String jsBootstrapPath = "classpath:/static/lib/bootstrap/"
			+ SystemInfo.getBootstrapVersion() + "/";

	protected String veeValidatePath = "classpath:/static/lib/vee_validate/"
			+ SystemInfo.getVeeVidateVersion() + "/";

	protected String jsVue2DropzonePath = "classpath:/static/lib/vue2Dropzone/"
			+ SystemInfo.getVue2DropzoneVersion() + "/";

	protected String cssVue2DropzonePath = "classpath:/static/css/vue2Dropzone/";

	protected String dropzonePath = "classpath:/static/lib/dropzone/"
			+ SystemInfo.getDropzoneVersion() + "/";

	/*********** Css source path ***********/
	protected String cssBootstrapPath = "classpath:/static/css/bootstrap/"
			+ SystemInfo.getBootstrapVersion() + "/";

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATION);
		
		// Load file directly
		registry.addResourceHandler("/file/static/**").addResourceLocations("file:///" + QCTFileUtil.getProjectPath() + "/src/main/resources/static/");
		registry.addResourceHandler("/file/templates/**").addResourceLocations("file:///" + QCTFileUtil.getProjectPath() + "/src/main/resources/templates/");
		// css
		registry.addResourceHandler("/css/**").addResourceLocations(cssPath);
		// lib
		registry.addResourceHandler("/lib/**").addResourceLocations(libPath);
		// img
		registry.addResourceHandler("/img/**").addResourceLocations(imgPath);
		// script
		registry.addResourceHandler("/script/**").addResourceLocations(
				scriptPath);
		// jquery
		registry.addResourceHandler("/jquery/**").addResourceLocations(
				jqueryPath);
		// axios
		registry.addResourceHandler("/axios/**").addResourceLocations(
				axiosPath);
		// vue
		registry.addResourceHandler("/vue/**").addResourceLocations(vuePath);
		// vue2Dropzone/js
		registry.addResourceHandler("/vue2Dropzone/js/**").addResourceLocations(
				jsVue2DropzonePath);
		// vue2Dropzone/css
		registry.addResourceHandler(
				"/vue2Dropzone/css/**").addResourceLocations(
						cssVue2DropzonePath);
		// dropzone
		registry.addResourceHandler("/dropzone/**").addResourceLocations(
				dropzonePath);
		// vee-validate
		registry.addResourceHandler("/veeValidate/**").addResourceLocations(
				veeValidatePath);
		// popper/umd
		registry.addResourceHandler("/popper/**").addResourceLocations(
				popperPath);
		// bootstrap/css
		registry.addResourceHandler("/bootstrap/css/**").addResourceLocations(
				cssBootstrapPath);
		// bootstrap/js
		registry.addResourceHandler("/bootstrap/js/**").addResourceLocations(
				jsBootstrapPath);
	}
}