node{
        
         stage('Compile Stage'){
                   def mvnHome = tool name: 'maven', type: 'maven',
                   sh "${mvnHome}/bin/mvn clean install"
                 
         }
         stage('Test Stage'){         
                    def mvnHome = tool name: 'maven', type: 'maven',
                    sh "${mvnHome}/bin/mvn clean install"                 
         }
         stage('Cucumber Reports'){         
             steps {
                 cucumber buildStatus: "UNSTABLE",
                 fileIncludePattern: "**/cucumber.json",
                 jsonReportDirectory: 'target'
             }         
         }
}
