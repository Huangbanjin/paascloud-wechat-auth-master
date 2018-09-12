package com.paascloud.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.paascloud.gateway.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SEND_RESPONSE_FILTER_ORDER;

/**
 * @author liuweijw 网关日志拦截器
 */
@Component
public class LoggerFilter extends ZuulFilter {

	@Autowired
	private LogService logService;

	@Override
	public String filterType() {
		return POST_TYPE;
	}

	@Override
	public int filterOrder() {
		return SEND_RESPONSE_FILTER_ORDER - 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		logService.send(RequestContext.getCurrentContext());
		return null;
	}
}
