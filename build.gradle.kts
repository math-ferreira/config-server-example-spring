import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.3.12.RELEASE"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.21"
	kotlin("plugin.spring") version "1.5.21"
}

buildscript {
	dependencies {
		classpath("io.spring.gradle:dependency-management-plugin:1.0.10.RELEASE")
	}
}

apply(plugin = "io.spring.dependency-management")
apply(plugin = "org.springframework.boot")


repositories {
	mavenCentral()
}

group = "br.com.soultech"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR12")
	}
}

dependencies {
	implementation("org.springframework.cloud:spring-cloud-config-server:2.2.8.RELEASE")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:2.2.9.RELEASE")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
