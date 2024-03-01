plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

spotbugs {
    ignoreFailures = false
    showStackTraces = true
    showProgress = true
    reportLevel = "default"
    effort = "default"
//    visitors = [ 'FindSqlInjection', 'SwitchFallthrough' ]
//    omitVisitors = [ 'FindNonShortCircuit' ]
//    reportsDir = file("$buildDir/reports/spotbugs")
//    includeFilter = file('spotbugs-include.xml')
//    excludeFilter = file('spotbugs-exclude.xml')
//    onlyAnalyze = ['com.foobar.MyClass', 'com.foobar.mypkg.*']
//    projectName = name
//    release = version
//    extraArgs = [ '-nested:false' ]
//    jvmArgs = [ '-Duser.language=ja' ]
//    maxHeapSize = '512m
}