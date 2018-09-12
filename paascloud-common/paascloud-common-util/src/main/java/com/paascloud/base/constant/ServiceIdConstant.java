package com.paascloud.base.constant;

/**
 * @author liuweijw 服务ID名称
 */
public interface ServiceIdConstant {
	/**
	 * 认证服务的SERVICEID（zuul 配置的对应）
	 */
	String	AUTH_SERVICE	= "paascloud-gateway";

	/**
	 * ADMIN模块
	 */
	String	ADMIN_SERVICE	= "paascloud-provider-uac";
}
