pipeline{
      agent any

      stages{
         def mvnHome = tool name: 'maven', type: 'maven'
         stage('Compile Stage'){
             steps {
                   sh "${mvnHome}/bin/mvn clean install"
             }         
         }
         stage('Test Stage'){         
             steps {
                    sh "${mvnHome}/bin/mvn clean install"
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