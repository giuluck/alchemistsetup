/*
 * DEFAULT GRADLE BUILD FOR ALCHEMIST SIMULATOR
 */

plugins {
    `java-library`
}

repositories {
    mavenCentral()
    /* 
     * The following repositories contain beta features and should be added for experimental mode only
     * 
     * maven("https://dl.bintray.com/alchemist-simulator/Alchemist/")
     * maven("https://dl.bintray.com/protelis/Protelis/")
     */
}

dependencies {
    // it is highly recommended to replace the '+' symbol with a fixed version
    api("it.unibo.alchemist:alchemist:+")
}