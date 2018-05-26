name := "Cumulative standard deviation"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions in ThisBuild ++= Seq("-unchecked", "-deprecation")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "com.github.seancfoley" % "ipaddress" % "4.2.0"
//libraryDependencies += "org.apache.commons" % "commons-math3" % "3.6.1"