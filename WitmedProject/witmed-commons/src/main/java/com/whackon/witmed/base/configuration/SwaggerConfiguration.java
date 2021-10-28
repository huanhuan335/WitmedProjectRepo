package com.whackon.witmed.base.configuration;

import com.whackon.witmed.base.util.BaseConstants;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <b>系统基础信息 - Swagger 文档接口工具配置类</b>
 * @author Arthur
 * @version 1.0.0
 */
@Configuration
public class SwaggerConfiguration {
	public Docket createRestAPI() {
		return new Docket(DocumentationType.SWAGGER_2)
				// 设定文档信息
				.apiInfo(apiInfo())
				// 设定文档扫描基础包
				.select()
				.apis(RequestHandlerSelectors.basePackage(BaseConstants.SWAGGER_BASE_PACKAGE))
				.paths(PathSelectors.any())
				.build();
	}

	/**
	 * <b>生成文档信息</b>
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				// 设定文档生成标题
				.title(BaseConstants.SWAGGER_TITLE)
				// 设定文档描述信息
				.description(BaseConstants.SWAGGER_DESCRIPTION)
				// 设定文档版本
				.version(BaseConstants.SWAGGER_VERSION)
				// 设定文档联系人信息
				.contact(new Contact(BaseConstants.SWAGGER_CONTACT_NAME,
						BaseConstants.SWAGGER_CONTACT_URL,
						BaseConstants.SWAGGER_CONTACT_EMAIL))
				.build();
	}
}
