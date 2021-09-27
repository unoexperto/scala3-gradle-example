plugins {
    scala
    application
}

application {
    mainClass.set("Main")
    applicationDefaultJvmArgs = listOf("--enable-preview")
}

repositories.mavenCentral()

val scalaMajorVersion = '3'
val scalaVersion = "$scalaMajorVersion.0.2"

scala {
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:$scalaVersion")
    testImplementation("org.scalatest:scalatest_$scalaMajorVersion:3.2.10")
}

tasks {
    wrapper {
        gradleVersion = "7.4"
        distributionType = Wrapper.DistributionType.BIN
        distributionUrl = "https://downloads.gradle-dn.com/distributions-snapshots/gradle-7.4-20210926222420+0000-bin.zip"
    }

//    compileScala {
//        scalaCompileOptions.additionalParameters = listOf("-Xexperimental")
//    }
}
