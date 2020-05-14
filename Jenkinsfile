pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               sh 'mvn test -P parallel'
               echo 'This is a minimal pipeline.'
            }
        }
    }
}
