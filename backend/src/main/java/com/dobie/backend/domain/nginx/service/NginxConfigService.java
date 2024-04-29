package com.dobie.backend.domain.nginx.service;

import com.dobie.backend.domain.nginx.dto.NginxConfigGetResponseDto;

public interface NginxConfigService {
    String createReverseProxyNginxConfig(NginxConfigGetResponseDto nginxConfig);

    String httpsConfig(NginxConfigGetResponseDto nginxConfig);

    String defaultConfig(NginxConfigGetResponseDto nginxConfig);
}