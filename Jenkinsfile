pipeline {
    agent any

    stages {
         stage('Compile-Package'){
    
      def mvnHome =  tool name: 'Maven_Home', type: 'maven'   
      sh "${mvnHome}/bin/mvn package"
   }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven_Home') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'Maven_Home') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
