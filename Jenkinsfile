pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven1') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven1') {
                    sh 'mvn test'
                }
            }
        }

        stage('Sonarqube') {
        ws('/Users/karthickchandramohan/.jenkins/workspace/pip2') {
            environment {
                scannerHome = tool 'Sonar'
            }
            steps {
                withSonarQubeEnv('sonar') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
                timeout(time: 10, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
            }
        }
    }
}
