pipeline{
      agent any
      
      stages{

         stage('Compile Stage'){         
             steps {             
                  withMaven(maven: 'maven_3_6_2') {
                        sh 'mvn clean install'
                  }             
             }         
         }
         stage('Test Stage'){         
             steps {             
                  withMaven(maven: 'maven_3_6_2') {
                        sh 'mvn clean test'
                  }             
             }         
         }
         stage('Cucumber Reports'){         
             steps {
                 cucumber buildStatus: "UNSTABLE",
                 fileIncludePattern: "**/cucumber.json",
                 jsonReportDirectory: 'target'
             }         
         }
      
      }

}