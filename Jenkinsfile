pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out..'
                checkout scm

            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                powershell label: '', script: './gradlew build'

                echo 'Building docker image..'
                powershell label: '', script: './gradlew bootBuildImage'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Kill and remove previous image'
                powershell label: '', script: 'docker rm -f miniproject'
                echo 'Deploying....'
                powershell label: '', script: 'docker run --name miniproject  -dp 8090:8090  miniproject:0.0.1-SNAPSHOT'
            }
        }
    }
}