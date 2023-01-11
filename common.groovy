def call (string  stageName){
    if ("${stageName}" == "Build"){
        sh "mvn clean package "
    }
    else if ("${stageName}" == "Sonarqube Analyses"){
        sh "mvn sonar:sonar"
    }
    else if ("${stageName}" == "UploadArtfacts"){
        sh "mvn deploy"
    }
}
