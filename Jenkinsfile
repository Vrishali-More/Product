pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for UAT envrinoment..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing for UAT envrinoment..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying in UAT to move PROD....'
            }
        }
    }
}
