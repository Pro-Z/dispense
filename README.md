# dispense

功能:

通过注解实现分发任务。

第一步:

defaultConfig {

    
    ......
    
    javaCompileOptions {
    
            annotationProcessorOptions {
                includeCompileClasspath = true
            }
    }
}

第二步:

添加依赖

    implementation 'com.github.Pro-Z.dispense:dispenseprocessing:v1.0.0'
    implementation 'com.github.Pro-Z.dispense:dispenseprocessing-annotation:v1.0.0'
    annotationProcessor 'com.github.Pro-Z.dispense:dispenseprocessing-compiler:v1.0.0'
    
第三步:

在类头添加注解 @Dispense
    
