name := "firstTaks2"
 
version := "1.0" 
      
lazy val `firsttaks2` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

libraryDependencies += "com.sfxcode.nosql" %% "simple-mongo" % "latest.release"

libraryDependencies += "org.apache.logging.log4j" % "log4j-api-scala" % "12.0"


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      