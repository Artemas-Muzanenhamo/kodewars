plugins {
    kotlin("jvm") version "1.4.31"
}

repositories {
    jcenter()
}

dependencies {
    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // JUnit5
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.0")
}

tasks {
    "test"(Test::class) {
        useJUnitPlatform()
        testLogging {
            events("PASSED", "FAILED", "SKIPPED")
        }
    }
}
