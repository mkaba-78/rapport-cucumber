pipeline{
      agent any
      
      stages{
         
         stage('Compile Stage'){         
             steps {  
                        def mvnHome = tool name: 'maven', type: 'maven',
                        sh "${mvnHome}/bin/mvn clean install"                           
             }         
         }
         stage('Test Stage'){         
             steps {      
                        def mvnHome = tool name: 'maven', type: 'maven',
                        sh "${mvnHome}/bin/mvn clean test"
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
