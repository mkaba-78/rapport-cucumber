pipeline{
      agent any

      stages{

         stage('Compile Stage'){
             steps {

                        sh "D:\maven\apache-maven-3.6.2-bin\apache-maven-3.6.2\bin\mvn clean install"

             }         
         }
         stage('Test Stage'){         
             steps {

                         sh "D:\maven\apache-maven-3.6.2-bin\apache-maven-3.6.2\bin\mvn clean test"

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
