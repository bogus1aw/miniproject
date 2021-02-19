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
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}