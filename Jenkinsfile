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
               bat 'docker build . -t payment'
            }
        }
       
	   stage('push image to docker hub'){
            
            steps {
                sh 'docker login   -u sk6785 -p Sandeep@123'
				sh 'docker tag payment sk6785/payment:1.0'
				sh 'docker push  sk6785/payment:1.0'
				
            }
        }
      

}
}