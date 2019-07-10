package com.app.apt.inter;

import com.app.apt.AnnotationProcessor;

import javax.annotation.processing.RoundEnvironment;

/**
 *
 * 注解处理器接口
 */

public interface IProcessor {
    void process(RoundEnvironment roundEnv, AnnotationProcessor mAbstractProcessor);
}
