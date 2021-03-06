plugins {
    id("org.jetbrains.kotlin.js") version "1.4.21"
    `maven-publish`
}

group = "com.zxy"
version = "1.0.5"

repositories {
    mavenLocal()
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
    maven("https://dl.bintray.com/samgarasx/kotlin-js-wrappers")
    mavenCentral()
    jcenter()
}
kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))

    val reactVersion = "17.0.0"
    val kotlinReactVersion = "17.0.0-pre.129"

    implementation("org.jetbrains:kotlin-react:$kotlinReactVersion-kotlin-1.4.21")
    implementation("org.jetbrains:kotlin-react-dom:$kotlinReactVersion-kotlin-1.4.21")
    implementation("org.jetbrains:kotlin-styled:5.2.0-pre.129-kotlin-1.4.21")

    implementation(npm("notistack", version as String))
}

publishing {
    repositories {
        mavenLocal()
    }
    publications {
        create<MavenPublication>("maven") {
            groupId = groupId
            artifactId = "material-ui-kotlin-react-pickers"
            version = version

            from(components["kotlin"])
        }
    }
}