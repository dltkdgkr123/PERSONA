package com.ssafy.project.common.security.exception;

import com.ssafy.project.common.util.constant.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommonApiException extends RuntimeException{
    private final ErrorCode errorCode;
}
