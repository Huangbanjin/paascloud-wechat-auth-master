/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OpcOssFeignHystrix.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service.hystrix;

import com.paascloud.base.dto.ElementImgUrlDto;
import com.paascloud.provider.model.dto.oss.OptBatchGetUrlRequest;
import com.paascloud.provider.model.dto.oss.OptGetUrlRequest;
import com.paascloud.provider.model.dto.oss.OptUploadFileReqDto;
import com.paascloud.provider.model.dto.oss.OptUploadFileRespDto;
import com.paascloud.provider.service.OpcOssFeignApi;
import com.paascloud.wrapper.WrapMapper;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * The class Opc oss feign api hystrix.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class OpcOssFeignHystrix implements OpcOssFeignApi {
	@Override
	public Wrapper<OptUploadFileRespDto> uploadFile(final OptUploadFileReqDto optUploadFileReqDto) {
		return WrapMapper.error();
	}

	@Override
	public Wrapper<List<OptUploadFileRespDto>> uploadFiles(List<OptUploadFileReqDto> fileReqDtoList) {
		return WrapMapper.error();
	}

	@Override
	public Wrapper<String> getFileUrl(final OptGetUrlRequest optGetUrlRequest) {
		return WrapMapper.error();
	}

	@Override
	public Wrapper<List<ElementImgUrlDto>> listFileUrl(OptBatchGetUrlRequest urlRequest) {
		return WrapMapper.error();
	}

	@Override
	public Wrapper<OptUploadFileRespDto> handleFileUpload(final MultipartFile file) {
		return WrapMapper.error();
	}

	@Override
	public void deleteExpireFile() {

	}
}
