pipeline {
    agent any



stages{
        stage('init'){
            steps{
                echo 'initialization...'
            }
        }
		
        stage('Build'){
            
            steps {
                bat 'mvn clean package'              
            }
        }
        stage('upload to artifactory'){
            steps{
               bat 'docker build -t payment'
            }
        }
       
      

}
}