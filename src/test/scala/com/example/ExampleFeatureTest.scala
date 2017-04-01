package com.example

import com.twitter.inject.app.TestInjector
import org.scalatest.FunSpec

class FooService

class BarService

class ExampleFeatureTest extends FunSpec {

  val inject = TestInjector()
    .bind[FooService](new FooService)
    .bind[BarService, BarBinding](new BarService)
//  java.lang.NoClassDefFoundError: com/twitter/inject/app/InjectionServiceWithAnnotationModule
//  at com.twitter.inject.app.TestInjector.bind(TestInjector.scala:118)
//  at com.example.ExampleFeatureTest.<init>(ExampleFeatureTest.scala:13)
//  at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
//  at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
//  at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
//  at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
//  at java.lang.Class.newInstance(Class.java:442)
//  at org.scalatest.tools.Framework$ScalaTestTask.execute(Framework.scala:646)
//  at sbt.TestRunner.runTest$1(TestFramework.scala:76)
//  at sbt.TestRunner.run(TestFramework.scala:85)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1$$anonfun$apply$8.apply(TestFramework.scala:202)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1$$anonfun$apply$8.apply(TestFramework.scala:202)
//  at sbt.TestFramework$.sbt$TestFramework$$withContextLoader(TestFramework.scala:185)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1.apply(TestFramework.scala:202)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1.apply(TestFramework.scala:202)
//  at sbt.TestFunction.apply(TestFramework.scala:207)
//  at sbt.Tests$$anonfun$9.apply(Tests.scala:216)
//  at sbt.Tests$$anonfun$9.apply(Tests.scala:216)
//  at sbt.std.Transform$$anon$3$$anonfun$apply$2.apply(System.scala:44)
//  at sbt.std.Transform$$anon$3$$anonfun$apply$2.apply(System.scala:44)
//  at sbt.std.Transform$$anon$4.work(System.scala:63)
//  at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:226)
//  at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:226)
//  at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:17)
//  at sbt.Execute.work(Execute.scala:235)
//  at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:226)
//  at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:226)
//  at sbt.ConcurrentRestrictions$$anon$4$$anonfun$1.apply(ConcurrentRestrictions.scala:159)
//  at sbt.CompletionService$$anon$2.call(CompletionService.scala:28)
//  at java.util.concurrent.FutureTask.run(FutureTask.java:266)
//  at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
//  at java.util.concurrent.FutureTask.run(FutureTask.java:266)
//  at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
//  at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
//  at java.lang.Thread.run(Thread.java:745)
//  Caused by: java.lang.ClassNotFoundException: com.twitter.inject.app.InjectionServiceWithAnnotationModule
//  at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
//  at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
//  at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
//  at com.twitter.inject.app.TestInjector.bind(TestInjector.scala:118)
//  at com.example.ExampleFeatureTest.<init>(ExampleFeatureTest.scala:13)
//  at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
//  at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
//  at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
//  at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
//  at java.lang.Class.newInstance(Class.java:442)
//  at org.scalatest.tools.Framework$ScalaTestTask.execute(Framework.scala:646)
//  at sbt.TestRunner.runTest$1(TestFramework.scala:76)
//  at sbt.TestRunner.run(TestFramework.scala:85)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1$$anonfun$apply$8.apply(TestFramework.scala:202)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1$$anonfun$apply$8.apply(TestFramework.scala:202)
//  at sbt.TestFramework$.sbt$TestFramework$$withContextLoader(TestFramework.scala:185)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1.apply(TestFramework.scala:202)
//  at sbt.TestFramework$$anon$2$$anonfun$$init$$1.apply(TestFramework.scala:202)
//  at sbt.TestFunction.apply(TestFramework.scala:207)
//  at sbt.Tests$$anonfun$9.apply(Tests.scala:216)
//  at sbt.Tests$$anonfun$9.apply(Tests.scala:216)
//  at sbt.std.Transform$$anon$3$$anonfun$apply$2.apply(System.scala:44)
//  at sbt.std.Transform$$anon$3$$anonfun$apply$2.apply(System.scala:44)
//  at sbt.std.Transform$$anon$4.work(System.scala:63)
//  at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:226)
//  at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:226)
//  at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:17)
//  at sbt.Execute.work(Execute.scala:235)
//  at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:226)
//  at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:226)
//  at sbt.ConcurrentRestrictions$$anon$4$$anonfun$1.apply(ConcurrentRestrictions.scala:159)
//  at sbt.CompletionService$$anon$2.call(CompletionService.scala:28)
//  at java.util.concurrent.FutureTask.run(FutureTask.java:266)
//  at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
//  at java.util.concurrent.FutureTask.run(FutureTask.java:266)
//  at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
//  at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
//  at java.lang.Thread.run(Thread.java:745)

  describe("test") {
    it("test") {
      assert(true)
    }
  }
}
