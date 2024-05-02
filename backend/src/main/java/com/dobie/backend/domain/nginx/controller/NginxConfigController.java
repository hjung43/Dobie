package com.dobie.backend.domain.nginx.controller;

import com.dobie.backend.domain.nginx.service.NginxConfigService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Tag(name = "NginxConfig 컨트롤러", description = "NginxConfig Controller API")
@RestController
@RequestMapping("/nginx")
@RequiredArgsConstructor
public class NginxConfigController {

    private final NginxConfigService nginxConfigService;

    @Operation(summary = "nginx proxy config 파일 생성",  description = "프로젝트ID, 프로젝트이름")
    @PostMapping("/proxyConf")
    public ResponseEntity<?> nginxConfig(@RequestParam(name = "projectId") int projectId, @RequestParam(name = "projectName") String projectName) {
        nginxConfigService.saveProxyNginxConfigTest(projectId, projectName);
        return new ResponseEntity<String>("성공", HttpStatus.OK);
    }

    @Operation(summary = "nginx front config 파일 생성",  description = "파일경로, 프로젝트이름")
    @PostMapping("/proxyConf")
    public ResponseEntity<?> nginxConfig(@RequestParam(name = "projectName") String projectName, @RequestParam(name = "path") String path) throws IOException {
        nginxConfigService.saveFrontNginxConfigFile(path, projectName);
        return new ResponseEntity<String>("성공", HttpStatus.OK);
    }
}
