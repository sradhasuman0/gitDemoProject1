pipeline {
     agent any
     
     stages {
       stage ('Compile Stage') {
            steps {
              
                           
                     sh '''
              cd webpage
              mvn clean install
    '''
               }
            }
         }
      }
          
