pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Clonage du dépôt...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compilation...'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Tests...'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging...'
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Pipeline réussi !'
        }
        failure {
            echo 'Pipeline échoué !'
        }
    }
}
