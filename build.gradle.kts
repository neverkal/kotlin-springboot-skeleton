import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21"
    kotlin("kapt") version "1.6.21"
}

group = "com.wesang"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.boot:spring-boot-starter-cache")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.google.code.gson:gson")
    implementation("com.querydsl:querydsl-jpa:5.0.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.8")
    implementation("redis.clients:jedis:4.2.3")
    implementation("org.ehcache:ehcache:3.10.0")
    implementation("javax.cache:cache-api:1.1.1")
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.10")
    implementation("org.slf4j:slf4j-api:1.7.30")
    kapt("com.querydsl:querydsl-apt:5.0.0:jpa")
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    runtimeOnly("com.h2database:h2")
    runtimeOnly("net.logstash.logback:logstash-logback-encoder:7.2")
    runtimeOnly("mysql:mysql-connector-java")
    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor("javax.persistence:javax.persistence-api")
    annotationProcessor("javax.annotation:javax.annotation-api")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.kotest:kotest-runner-junit5:5.2.3")
    testImplementation("io.kotest:kotest-assertions-core:5.2.3")
    
    kotlin.sourceSets.main {
        setBuildDir("$buildDir")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
