# Example project that highlight an issue with building a native application

note that `mvn javafx:run` works without problem but `mvn gluonfx:build` fails with:

```
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< org.example:jfxNativeExample >--------------------
[INFO] Building jfxNativeExample 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- gluonfx-maven-plugin:1.0.13:build (default-cli) @ jfxNativeExample ---
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< org.example:jfxNativeExample >--------------------
[INFO] Building jfxNativeExample 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> gluonfx-maven-plugin:1.0.13:compile (default-cli) > process-classes @ jfxNativeExample >>>
[INFO] 
[INFO] --- maven-enforcer-plugin:3.0.0:enforce (enforce-releases-maven-java) @ jfxNativeExample ---
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ jfxNativeExample ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Using 'null' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /home/per/project/javafx-native-example/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ jfxNativeExample ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 2 source files to /home/per/project/javafx-native-example/target/classes
[INFO] 
[INFO] <<< gluonfx-maven-plugin:1.0.13:compile (default-cli) < process-classes @ jfxNativeExample <<<
[INFO] 
[INFO] 
[INFO] --- gluonfx-maven-plugin:1.0.13:compile (default-cli) @ jfxNativeExample ---
Apr 22, 2022 4:37:14 PM com.gluonhq.substrate.util.Logger logInfo
INFO: Substrate is tested with the Gluon's GraalVM build which you can find at https://github.com/gluonhq/graal/releases.
While you can still use other GraalVM builds, there is no guarantee that these will work properly with Substrate
[Fri Apr 22 16:37:14 CEST 2022][INFO] ==================== COMPILE TASK ====================
             _______  ___      __   __  _______  __    _
            |       ||   |    |  | |  ||       ||  |  | |
            |    ___||   |    |  | |  ||   _   ||   |_| |
            |   | __ |   |    |  |_|  ||  | |  ||       |
            |   ||  ||   |___ |       ||  |_|  ||  _    |
            |   |_| ||       ||       ||       || | |   |
            |_______||_______||_______||_______||_|  |__|

    Access to the latest docs, tips and tricks and more info on
    how to get support? Register your usage of Gluon Substrate now at

    https://gluonhq.com/activate



[Fri Apr 22 16:37:14 CEST 2022][INFO] We will now compile your code for x86_64-linux-linux. This may take some time.
[Fri Apr 22 16:37:15 CEST 2022][INFO] [SUB] Warning: Ignoring server-mode native-image argument --no-server.
[Fri Apr 22 16:37:16 CEST 2022][INFO] [SUB] ========================================================================================================================
[Fri Apr 22 16:37:16 CEST 2022][INFO] [SUB] GraalVM Native Image: Generating 'se.alipsa.jfxnativetest.hello'...
[Fri Apr 22 16:37:16 CEST 2022][INFO] [SUB] ========================================================================================================================
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] [1/7] Initializing...
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] [GluonFeature] enabled for config com.oracle.svm.hosted.FeatureImpl$IsInConfigurationAccessImpl@6ca0256d
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]                                                                                     (1.3s @ 0.07GB)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Error: Error parsing JNI configuration in /home/per/project/javafx-native-example/target/gluonfx/x86_64-linux/gvm/jniconfig-x86_64-linux.json:
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Method com.sun.media.jfxmedia.locator.ConnectionHolder.getStreamSize() not found. To allow unresolvable reflection configuration, use option --allow-incomplete-classpath
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Verify that the configuration matches the schema described in the -H:PrintFlags=+ output for option JNIConfigurationFiles.
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] com.oracle.svm.core.util.UserError$UserException: Error parsing JNI configuration in /home/per/project/javafx-native-example/target/gluonfx/x86_64-linux/gvm/jniconfig-x86_64-linux.json:
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Method com.sun.media.jfxmedia.locator.ConnectionHolder.getStreamSize() not found. To allow unresolvable reflection configuration, use option --allow-incomplete-classpath
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Verify that the configuration matches the schema described in the -H:PrintFlags=+ output for option JNIConfigurationFiles.
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.core.util.UserError.abort(UserError.java:73)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.config.ConfigurationParserUtils.doParseAndRegister(ConfigurationParserUtils.java:135)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.config.ConfigurationParserUtils.lambda$parseAndRegisterConfigurations$1(ConfigurationParserUtils.java:86)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.ReferencePipeline$4$1.accept(ReferencePipeline.java:214)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.IntPipeline.reduce(IntPipeline.java:515)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at java.base/java.util.stream.IntPipeline.sum(IntPipeline.java:473)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.config.ConfigurationParserUtils.parseAndRegisterConfigurations(ConfigurationParserUtils.java:88)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.jni.access.JNIAccessFeature.afterRegistration(JNIAccessFeature.java:128)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGenerator.lambda$setupNativeImage$14(NativeImageGenerator.java:802)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.FeatureHandler.forEachFeature(FeatureHandler.java:74)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGenerator.setupNativeImage(NativeImageGenerator.java:802)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGenerator.doRun(NativeImageGenerator.java:534)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGenerator.run(NativeImageGenerator.java:494)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGeneratorRunner.buildImage(NativeImageGeneratorRunner.java:426)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGeneratorRunner.build(NativeImageGeneratorRunner.java:587)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGeneratorRunner.main(NativeImageGeneratorRunner.java:126)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]     at com.oracle.svm.hosted.NativeImageGeneratorRunner$JDK9Plus.main(NativeImageGeneratorRunner.java:617)
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] ------------------------------------------------------------------------------------------------------------------------
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]                          0.1s (6.5% of total time) in 9 GCs | Peak RSS: 0.53GB | CPU load: 8.89
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] ------------------------------------------------------------------------------------------------------------------------
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Produced artifacts:
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB]  /home/per/project/javafx-native-example/target/gluonfx/x86_64-linux/gvm/jfxNativeExample/se.alipsa.jfxnativetest.hello.build_artifacts.txt
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] ========================================================================================================================
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Failed generating 'se.alipsa.jfxnativetest.hello' after 1.0s.
[Fri Apr 22 16:37:17 CEST 2022][INFO] [SUB] Error: Image build request failed with exit status 1
[Fri Apr 22 16:37:17 CEST 2022][SEVERE] Process compile failed with result: 1
Check the log files under /home/per/project/javafx-native-example/target/gluonfx/x86_64-linux/gvm/log
And please check https://docs.gluonhq.com/ for more information.
[Fri Apr 22 16:37:17 CEST 2022][INFO] Logging process [compile] to file: /home/per/project/javafx-native-example/target/gluonfx/log/process-compile-1650638237285.log
[Fri Apr 22 16:37:17 CEST 2022][SEVERE] Compiling failed.
Check the log files under /home/per/project/javafx-native-example/target/gluonfx/x86_64-linux/gvm/log
And please check https://docs.gluonhq.com/ for more information.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.596 s
[INFO] Finished at: 2022-04-22T16:37:17+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.gluonhq:gluonfx-maven-plugin:1.0.13:compile (default-cli) on project jfxNativeExample: Compiling failed -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.743 s
[INFO] Finished at: 2022-04-22T16:37:17+02:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.gluonhq:gluonfx-maven-plugin:1.0.13:build (default-cli) on project jfxNativeExample: Error, gluonfx:build failed -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
```

