pipeline {
    agent any
 
    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from GitHub
                script {
                    git 'https://github.com/darshini2000/firstjava.git'
                }
            }
        }
 
        stage('Build and Execute Java File') {
            steps {
                // Compile and run the Java file
                script {
                    sh 'javac abc.java'
                    sh 'java abc'
                }
            }
        }
    }
}
