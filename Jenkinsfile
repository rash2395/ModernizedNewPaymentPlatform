pipeline {
    agent any



stages{
        stage('init'){
            steps{
                echo 'initialization...'
            }
        }
        stage('compile'){
            steps{
                bat 'mvn clean compile' 
            }
        }
		
		
        stage('Build'){
            
            steps {
                bat 'mvn clean package'              
            }
        }
        stage('upload to artifactory'){
            steps{
                rtUpload (
                    serverId: 'jenkins-artifactory-server',
                    spec: '''{
                        "files": [
                            {
                                "pattern": "./target/*NewPayment*.jar",
                                "target": "libs-snapshot-local/payemnt-jar-copy/"
                            }
                                ]
                        }''',
 
                    // Optional - Associate the uploaded files with the following custom build name and build number,
                    // as build artifacts.
                    // If not set, the files will be associated with the default build name and build number (i.e the
                    // the Jenkins job name and number).
                    buildName: 'JFrog',
                    buildNumber: env.BUILD_NUMBER
				)
            }
        }
       
      

}
}