plugins {
	java
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
	jacoco
}

group = "arqui"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("net.logstash.logback:logstash-logback-encoder:7.2")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	//implementation("mysql:mysql-connector-java:8.0.32")
	annotationProcessor("org.projectlombok:lombok:1.18.28")
	testImplementation("com.h2database:h2:2.2.220")
	implementation("org.projectlombok:lombok:1.18.28")
	implementation("io.micrometer:micrometer-registry-new-relic:1.11.3")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("io.springfox:springfox-swagger2:2.9.2")
    implementation ("io.springfox:springfox-swagger-ui:2.9.2")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
/*tasks.test {
	finalizedBy(tasks.jacoco)
}

tasks.jacocoTestReport {
	dependsOn(tasks.test)
	reports {
		csv.required.set(true)
	}
}
jacoco{
	toolVersion = "0.8.8"
}
*/
