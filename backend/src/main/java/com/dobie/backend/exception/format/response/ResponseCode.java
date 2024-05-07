package com.dobie.backend.exception.format.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {

    /* 프로젝트(Project) */
    PROJECT_LIST_FETCHED(HttpStatus.OK, "프로젝트가 성공적으로 조회되었습니다."),
    PROJECT_LIST_NOT_FOUND(HttpStatus.OK, "등록된 프로젝트가 없습니다."),
    PROJECT_CREATE_SUCCESS(HttpStatus.OK, "프로젝트가 성공적으로 등록되었습니다."),
    PROJECT_INFO_UPDATED(HttpStatus.OK, "프로젝트 정보가 성공적으로 수정되었습니다."),
    PROJECT_DELETE_SUCCESS(HttpStatus.OK, "프로젝트가 성공적으로 삭제되었습니다."),
    PROJECT_BUILD_SUCCESS(HttpStatus.OK, "프로젝트가 성공적으로 빌드되었습니다."),
    PROJECT_RUN_SUCCESS(HttpStatus.OK, "프로젝트가 성공적으로 실행되었습니다."),
    PROJECT_STOP_SUCCESS(HttpStatus.OK, "프로젝트가 성공적으로 정지되었습니다."),
    SERVICE_STOP_SUCCESS(HttpStatus.OK, "서비스가 성공적으로 정지되었습니다."),
    /* 컨테이너(container) */
    CONTAINER_STATUS_SUCCESS(HttpStatus.OK, "설치된 컨테이너 실행 상태 분석이 완료되었습니다."),
    /* 도커파일(Dockerfile) */
    DOCKER_FILE_INSTALL_SUCCESS(HttpStatus.OK, "도커파일이 성공적으로 설치되었습니다."),
    ;

    private final HttpStatus status;
    private final String message;

}
