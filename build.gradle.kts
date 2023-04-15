plugins {
    scala
    application
}

application {
    mainClass.set("Main")
//    applicationDefaultJvmArgs = listOf("--enable-preview")
}

repositories.mavenCentral()

val scalaVersion = "3.3.1-RC1-bin-20230412-e940957-NIGHTLY"

scala {
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:$scalaVersion") // https://mvnrepository.com/artifact/org.scala-lang/scala3-library_3
    testImplementation("org.scalatest:scalatest_3:3.3.0-SNAP4") // https://mvnrepository.com/artifact/org.scalatest/scalatest_3/
}

tasks {
    withType<Wrapper>().all {
        gradleVersion = "8.0"
        distributionType = Wrapper.DistributionType.BIN
    }

//    compileScala {
//        scalaCompileOptions.additionalParameters = listOf("-Xexperimental")
//    }
}
