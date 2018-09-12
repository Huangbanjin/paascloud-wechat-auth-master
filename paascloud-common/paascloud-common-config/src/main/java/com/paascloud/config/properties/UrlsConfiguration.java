package com.paascloud.config.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有需要过滤URL的配置，urls.collects 模式
 * 
 * @author liuweijw
 */
@Configuration
@ConditionalOnExpression("!'${urls}'.isEmpty()")
@ConfigurationProperties(prefix = "urls")
public class UrlsConfiguration {

	private List<String>	collects	= new ArrayList<>();

	public List<String> getCollects() {
		return collects;
	}

	public void setCollects(List<String> collects) {
		this.collects = collects;
	}

}
